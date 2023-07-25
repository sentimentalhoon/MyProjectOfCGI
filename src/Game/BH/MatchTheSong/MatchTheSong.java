package Game.BH.MatchTheSong;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.mariadb.jdbc.internal.io.TraceObject;

import Account.Account;
import Game.BH.MatchTheSong.Controller.Etcaudio;
import Game.BH.MatchTheSong.Controller.MatchTheSongController;
import Game.BH.MatchTheSong.Controller.MatchTheSongField;
import Game.BH.MatchTheSong.Controller.Song;
import Utils.ConsoleColor;
import Utils.CountKorean;
import Utils.SC;
import javazoom.jl.player.MP3Player;

public class MatchTheSong extends CountKorean {
    private static MatchTheSong _instance = null;

    ArrayList<String> etcFileName = new ArrayList<String>();
    private int countSpace = 115;

    public static MatchTheSong getInstance() {
        if (_instance == null) {
            _instance = new MatchTheSong();
        }
        return _instance;
    }

    public void gameStart(Account account) {
        Scanner sc = SC.getScanner();
        MatchTheSongField matchTheSongField = MatchTheSongController.getInstance().getSong();
        List<Song> songs = matchTheSongField.getSongs();
        List<Etcaudio> etcAudio = matchTheSongField.getEtcaudio();
        Boolean[] songNumber = new Boolean[matchTheSongField.getSongs().size()];

        Random random = new Random();

        MP3Player mp3Player = new MP3Player();
        String etcFilePath = "data\\audiobook\\etc\\";
        int selectNumSong = 0, questionNo = 0;
        while (true) {
            countSpace(15);

            println("├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤");

            try {
                countSpace(15);

                println(String.format("%s", countKorean(countSpace, "    사용자님은 몇곡을 플레이할지 선택하여 주시기 바랍니다.")));
                countSpace(3);
                playMusic(mp3Player, etcFilePath + "곡수를_선택.mp3");
                Thread.sleep(2500);
                isMp3PlayerStop(mp3Player);
                print(String.format("│%s", "    선택 >>    "));
                try {
                    selectNumSong = sc.nextInt();
                } catch (Exception e) {
                    countSpace(2);
                    print(String.format("│%s│\n", countKorean(countSpace, "    숫자만 입력하여 주시기 바랍니다.")));
                    countSpace(2);
                    continue;
                } finally {
                    sc.nextLine();
                }
                if (selectNumSong > songs.size()) {
                    countSpace(2);
                    print(String.format("│%s│\n",
                            countKorean(countSpace, String.format("    저장된 곡수보다 더 많은 숫자를 입력하였습니다. \n\n최대 입력 숫자 : %d 곡",
                                    songs.size()))));
                    countSpace(2);
                    continue;
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try {
                if (selectNumSong <= 0) {
                    playMusic(mp3Player, etcFilePath + "EndingMessage.mp3");
                    countSpace(15);
                    print(String.format("│%s│\n", countKorean(countSpace, "    모든 곡을 풀었습니다. 이용해 주셔서 감사합니다.")));

                    countSpace(3);
                    print(String.format("│%s│\n", countKorean(countSpace, "    다음에 또 뵈요!!")));
                    countSpace(5);
                    print("└───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘\n");
                    Thread.sleep(6000);
                    isMp3PlayerStop(mp3Player);
                    break;
                }
                int r = random.nextInt(songs.size());

                if (songNumber[r] != null && songNumber[r]) {
                    continue;
                }

                songNumber[r] = true;

                countSpace(15);
                println("├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤");

                countSpace(3);
                print(String.format("│%s│\n", countKorean(countSpace, "    다음의 가사를 듣고 정답을 맞춰 주시기 바랍니다.")));
                countSpace(3);
                playMusic(mp3Player, etcFilePath + "다음_가사를_듣고.mp3");
                Thread.sleep(3000);

                isMp3PlayerStop(mp3Player);

                playMusic(mp3Player, etcFilePath + etcAudio.get(questionNo).getFilename());
                Thread.sleep(3000);
                questionNo++;
                selectNumSong--;
                if (isPlayingMusicQuiz(sc, mp3Player, etcFilePath, etcAudio, songs, r,
                        "첫번째 가사 힌트입니다.", "첫번째_가사_힌트입니다_.mp3", "audio_0_정답입니다.mp3", "audio_0_오답입니다.mp3",
                        songs.get(r).getSong1())) {
                    continue;
                }
                if (isPlayingMusicQuiz(sc, mp3Player, etcFilePath, etcAudio, songs, r,
                        "두번째 가사 힌트입니다.", "두번째_가사_힌트입니다_.mp3", "audio_1_정답입니다.mp3", "audio_1_오답입니다.mp3",
                        songs.get(r).getSong2())) {
                    continue;
                }
                if (isPlayingMusicQuiz(sc, mp3Player, etcFilePath, etcAudio, songs, r,
                        "세번째 가사 힌트입니다.", "세번째_가사_힌트입니다_.mp3", "audio_2_정답입니다.mp3", "audio_2_오답입니다.mp3",
                        songs.get(r).getSong3())) {
                    continue;
                }
                if (isPlayingMusicQuiz(sc, mp3Player, etcFilePath, etcAudio, songs, r,
                        "네번째 가사 힌트입니다.", "네번째_가사_힌트입니다_.mp3", "audio_3_정답입니다.mp3", "audio_3_오답입니다.mp3",
                        songs.get(r).getSong4())) {
                    continue;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Boolean isPlayingMusicQuiz(Scanner sc, MP3Player mp3Player, String etcFilePath, List<Etcaudio> etcAudio,
            List<Song> songs, int r, String hintString, String hintFileString, String oFileString, String xFileString,
            String hintSongFileString) {
        try {
            String inputStringSinger = null;
            String inputStringTitle = null;

            println("├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤");

            isMp3PlayerStop(mp3Player);
            playMusic(mp3Player, etcFilePath + hintFileString);
            countSpace(2);
            println(ConsoleColor.CYAN_BACKGROUND_BRIGHT + String.format("│%s│",
                    countKorean(countSpace, "    " + hintString))
                    + ConsoleColor.RESET);
            countSpace(2);
            Thread.sleep(3000);

            isMp3PlayerStop(mp3Player);
            playMusic(mp3Player, hintSongFileString);
            Thread.sleep(5000);
            print(String.format("%s\n", "    정답을 입력하여 주시기 바랍니다. 모르시면 아무 글자나 입력하여 주시면 됩니다. >>    "));
            countSpace(3);
            print(String.format("%s", "    정답(제목) >>    " + ConsoleColor.YELLOW_BRIGHT));
            inputStringTitle = sc.nextLine().toUpperCase().trim().replace(" ", "");
            print(ConsoleColor.RESET);

            isMp3PlayerStop(mp3Player);
            String songTitle = songs.get(r).getTitle().toUpperCase();
            String singer = songs.get(r).getSinger().toUpperCase();

            if (inputStringTitle != null && songTitle.contains(inputStringTitle)) {
                print(String.format("%s", "    정답(가수) >>    " + ConsoleColor.BLUE_BRIGHT));
                inputStringSinger = sc.nextLine().toUpperCase().trim().replace(" ", "");
                print(ConsoleColor.RESET);

                if (inputStringSinger != null
                        && singer.contains(inputStringSinger)) {
                    playMusic(mp3Player, etcFilePath + oFileString);
                    countSpace(3);
                    // playAscciO(r); 
                    print(String.format("│%s│\n", countKorean(countSpace, "    정답입니다.")));
                    countSpace(3);
                    isMp3PlayerStop(mp3Player);
                    Thread.sleep(1500);
                    return true;
                } else {
                    playMusic(mp3Player, etcFilePath + xFileString);
                    countSpace(3);
                    print(String.format("│%s│\n", countKorean(countSpace, "    틀렸습니다.")));
                    countSpace(3);
                    Thread.sleep(1500);
                }
            } else {
                playMusic(mp3Player, etcFilePath + xFileString);
                countSpace(3);
                print(String.format("│%s│\n", countKorean(countSpace, "    틀렸습니다.")));
                countSpace(3);
                Thread.sleep(1500);
            }
            isMp3PlayerStop(mp3Player);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    // private void playAscciO(int r) {
    //     for (String str : MatchTheSongAscii.getInstance().getOAscii(r)) {
    //         print(String.format("│%s\n", "    " + str));
    //         try {
    //             Thread.sleep(200);
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //     }
    // }

    private void playMusic(MP3Player mp3Player, String filePath) {
        try {
            mp3Player.play(filePath);
        } catch (Exception e) {

        }
    }

    private void isMp3PlayerStop(MP3Player mp3Player) {
        try {
            if (mp3Player.isPlaying()) {
                mp3Player.stop();
            }
        } catch (Exception e) {

        }
    }

    private void countSpace(int j) {
        for (int i = 0; i < j; i++) {
            println(String.format("│%s│", countKorean(countSpace, "")));
        }
    }

    private void println(String str) {
        System.out.println(str);
    }

    private void print(String str) {
        System.out.print(str);
    }
}
