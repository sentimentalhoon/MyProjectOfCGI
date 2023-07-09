package java_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import JavaFestival.ConsoleColor;
import javazoom.jl.player.MP3Player;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class MusicPlayer {
    private static final String relativePath = "java_ex\\data\\";
    private static int mp3PlayNumber = -1;
    private static ArrayList<MusicList> mp3List;
    private static MusicList musicList;
    private static MP3Player mp3Player = new MP3Player();
    private static final int PLAY = 1;
    private static final int NEXT = 2;
    private static final int PREVIOUSLY = 3;
    private static final int STOP = 4;
    private static final int EXIT = 5;

    private static final Type MUSICLIST_TYPE = new TypeToken<List<MusicList>>() {
    }.getType();
    private static Gson gson;

    public static synchronized Gson getInstance() {
        if (gson == null)
            gson = new Gson();
        return gson;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try (FileInputStream fileInputStream = new FileInputStream(relativePath + "musiclist.json")) {
                JsonReader reader = new JsonReader(new InputStreamReader(fileInputStream, "UTF-8"));
                mp3List = getInstance().fromJson(reader, MUSICLIST_TYPE);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            playList();

            while (true) {
                System.out.print("  [1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
                int playType = sc.nextInt();
                System.out.println();
                if (!mp3Play(playType)) {
                    break;
                }
            }
        }
    }

    private static boolean mp3Play(int playType) {
        switch (playType) {
            case PLAY:
                if (mp3Player.isPlaying()) {
                    mp3Player.stop();
                }
                mp3PlayNumber = 0;
                playInformation();
                return true;
            case NEXT: {
                if (mp3Player.isPlaying()) {
                    mp3Player.stop();
                }
                if (mp3PlayNumber >= mp3List.size() - 1) {
                    System.out.println(ConsoleColor.RED_BACKGROUND_BRIGHT + "  #### 다음곡이 없습니다. 처음 곡으로 재생합니다. ####\n"
                            + ConsoleColor.RESET);
                    mp3PlayNumber = 0;
                    playInformation();
                    return true;
                }
                mp3PlayNumber++;
                playInformation();
                return true;
            }
            case PREVIOUSLY: {
                if (mp3Player.isPlaying()) {
                    mp3Player.stop();
                }

                if (mp3PlayNumber <= 0) {
                    System.out.println(ConsoleColor.RED_BACKGROUND_BRIGHT + "  #### 이전곡 없습니다. 처음 곡으로 재생합니다.####\n"
                            + ConsoleColor.RESET);
                    mp3PlayNumber = 0;
                    playInformation();
                    return true;
                }
                mp3PlayNumber--;
                playInformation();
                return true;
            }
            case STOP: {
                if (mp3Player.isPlaying()) {
                    mp3Player.stop();
                }
                mp3PlayNumber = -1;
                System.out.println(
                        "================================================================\n"
                                + "  플레이어가 정지 되었습니다.\n"
                                + "================================================================\n");
                return true;
            }
            case EXIT: {
                if (mp3Player.isPlaying()) {
                    mp3Player.stop();
                }
                System.out.println(
                        "================================================================\n"
                                + "  플레이어가 종료 되었습니다.\n"
                                + "================================================================\n");
                return false;
            }
            default:
                playList();
                return true;
        }
    }

    private static void playInformation() {
        musicList = mp3List.get(mp3PlayNumber);
        mp3Player.play(musicList.getFilePath());
        System.out.printf(
                "======================== 재생 중인 노래 ========================\n"
                        + "  제목 : %20s | 가수 : %20s\n"
                        + "================================================================\n\n",
                musicList.getTitle(), musicList.getSinger());
    }
    

    private static void playList() {
        System.out.println("======================== P L A Y L I S T =======================");
        for (MusicList musicList : mp3List) {
            System.out.printf("  제목 : %20s | 가수 : %20s\n", musicList.getTitle(), musicList.getSinger());
        }
        System.out.println("================================================================\n");
    }
}