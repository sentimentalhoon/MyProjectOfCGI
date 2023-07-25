package Game.Dain;

import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;
import Game.GameDAO.CinemaDataTable;
import Utils.SC;
import javazoom.jl.player.MP3Player;

public class CinemaQuizMain {
	Account account = new Account();
	private static CinemaQuizMain _instance = null;

	public static CinemaQuizMain getInstance() {
		if (_instance == null) {
			_instance = new CinemaQuizMain();
		}
		return _instance;
	}

	public CinemaQuizMain() {
	}

	public void isGameStart(Account _account) {
		account = _account;
		Scanner sc = SC.getScanner();
		// 영화들을 필드로 저장
		ArrayList<CinemaField> cinemasList = new ArrayList<CinemaField>();
		String comPath = "data\\song\\cinema\\";
		MP3Player mp3 = new MP3Player();
	
		
		try {
			cinemasList.add(new CinemaField("    스타워즈      ", 1977,  "The Imperial March", "Carmen Twillie", comPath + "01_Starwars.mp3"));
			cinemasList.add(new CinemaField("     조 커       ", 2019, "Rocken And Roll(Part 2)", "Gary Glitter", comPath + "02_Joker.mp3"));
			cinemasList.add(new CinemaField("    해리포터      ", 2003, "Hedwig's Theme", "Christoph Eschenbach", comPath + "03_HarryPotter.mp3"));
			cinemasList.add(new CinemaField("    라이언킹      ", 1994, "Circle of Life", "Carmen Twillie", comPath + "04_LionKing.mp3"));
			cinemasList.add(new CinemaField("    겨울왕국      ", 2013, "Love is An Open Door", "Kristen Bell", comPath + "05_Frozen.mp3"));
			cinemasList.add(new CinemaField("   캐리비안의해적   ", 2003, "He's a Pirate", "Klaus Badelt", comPath + "06_PiratesOfTheCarribean.mp3"));
			cinemasList.add(new CinemaField("     타이타닉     ", 1997, "My Heart Will Go On", "Celine Dion", comPath + "07_Titanic.mp3"));
			cinemasList.add(new CinemaField("  슈퍼마리오브라더스  ", 2023,"Peaches", "Jack Black", comPath + "08_SuperMarioBrothers.mp3"));
			cinemasList.add(new CinemaField("     알라딘       ", 1992 , "Friend Like Me", "Ne-Yo", comPath + "09_Aladdin.mp3"));
			cinemasList.add(new CinemaField("      레옹       ", 1994, "Shape Of My Heart", "Sting", comPath + "10_Leon.mp3"));
//			cinemasList = CinemaDataTable.getInstance(comPath).getCinemaList();
			mp3.play(comPath + "opening.mp3");

			CinemaAscii.getInstance().openingAsciiArt();
			String line = "  ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n";
			int timeLap = 200; // 시간 간격 (200밀리초)
						
			for (int i = 0; i < line.length(); i++) {
				System.out.print(line.charAt(i));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(
					"                                    로딩 완료!!                                          \n\n");

			try {
				Thread.sleep(200);
				System.out.print("    게임 설명을 보시겠습니까?      ");
				System.out.print("    [1] YES         [2] NO     ");
				System.out.println();
				System.out.println();
				String gameRule = sc.nextLine();
				if (gameRule.equals("1") || gameRule.toLowerCase().equals("y")
						|| gameRule.toLowerCase().equals("yes")) {
					CinemaAscii.getInstance().getExplanation();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				System.out.printf("\n%s\n\n\n", "    게임을 시작하시겠습니까?      " + "[1] YES         [2] NO     ");
				String gameStart = sc.nextLine();
				if (!gameStart.equals("1")) {
					Thread.sleep(timeLap);
					System.out.println();
					System.out.println();
					System.out.println("    왜왜!! 내 게임이 얼마나 재밌는데... ( 게임강제시작!! ) ");
					Thread.sleep(timeLap);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (mp3.isPlaying()) {
				mp3.stop();
			}

			getQuiz(1, sc, cinemasList, mp3, comPath, "01_other.mp3");
			getQuiz(2, sc, cinemasList, mp3, comPath, "02_other.mp3");
			getQuiz(3, sc, cinemasList, mp3, comPath, "03_other.mp3");
			getQuiz(4, sc, cinemasList, mp3, comPath, "04_other.mp3");
			getQuiz(5, sc, cinemasList, mp3, comPath, "05_other.mp3");
			getQuiz(6, sc, cinemasList, mp3, comPath, "06_other.mp3");
			getQuiz(7, sc, cinemasList, mp3, comPath, "07_other.mp3");
			getQuiz(8, sc, cinemasList, mp3, comPath, "08_other.mp3");
			getQuiz(9, sc, cinemasList, mp3, comPath, "09_other.mp3");
			getQuiz(10, sc, cinemasList, mp3, comPath, "10_other.mp3");

//			System.out.println(
//					"       ================================================================================================================\n");
//			Thread.sleep(200);
//			System.out.println();
//			Thread.sleep(200);
//			System.out.println(
//					"              MOVIE NAME                   YEAR                        TITLE                         ARTIST    ");
//			Thread.sleep(200);
//			System.out.println();
//			System.out.println();
//			System.out.println();
//			Thread.sleep(200);
//			for (int i = 0; i < cinemasList.size(); i++) {
//				String mname = cinemasList.get(i).getMovieNameKR();
//				int year = cinemasList.get(i).getYear();
//				String title = cinemasList.get(i).getMovieSongName();
//				String artist = cinemasList.get(i).getMovieSongArtist();
//				System.out.println("          " + mname + "               " + year + "                " + title
//						+ "             " + artist);
//				System.out.println("\n\n");
//				Thread.sleep(1000);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int inputNum(Scanner sc) {
		System.out.println("      [1] 음악 재생     [2] 그림 힌트!     [3] 다른 구간 듣기      [4] 포기하고 다음문제  ");
		int playMusic = 0;
		try {
			playMusic = sc.nextInt();
		} catch (Exception e) {
			System.out.println(" 잘못 입력하셨습니다. ");
		}
		return playMusic;
	}

	private void questions(int n) {
		System.out.printf("\n\n\n\n\n%s\n\n\n",
				"    ================================================================================= \n"
						+ "          ♪(^∇^*) ♩  ♪  ♬   ❁´◡`❁   [ " + n
						+ "번 문제!! ]      ♩  ♪     ♬ ヽ(✿ﾟ▽ﾟ)ノ              \n"
						+ "    ================================================================================= ");
	}

	private boolean answers(int n, Scanner sc, ArrayList<CinemaField> cinemasList, MP3Player mp3,
			String comPath) {
		System.out.println("     정답을 입력하세요(한국어로) >>");
		String movieName = sc.next();

		if (movieName.equals(cinemasList.get(n - 1).getMovieNameKR().trim())) {
			if (mp3.isPlaying()) {
				mp3.stop();
			}
			System.out.println("     SUCCESS!      정 답 입 니 다!! ");
			System.out.println();
			System.out.println("     다음 문제로 넘어갑니다...     ");
			return true;
		} else {
			if (mp3.isPlaying()) {
				mp3.stop();
			}
			System.out.println("     Fail...!      틀 렸 습 니 다... ");
			System.out.println();
		}

		return false;
	}

	private void getQuiz(int number, Scanner sc, ArrayList<CinemaField> cinemasList,
			MP3Player mp3, String comPath, String fileNameString) {
		questions(number);
		while (true) {
			int playMusic = inputNum(sc);
			if (playMusic == 0) {
				System.out.println("     다시 선택하여 주시기 바랍니다....     ");
				continue;
			}
			if (playMusic == 1) {
				mp3.play(cinemasList.get(number - 1).getMovieSongFileName());
			} else if (playMusic == 2) {
				CinemaAscii.getInstance().getCinemaPosterAsciiArt(number);
			} else if (playMusic == 3) {
				mp3.play(comPath + fileNameString);
			} else if (playMusic == 4) {
				System.out.println("     다음 문제로 넘어갑니다...     ");
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				break;
			}
			if (answers(number, sc, cinemasList, mp3, comPath))
				break;
		}
		if (mp3.isPlaying()) {
			mp3.stop();
		}
	}
}