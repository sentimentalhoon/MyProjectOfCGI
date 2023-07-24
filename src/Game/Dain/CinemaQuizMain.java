package Game.Dain;

import java.util.ArrayList;
import java.util.Scanner;

import Game.GameDAO.CinemaDataTable;
import Game.GameDAO.CinemaQuizDataTable;
import Main.Server;
<<<<<<< HEAD
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

	public CinemaQuizMain(Account account) {
		this.account = account;
	}

	public void isGameStart() {
		Server.getInstance().isStart();
		Scanner sc = SC.getScanner();
=======
import javazoom.jl.player.MP3Player;

public class CinemaQuizMain {

	public static void main(String[] args) {
		Server.getInstance().isStart();
		Scanner sc = new Scanner(System.in);
>>>>>>> refs/remotes/origin/main
		// 영화들을 필드로 저장
		ArrayList<CinemaField> cinemasList = new ArrayList<CinemaField>();
		String comPath = "data\\song\\cinema\\";
		MP3Player mp3 = new MP3Player();

		try {
			cinemasList = CinemaDataTable.getInstance(comPath).getCinemaList();
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
			System.out.println("                                    로딩 완료!!                                          \n\n");

			try {
				Thread.sleep(200);
				System.out.print("    게임 설명을 보시겠습니까?      ");
				System.out.print("    [1] YES         [2] NO     ");
				System.out.println();
				System.out.println();
				String gameRule = sc.nextLine();
				if (gameRule.equals("1") || gameRule.toLowerCase().equals("y")|| gameRule.toLowerCase().equals("yes")) {
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

			if (mp3.isPlaying()) {
				mp3.stop();
			}
<<<<<<< HEAD
=======
			questions(4);
			while (true) {
				int playMusic = inputNum(sc);
				if (playMusic == 1) {
					mp3.play(cinemasList.get(3).getMovieSongFileName());
				} else if (playMusic == 2) {
					CinemaAscii.getInstance().getCinemaPosterAsciiArt(4);
				} else if (playMusic == 3) {
					mp3.play(comPath + "04_other.mp3");
				} else if (playMusic == 4) {
					System.out.println("     다음 문제로 넘어갑니다...     ");
					break;
				}
				if (answers(4, sc, cinemasList, mp3, comPath))
					break;
			}
			questions(5);
			while (true) {
				int playMusic = inputNum(sc);
				if (playMusic == 1) {
					mp3.play(cinemasList.get(4).getMovieSongFileName());
				} else if (playMusic == 2) {
					CinemaAscii.getInstance().getCinemaPosterAsciiArt(5);
				} else if (playMusic == 3) {
					mp3.play(comPath + "05_other.mp3");
				} else if (playMusic == 4) {
					System.out.println("     다음 문제로 넘어갑니다...     ");
					break;
				}
				if (answers(5, sc, cinemasList, mp3, comPath))
					break;
			}
			questions(6);
			while (true) {
				int playMusic = inputNum(sc);
				if (playMusic == 1) {
					mp3.play(cinemasList.get(5).getMovieSongFileName());
				} else if (playMusic == 2) {
					CinemaAscii.getInstance().getCinemaPosterAsciiArt(6);
				} else if (playMusic == 3) {
					mp3.play(comPath + "06_other.mp3");
				} else if (playMusic == 4) {
					System.out.println("     다음 문제로 넘어갑니다...     ");
					break;
				}
				if (answers(6, sc, cinemasList, mp3, comPath))
					break;
			}
			questions(7);
			while (true) {
				int playMusic = inputNum(sc);
				if (playMusic == 1) {
					mp3.play(cinemasList.get(6).getMovieSongFileName());
				} else if (playMusic == 2) {
					CinemaAscii.getInstance().getCinemaPosterAsciiArt(7);
				} else if (playMusic == 3) {
					mp3.play(comPath + "07_other.mp3");
				} else if (playMusic == 4) {
					System.out.println("     다음 문제로 넘어갑니다...     ");
					break;
				}
				if (answers(7, sc, cinemasList, mp3, comPath))
					break;
			}
			questions(8);
			while (true) {
				int playMusic = inputNum(sc);
				if (playMusic == 1) {
					mp3.play(cinemasList.get(7).getMovieSongFileName());
				} else if (playMusic == 2) {
					CinemaAscii.getInstance().getCinemaPosterAsciiArt(8);
				} else if (playMusic == 3) {
					mp3.play(comPath + "08_other.mp3");
				} else if (playMusic == 4) {
					System.out.println("     다음 문제로 넘어갑니다...     ");
					break;
				}
				if (answers(8, sc, cinemasList, mp3, comPath))
					break;
			}
			questions(9);
			while (true) {
				int playMusic = inputNum(sc);
				if (playMusic == 1) {
					mp3.play(cinemasList.get(8).getMovieSongFileName());
				} else if (playMusic == 2) {
					CinemaAscii.getInstance().getCinemaPosterAsciiArt(9);
				} else if (playMusic == 3) {
					mp3.play(comPath + "09_other.mp3");
				} else if (playMusic == 4) {
					System.out.println("     다음 문제로 넘어갑니다...     ");
					break;
				}
				if (answers(9, sc, cinemasList, mp3, comPath))
					break;
			}
			questions(10);
			while (true) {
				int playMusic = inputNum(sc);
				if (playMusic == 1) {
					mp3.play(cinemasList.get(9).getMovieSongFileName());
				} else if (playMusic == 2) {
					CinemaAscii.getInstance().getCinemaPosterAsciiArt(10);
				} else if (playMusic == 3) {
					mp3.play(comPath + "10_other.mp3");
				} else if (playMusic == 4) {
					System.out.println("     다음 문제로 넘어갑니다...     ");
					break;
				}
				if (answers(10, sc, cinemasList, mp3, comPath))
					break;
			}
			
			 if (mp3.isPlaying()) {
			 mp3.stop();
			 }


			Thread.sleep(100);
			System.out.println();
			Thread.sleep(100);
			System.out.println();
			Thread.sleep(100);
			System.out.println();
			Thread.sleep(100);
			System.out.println();
			Thread.sleep(100);
			System.out.println();
			Thread.sleep(100);
			System.out.println();
			Thread.sleep(100);
>>>>>>> refs/remotes/origin/main

			System.out.println(
					"       ================================================================================================================\n");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println(
					"              MOVIE NAME                   YEAR                        TITLE                         ARTIST    ");
			Thread.sleep(200);
			System.out.println();
			System.out.println();
			System.out.println();
			Thread.sleep(200);
			for (int i = 0; i < cinemasList.size(); i++) {
				String mname = cinemasList.get(i).getMovieNameKR();
				int year = cinemasList.get(i).getYear();
				String title = cinemasList.get(i).getMovieSongName();
				String artist = cinemasList.get(i).getMovieSongArtist();
				Thread.sleep(200);
				System.out.println();
				Thread.sleep(200);
				System.out.println();
				Thread.sleep(200);
				System.out.println();
				Thread.sleep(200);
				System.out.println("          " + mname + "               " + year + "                " + title
						+ "             " + artist);
				Thread.sleep(200);
				System.out.println();
				Thread.sleep(200);
				System.out.println();
				Thread.sleep(200);
				System.out.println();
				Thread.sleep(200);
			}
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
			System.out.println("     SUCCESS!      정 답 입 니 다!! ");
			System.out.println();
			mp3.play(comPath + "Verygood.mp3");
			System.out.println();
			System.out.println("     다음 문제로 넘어갑니다...     ");
			// insertQuizResult("호구", "o", n);
			// break;
			return true;
		} else {
			System.out.println("     Fail...!      틀 렸 습 니 다... ");
			System.out.println();
			mp3.play(comPath + "Fail.mp3");
			// insertQuizResult("호구", "x", n);
		}
		return false;
	}

	private void getQuiz(int number, Scanner sc, ArrayList<CinemaField> cinemasList,
			MP3Player mp3, String comPath, String fileNameString) {
		questions(number);
		while (true) {
			int playMusic = inputNum(sc);
			if (playMusic == 1) {
				mp3.play(cinemasList.get(number - 1).getMovieSongFileName());
			} else if (playMusic == 2) {
				CinemaAscii.getInstance().getCinemaPosterAsciiArt(number);
			} else if (playMusic == 3) {
				mp3.play(fileNameString);
			} else if (playMusic == 4) {
				System.out.println("     다음 문제로 넘어갑니다...     ");
				break;
			}
			if (answers(number, sc, cinemasList, mp3, comPath))
				break;
		}
	}
}