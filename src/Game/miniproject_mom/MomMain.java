package Game.miniproject_mom;

import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;
import Game.BH.MatchTheSong.MatchTheSong;
import Game.Dain.CinemaField;
import Game.Dain.CinemaQuizMain;
import Game.giwon.BlackjackMain;
import Game.hero.fuckara.fuckMain;
import Utils.SC;
import javazoom.jl.player.MP3Player;

public class MomMain {
	Account account = new Account();
	private static  MomMain _instance = null;

	public static  MomMain getInstance() {
		if (_instance == null) {
			_instance = new MomMain();
		}
		return _instance;
	}

	public MomMain() {
	}

	public void isStart(Account _account) {
		account = _account;
		Scanner sc = SC.getScanner();
		String comPath = "data\\song\\Mom\\";
		MP3Player mp3 = new MP3Player();
		MomAscii m = new MomAscii();
		ArrayList<CinemaField> cinemasList = new ArrayList<CinemaField>();

		
		int pickWeapon = 0;
		int pickClass = 0;
		people p = new people();
		people Drakaina = new people("Drakaina", 3500, "fireRage", "thunderLightening");
		people Druid = new people("Druid", 2500, "야생의영혼");
		people Warlock = new people("Warlock", 2500, "거부할수없는유혹");
		people Paladin = new people("Paladin", 2500, "빛의심판");
		people Human = new people("Human", 2500, "용감무쌍");

		mp3.play(comPath+"gogogame.mp3");
		try {

			System.out.printf("\n\n");
			System.out.print(
					" 		==============================================================================\r\n");
			Thread.sleep(200);
			System.out.printf("\n\n\n\n");
			System.out.println(m.gameTitle());
			System.out.printf("\n\n");
			Thread.sleep(200);
			System.out.print(
					" 		==============================================================================\r\n");
			Thread.sleep(200);
			System.out.print("		                         	★ 심 부 름 어 드 벤 처 ★                             \r\n");
			Thread.sleep(200);

			System.out.print("		                        	    LOADING....                             \r\n"); // 10

			String line = "		■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	\r\n";
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
					"		                                    로딩 완료!!                                          ");
			System.out.println();
			System.out.println();
			Thread.sleep(1000);

			// 회원가입
			// 로그인

			// 게임 시작
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"gameOpening.mp3");
			System.out.println("		게임을 시작하시겠습니까?");
			System.out.println("		[1] 네				[2] 아니오");
			int gameStart = sc.nextInt();
			if (gameStart == 1) {

			}

			////////////////////////////////////////// 1. chapter 엄마와의 대화

			System.out.println("\n\n\n\n");
			System.out.println(m.home());
			System.out.println("\n\n\n\n");
			Thread.sleep(200);
			System.out.println("			평화로운 일요일 오후");
			Thread.sleep(200);
			System.out.println("			[나] 오늘은 비도 온다는데 집에서 겜이나 한판 해야 겠다"); 
			System.out.println();
			Thread.sleep(200);
			System.out.println("			넘어가기 [0] ");
			int c1e1 = sc.nextInt();
			if (c1e1 == 0) {
			}

			System.out.println("\n\n\n\n");
			System.out.println(m.mother());
			System.out.println("\n\n\n\n");
			System.out.println("			[엄마] 영웅아, 일어나! 마트 가서 두 부 한 모 좀 사다 주렴. ");
			Thread.sleep(200);
			System.out.println("			[1]  (아.. 귀찮은데) 못들은 체 한다.          [2] 네 알겠어요 엄마!    ");

			int c1e2 = sc.nextInt();
			if (c1e2 == 1) {
				System.out.println("			(경고) 용돈이 깎였습니다.");
				Thread.sleep(200);
				System.out.println("			[엄마] 김영웅! 오늘 저녁은 없을 줄 알아!! 빨리 갔다 와");
				Thread.sleep(200);
				System.out.println("			[영웅이] (궁시렁 궁시렁) 다음부터는 쿠팡에서 미리 시키세용... ");

				System.out.println();
				Thread.sleep(200);
				System.out.println("			넘어가기 [0] ");
				int c1e3 = sc.nextInt();
				if (c1e3 == 0) {
				}

			} else if (c1e2 == 2) {
			}

			// 무기선택
			Thread.sleep(1000);
			System.out.println("			(주섬 주섬) 나갈 준비를 한다. 뭘 가지고 갈까? ");
			System.out.println("			[1] 우산 		[2] 건틀렛 	[3] ? 	[4] 해골검");

			int c1e4 = sc.nextInt();
			if (c1e4 == 1) {
				pickWeapon = 1;

				System.out.println("\n\n");
				System.out.println(m.umbrella());
				System.out.println("\n\n");
				System.out.println();
				System.out.println("			[비닐우산]을 챙겼다. "); 
			} else if (c1e4 == 2) {
				pickWeapon = 2;

				System.out.println("\n\n");
				System.out.println(m.gauntlet());
				System.out.println("\n\n");
				System.out.println();
				System.out.println("			[건틀렛]을 챙겼다."); 
			} else if (c1e4 == 3) {
				pickWeapon = 3;
				System.out.println("			[?]를 골랐다. 뭐가 나올까....");
				Thread.sleep(500);
				System.out.println("			두구두구 두구두구... ");
				Thread.sleep(500);

				System.out.println("\n\n");
				System.out.println(m.lightsaver());
				System.out.println("\n\n");
				System.out.println();
				System.out.println("			[광선검]이 나왔다! ");
				System.out.println("			[광선검]을 챙겼다. "); 
			} else if (c1e4 == 4) {
				pickWeapon = 4;

				System.out.println("\n\n");
				System.out.println(m.sword());
				System.out.println("\n\n");
				System.out.println();
				System.out.println("			[해골검]을 챙겼다. "); 

			}

			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int c1e5 = sc.nextInt();
			if (c1e5 == 0) {
			}
			
			System.out.println("\n\n");
			System.out.println(m.headphone());
			System.out.println("\n\n");
			Thread.sleep(200);
			System.out.println("			헤드폰을 착용한다. 무슨 노래를 들을까? ");
			System.out.println("			[1] 헤비메탈     [2] 케이팝     [3] 아이유     [4] 힙합 ");
			int c1e6 = sc.nextInt();
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			if (c1e6 == 1) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"heavymetal.mp3");
				System.out.println("			♩	♪	♬ 둠 칫 둠 칫 ~ ♩	♪	♬ ");
				System.out.println("			음악은 역시 헤비메탈이지~ 기운 솟아난다!! ");
			} else if (c1e6 == 2) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"kpop.mp3");
				System.out.println("			♩	♪	♬ 둠 칫 둠 칫 ~ ♩	♪	♬ ");
				System.out.println("			국뽕 케이팝이 최고야~ 너무 좋아서 춤이 절로 나오네");
			} else if (c1e6 == 3) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"iu.mp3");
				System.out.println("			♩	♪	♬ 둠 칫 둠 칫 ~ ♩	♪	♬ ");
				System.out.println("			역시 음악은 아이유지~ 킹정~?");
			} else if (c1e6 == 4) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"hiphop.mp3");
				System.out.println("			♩	♪	♬ 둠 칫 둠 칫 ~ ♩	♪	♬ ");
				System.out.println("			역시 힙합원탑.. 요즘 활동 안하남...  ");
			} else {

			}

			Thread.sleep(200);
			System.out.println();
			System.out.println("			[영웅이] 엄마!! 다녀오겠습니다~ ");

			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int c1e7 = sc.nextInt();
			if (c1e7 == 0) {
			}

			System.out.println("\n\n");
			System.out.println(m.leavingHome());
			System.out.println("\n\n");
			Thread.sleep(200);
			System.out.println("			집을 나선다! 마트로 출발~! ");

			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int c1e8 = sc.nextInt();
			if (c1e8 == 0) {
			}

			///////////////////////////////////// chapter.2 언덕 지나는데 할머니 만남

			System.out.println("\n\n");
			System.out.println(m.wagonGrandma());
			System.out.println("\n\n");
			Thread.sleep(200);
			System.out.println("			힘들게 리어카를 끌고 있는 할머니가 보인다!");
			Thread.sleep(2000);
			System.out.println("			[할머니] 학생... 나 좀 도와 줘. ");
			Thread.sleep(2000);
			System.out.println("			[1] 못본 척 한다.		[2] 도와 드린다. ");
			int c2e1 = sc.nextInt();
			if (c2e1 == 1) {
				System.out.println("			쯧쯧... 고얀놈... 요즘 것들은....");

			} else if (c2e1 == 2) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"gogogame.mp3");
				System.out.println("			[미니게임1] 할머니 도와드리기 - 3초에 가깝게 엔터치기! ");

				// 미니게임1. 10초에 가깝게 엔터치기 (할머니 도와드리기)

				long a = 0;
				long b = 0;
				double result1 = 0;
				System.out.print("			할머니가 먼저 시작합니다. 할머니 라고 입력하세요. >>> ");
				String user1 = sc.next();

				System.out.println("			" + user1 + "님 시작하려면 <Enter>를 누르세요.");
				sc.nextLine();
				sc.nextLine();
				a = System.currentTimeMillis();

				System.out.println("			3초가 된 것 같으면 <Enter>를 누르세요.");
				sc.nextLine();
				b = System.currentTimeMillis();

				result1 = (double) ((b - a) * 0.001);

				System.out.println("			종료시간 : " + result1 + "초");

				long c = 0;
				long d = 0;
				double result2 = 0;

				System.out.print("			내 차례입니다. 내 이름을 입력하세요! >>> ");
				String user2 = sc.next();

				System.out.println("			" + user2 + "님 시작하려면 <Enter>를 누르세요.");
				sc.nextLine();
				sc.nextLine();
				c = System.currentTimeMillis();

				System.out.println("			3초가 된 것 같으면 <Enter>를 누르세요.");
				sc.nextLine();
				d = System.currentTimeMillis();

				result2 = (double) ((d - c) * 0.001);

				System.out.println("			종료시간 : " + result2 + "초");

				if (Math.abs(result1 - 10) < Math.abs(result2 - 10)) {
					System.out.println(
							"			" + user1 + "			님이" + Math.abs(result1 - result2) + "차이로 승리하셨습니다!!");
					System.out.println("			할머니 도와드리기 실패!");
					System.out.println("			[할머니] 젊은 사람이 이렇게 힘이 없어서야... 약골이구만... ");
				} else {
					System.out.println(
							"			" + user2 + "			님이" + Math.abs(result2 - result1) + "차이로 승리하셨습니다!!");
					System.out.println("			[할머니] 학생 고맙네... ");
				}
			}
			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int c2e2 = sc.nextInt();
			if (c2e2 == 0) {
			}
			///////////////////////////////////// chapter.3 주택가 지나는데 도둑 만남.

			// 미니게임2. 블랙잭 게임(도둑잡기)
			System.out.println("\n\n");
			System.out.println(m.theif());
			System.out.println("\n\n");
			Thread.sleep(200);
			System.out.println("			앗, 도둑이 출몰했다.! ");
			Thread.sleep(200);
			System.out.println("			[도둑] 홍홍홍 나 잡아봐랑~ 뿌잉뿌잉 ");
			Thread.sleep(200);
			System.out.println();
			System.out.println("			[영웅이] 아.... 말투 진짜 킹받네.... 내가 꼭 잡아 주마!");
			Thread.sleep(200);
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			System.out.println("			[미니게임2] 도둑잡기 챌린지 - 행운의 블랙잭!");
			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int nextc3c0 = sc.nextInt();
			if (nextc3c0 == 0) {
			}
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			int beforeScore = account.get_totalpoint();
			try {
				BlackjackMain.BlackGameStart(_account);				
			} catch (Exception e) {				
			}
			if(account.get_totalpoint()>beforeScore) {
				
				System.out.println("[도둑] 을 잡았다! ");
				Thread.sleep(200);
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int nextc3c1 = sc.nextInt();
				if (nextc3c1 == 0) {
				}

			} else {
				System.out.println("[도둑] 홍홍홍 개허접~!....");
				Thread.sleep(200);
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int nextc3c1 = sc.nextInt();
				if (nextc3c1 == 0) {
				}
			}


			///////////////////////////////////// chapter.4 아름다운 강변에서
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"gameOpening.mp3");
			System.out.println("\n\n");
			System.out.println(m.firework());
			System.out.println("\n\n");
			Thread.sleep(200);
			System.out.println("			강변을 지나간다. 앗, 저게 뭐지? ");
			Thread.sleep(2000);
			System.out.println("			불꽃놀이 축제다! 와 너무 아름답다! ");
			Thread.sleep(2000);
			System.out.println();
			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int c4e1 = sc.nextInt();
			if (c4e1 == 0) {
			}

			// 친구 만남!!
			System.out.println("\n");
			System.out.println(m.runIntoFriend());
			System.out.println("\n");
			Thread.sleep(200);
			System.out.println("			불꽃놀이를 보고 있는 친구 [인프제]를 만났다!");
			Thread.sleep(200);
			System.out.println("			[인프제]에게 말을 건다");
			Thread.sleep(200);
			System.out.println("			[영웅이] Hey~ ");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("			넘어가기 [0] ");
			int c4e2 = sc.nextInt();
			if (c4e2 == 0) {
			}

			System.out.println(m.infj());
			System.out.println("\n");
			Thread.sleep(200);
			System.out.println("			[인프제] 의 낯빛이 급격히 어두워졌다. ");
			Thread.sleep(1000);
			System.out.println("			[영웅이] (쫑알쫑알) (주절주절) ");
			Thread.sleep(1000);
			System.out.println("			[영웅이] 요기서 모해~ 잘됐다~ 나랑 놀자! 마트 같이 가자 ");
			Thread.sleep(1000);
			System.out.println("			[인프제] 아... (슈발) 엔프피 영웅이 때문에 기빨린다.... 빨리 집에 가고 싶은데(흑흑)");
			Thread.sleep(1000);
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"gogogame.mp3");
			System.out.println("			[미니게임3] 친구랑 설득해서 같이 마트 가기~! - 친구가 좋아하는 영화맞추기 !!");
			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int nextc3c1 = sc.nextInt();
			if (nextc3c1 == 0) {
			}
			
			int beforeScore1 = account.get_totalpoint();
			try {
				CinemaQuizMain.getInstance().isGameStart(account);				
			} catch (Exception e) {
				
			}
				System.out.println("\n\n");
				System.out.println("\n\n");
				System.out.println(m.withfriend());
				System.out.println("\n\n");
				Thread.sleep(200);
				System.out.println("			친구가 좋아하는 영화 맞추기 퀴즈 대성공!");
				System.out.println();
				Thread.sleep(200);
				System.out.println("			[인프제] (헐~ 감동이야...) 평소에 날 이렇게 생각해주고 있었다니....");
				Thread.sleep(200);
				System.out.println("			친구와 함께 마트에 간다.");
				Thread.sleep(200);

			System.out.println();
			System.out.println("			넘어가기 [0] ");
			sc.nextInt();
			// 미니게임3. 영친구가 좋아하는 영화맞추기5문제만.
			// 졌으면 [친구] "헐.. 나에 대해 하나도 모르다닝 실망이얌!!!"(친구 삐져서 집에 감)
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"gameOpening.mp3");

			///////////////////////////////////// chapter.5 마트에서

			System.out.println("\n\n\n");
			System.out.println(m.store());
			System.out.println("\n\n\n");
			Thread.sleep(200);
			System.out.println("			마트에 도착했다!");
			System.out.println("			두부를 사러 가자!");
			System.out.println();
			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int c5e1 = sc.nextInt();
			if (c5e1 == 0) {
			}

			System.out.println("\n\n\n");
			System.out.println(m.cart());
			System.out.println("\n\n\n");
			Thread.sleep(200);
			System.out.println("			두부를 카트에 담았다.");
			Thread.sleep(200);
			System.out.println();
			System.out.println("			다른 것도 살까?");
			System.out.println("			[1] 콘푸로스트				[2] 친구가 갖고싶어 하는 꽃머리핀				");
			System.out.println("			[3] 범상치않은 에그몽 초콜릿        		[4] 음료수 ");

			int c5e2 = sc.nextInt();
			if (c5e2 == 1) {
				System.out.println("\n\n\n");
				System.out.println(m.cereal());
				System.out.println("\n\n\n");
				Thread.sleep(200);
				System.out.println("			콘푸로스트를 카트에 담았다.");
				System.out.println("			계산대로 가자");
				pickClass = 1;

			} else if (c5e2 == 2) {
				System.out.println("\n\n\n");
				System.out.println(m.hairpin());
				System.out.println("\n\n\n");
				Thread.sleep(200);
				System.out.println("			꽃머리핀을 카트에 담았다.");
				System.out.println("			계산대로 가자");
				pickClass = 2;

			} else if (c5e2 == 3) {
				System.out.println("\n\n\n");
				System.out.println(m.eggmong());
				System.out.println("\n\n\n");
				Thread.sleep(200);
				System.out.println("			범상치 않은 에그몽을 카트에 담았다.");
				System.out.println("			계산대로 가자");
				pickClass = 3;

			} else if (c5e2 == 4) {
				System.out.println("\n\n\n");
				System.out.println(m.soju());
				System.out.println("\n\n\n");
				Thread.sleep(200);
				System.out.println("			음료수를 카트에 담았다.");
				System.out.println("			계산대로 가자");
				pickClass = 4;
			}

			System.out.println();
			Thread.sleep(200);
			System.out.println();
			System.out.println("			넘어가기 [0] ");
			int next52 = sc.nextInt();
			if (next52 == 0) {
			}

			System.out.println("\n");
			System.out.println(m.counter());
			System.out.println("\n");
			Thread.sleep(200);
			System.out.println("			[계산원] 5000원입니다~!");
			System.out.println("			[영웅이] 앗....! 근데.... 지갑이 없다");
			System.out.println("			[영웅이] 어떡하지?");
			System.out.println();
			Thread.sleep(200);
			System.out.println("			넘어가기 [0] ");
			int c5e3 = sc.nextInt();
			if (c5e3 == 0) {
			}

			System.out.println("\n\n");
			System.out.println(m.richGrandma());
			System.out.println("\n\n");
			Thread.sleep(500);
			System.out.println("			아까 수레를 끌던 할머니가 근사한 옷을 입고 나타난다.");
			Thread.sleep(500);
			System.out.println("			[할머니] 아니 자네는.... 아까 그 학생?");
			Thread.sleep(500);
			System.out.println("			[영웅이] 할머니께서 여기 왜...? ");
			Thread.sleep(500);
			System.out.println("			[할머니] 내가 여기 마트 사장이란다~");
			Thread.sleep(500);
			System.out.println("			[영웅이] !!! ");
			Thread.sleep(500);
			System.out.println("			[할머니] 돈 없어? 특별히 기회를 주지... ");
			Thread.sleep(500);
			System.out.println();
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath + "gogogame.mp3");
			System.out.println("			[미니게임4] 바카라 - 이겨서 할머니께 용돈을 받아라!! ");

			// 아까 할머니 도와드렸으면 할머니가 용돈 준다
			// [할머니] 아까는 고마웠네. 옛다 용돈 5만원 FLEX~"
			// [영웅이] 할머니 감사합니다!! "
			// 미니게임 안하고 continue

			// 미니게임 4. 바카랏!
			System.out.println();
			Thread.sleep(200);
			System.out.println("			넘어가기 [0] ");
			sc.nextInt();
			beforeScore = account.get_totalpoint();
			
			try {
				fuckMain.FuckarratGameStart(account);				
			} catch(Exception e) {				
			}
			
			if (account.get_totalpoint() > beforeScore) {
				System.out.println("[할머니] 옛다!! 기분이다!! 5만원 쾌척");				
			} else {
				System.out.println("[할머니] 쯧쯧쯧....");
			}
			
			System.out.println("			넘어가기 [0] ");
			sc.nextInt();
			
			
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"gameOpening.mp3");
			System.out.println("\n\n");
			///////////////////////////////////// chapter.6 집에 가는 길

			System.out.println(m.goingHome());
			Thread.sleep(200);
			System.out.println("			룰루랄라~ 드디어 집으로 가는 길!! 친구와 헤어지고 지름길로 고고");
			System.out.println();
			Thread.sleep(200);
			System.out.println("			넘어가기 [0] ");
			int c6e1 = sc.nextInt();
			if (c6e1 == 0) {
			}

			System.out.println(m.gangster());
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"johnCena.mp3");
			System.out.println("\n");
			Thread.sleep(500);
			System.out.println("			음침한 뒷골목에서 불량배 출몰!!  ");
			Thread.sleep(500);
			System.out.println("			[불량배] 야 너 돈 좀 있냐");
			Thread.sleep(500);
			System.out.println("			[영웅이] (쭈굴) 없는데여... 저 아세여? ");
			Thread.sleep(500);
			System.out.println("			[불량배] 뒤져서 나오면 100원에 한대씩이다 ");
			Thread.sleep(500);
			System.out.println("			[불량배] 살고 싶으면 나랑 진검 승부!! ");
			Thread.sleep(500);
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"gogogame.mp3");
			System.out.println("			[미니게임5] 흥 많은 불량배와 진검승부 - 불량배가 좋아하는 노래맞추기 !! ");
			System.out.println();
			Thread.sleep(500);

			// 아까 도둑 잡았으면(블랙잭 이겼으면) 경찰이 나타나서 도와준다
			// 아까 도둑 못잡았으면 
			// 미니게임5. 노래맞추기
			try {
				MatchTheSong.getInstance().gameStart(account);				
			} catch (Exception e) {				
			}
			
			System.out.println("			넘어가기 [0] ");
			sc.nextInt();

			


			///////////////////////////////////// Final chapter.7 집 앞에서

			// 집이 보인다!

			System.out.println("\n\n\n\n");
			System.out.println(m.home());
			System.out.println("\n\n\n\n");
			Thread.sleep(200);
			System.out.println("			드디어 집이 보인다!!!!");
			Thread.sleep(200);
			System.out.println("			오늘 너므 힘들었어.... "); // 괄호 안에 ""넣는법
			System.out.println();
			Thread.sleep(200);
			System.out.println("			넘어가기 [0] ");
			int c7e1 = sc.nextInt();
			if (c7e1 == 0) {
			}

			System.out.println("\n");
			System.out.println(m.weather());
			System.out.println("\n");
			Thread.sleep(200);
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"thunder.mp3");
			System.out.println("			근데 날씨가 심상치 않다.... !!!!");
			Thread.sleep(200);
			System.out.println("			비가 오고 천둥번개가 친다!! ");
			System.out.println();
			Thread.sleep(200);
			System.out.println("			넘어가기 [0] ");
			int c7e2 = sc.nextInt();
			if (c7e2 == 0) {
			}

			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"dragonEmerge.mp3");
			System.out.println(m.dragon());
			Thread.sleep(1000);
			System.out.println("			!!!!!!!! ");
			Thread.sleep(1000);
			System.out.println("			위험 상황!! 전설의 용 [드라카이나(Drakaina)]가 집 앞에 출몰했다. "); // 괄호 안에 ""넣는법
			Thread.sleep(1000);
			System.out.println("			넘어가기 [0] ");
			int c7e3 = sc.nextInt();
			if (c7e3 == 0) {
			}

			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"readyforWar.mp3");
			System.out.println("\n\n\n\n\n");
			Thread.sleep(200);
			System.out.println(
					"		        ██╗    ██╗ █████╗ ██████╗ ███╗   ██╗██╗███╗   ██╗ ██████╗ ██╗                 ");
			Thread.sleep(200);
			System.out.println(
					"		        ██║    ██║██╔══██╗██╔══██╗████╗  ██║██║████╗  ██║██╔════╝ ██║                 ");
			Thread.sleep(200);
			System.out.println(
					"		        ██║ █╗ ██║███████║██████╔╝██╔██╗ ██║██║██╔██╗ ██║██║  ███╗██║                 ");
			Thread.sleep(200);
			System.out.println(
					"		        ██║███╗██║██╔══██║██╔══██╗██║╚██╗██║██║██║╚██╗██║██║   ██║╚═╝                 ");
			Thread.sleep(200);
			System.out.println(
					"		        ╚███╔███╔╝██║  ██║██║  ██║██║ ╚████║██║██║ ╚████║╚██████╔╝██╗                 ");
			Thread.sleep(200);
			System.out.println(
					"		         ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝                 ");
			Thread.sleep(200);
			System.out.println(
					"		                                                                                      ");
			Thread.sleep(200);
			System.out.println(
					"		███████╗██╗███╗   ██╗ █████╗ ██╗         ██████╗  ██████╗ ███████╗███████╗         ██╗");
			Thread.sleep(200);
			System.out.println(
					"		██╔════╝██║████╗  ██║██╔══██╗██║         ██╔══██╗██╔═══██╗██╔════╝██╔════╝         ██║");
			Thread.sleep(200);
			System.out.println(
					"		█████╗  ██║██╔██╗ ██║███████║██║         ██████╔╝██║   ██║███████╗███████╗         ██║");
			Thread.sleep(200);
			System.out.println(
					"		██╔══╝  ██║██║╚██╗██║██╔══██║██║         ██╔══██╗██║   ██║╚════██║╚════██║         ╚═╝");
			Thread.sleep(200);
			System.out.println(
					"		██║     ██║██║ ╚████║██║  ██║███████╗    ██████╔╝╚██████╔╝███████║███████║██╗██╗██╗██╗");
			Thread.sleep(200);
			System.out.println(
					"		╚═╝     ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝    ╚═════╝  ╚═════╝ ╚══════╝╚══════╝╚═╝╚═╝╚═╝╚═╝╗");
			Thread.sleep(200);
			System.out.println("\n\n\n\n\n");

			System.out.println("			넘어가기 [0] ");
			int c7e4 = sc.nextInt();
			if (c7e4 == 0) {
			}

			
			// 스킬별로 효과음! (마법공격,일반공격 효과음)
			
			System.out.println("\n\n\n\n\n");
			System.out.println(m.dragon2());
			System.out.println("\n\n\n\n\n");
			Thread.sleep(1000);
			System.out.println("			[드라카이나(Drakaina)]가 포효하고 있습니다.");
			Thread.sleep(1000);
			System.out.println("			[드라카이나(Drakaina)]가 [분노의화염]을 시전합니다.");
			Thread.sleep(1000);
			System.out.println("			빨리 [드라카이나(Drakaina)]와의 전투를 준비하세요!! ");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("			넘어가기 [0] ");
			int c7e5 = sc.nextInt();
			if (c7e5 == 0) {
			}

			if (pickClass == 1) { // 직업선택

				System.out.println("\n\n");
				System.out.println(m.druid());
				System.out.println("\n\n");
				Thread.sleep(1000);
				System.out.println("			[영웅이] 콘푸로스트를 먹는다. ");
				Thread.sleep(1000);
				System.out.println("			[영웅이] 호랑이 기운이 솟아난다! ");
				Thread.sleep(1000);
				System.out.println("			전투게이지 상승!!");
				Thread.sleep(1000);
				System.out.println("			당신의 직업은 이제부터 [드루이드]입니다");
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int c7e6 = sc.nextInt();
				if (c7e6 == 0) {
				}
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"Druid and Human.mp3");
				System.out.println(m.tiger());

				Thread.sleep(1000);
				System.out.println("			[드루이드]는 동물 변신 마법을 씁니다.");
				Thread.sleep(1000);
				System.out.println("			호랑이로 변신합니다.");
				Thread.sleep(1000);
				System.out.println("			크리티컬 스킬 [야생의영혼(-500)]을 배웠습니다.");
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int c7e7 = sc.nextInt();
				if (c7e7 == 0) {
				}
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"battleBGM.mp3");
				//////////////////////////////// 드루이드 VS 드라카이나
				System.out.println("			전투가 시작되었습니다.");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
				System.out.println();
				Thread.sleep(1000);
				System.out.println("			[나] HP>> " + Druid.getHp());
				System.out.println();
				Thread.sleep(1000);

				while (Drakaina.getHp() > 0 && Druid.getHp() > 0) {

					if (pickWeapon == 1) {
						Druid.setAttack("			우산공격~!");
					} else if (pickWeapon == 2) {
						Druid.setAttack("			건틀렛주먹~!");
					} else if (pickWeapon == 3) {
						Druid.setAttack("			광선검어택~!");
					} else if (pickWeapon == 4) {
						Druid.setAttack("			해골검어택~!");
					}

					int myhp = Druid.getHp();
					int drahp = Drakaina.getHp();

					System.out.println("			==========[드라카이나]의 공격==========");
					System.out.println();
					System.out.println("			[1] 일반공격                   [2] 크리티컬 ");
					int pickdra = sc.nextInt();
					Thread.sleep(200);
					if (pickdra == 1) {
						System.out.println(p.fireRage());
						mp3.play(comPath+"dragon.mp3");
						myhp -= 300;
						Druid.setHp(myhp);
						System.out.println();
						Thread.sleep(200);
						System.out.println("			[나] HP>> " + Druid.getHp());
						Thread.sleep(200);

					} else if (pickdra == 2) {
						System.out.println(p.thunderLightening());
						mp3.play(comPath+"thunder.mp3");
						myhp -= 500;
						Druid.setHp(myhp);
						System.out.println();
						Thread.sleep(200);
						System.out.println("			[나] HP>> " + Druid.getHp());
						Thread.sleep(200);
					}

					System.out.println();
					System.out.println("			==========[영웅이]의 공격==========");
					System.out.println();
					System.out.println("			[1] 무기공격                   [2] 마법공격");
					int pickattack = sc.nextInt();
					Thread.sleep(200);

					if (pickattack == 1) { // 무기공격

						if (pickWeapon == 1) {
							System.out.println(p.umbAttack());
							mp3.play(comPath+"umbrella.mp3");
							drahp -= 100;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 2) {
							System.out.println(p.gaunAttack());
							mp3.play(comPath+"fistpunch.mp3");
							drahp -= 200;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 3) {
							System.out.println(p.lightAttack());
							mp3.play(comPath+"lightsaver.mp3");
							drahp -= 300;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 4) {
							System.out.println(p.swordAttack());
							mp3.play(comPath+"swordAttack.mp3");
							drahp -= 250;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						}

						System.out.println();
						Thread.sleep(500);
						System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
						Thread.sleep(500);
						System.out.println();
					} else if (pickattack == 2) {
						System.out.println(p.druidAttack());
						mp3.play(comPath+"druid.mp3");
						int hp = Drakaina.getHp() - 1000;
						Drakaina.setHp(hp);
						System.out.println();
						Thread.sleep(500);
						System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
						Thread.sleep(500);
						System.out.println();

					}
					if (Drakaina.getHp() <= 0) {
						Thread.sleep(500);
						System.out.println("\n\n");
						System.out.println(m.lasthit());
						System.out.println("\n\n");
						System.out.println("			[영웅이]님의 승리! ");
					}
					if (Druid.getHp() <= 0) {
						System.out.println("			[드라카이나]의 승리!");
						System.out.println("			당신은 패배했습니다.....!");
					}

				}
			}

			if (pickClass == 2) { // careless whisper

				System.out.println(m.wearHairpin());

				Thread.sleep(1000);
				System.out.println("			어디선가 [영웅이] 의 친구 [infj]가 나타났다.  ");
				Thread.sleep(1000);
				System.out.println("			친구 에게 헤어핀을 준다.");
				Thread.sleep(1000);
				System.out.println("			헤어핀 착용! 절세 미녀가 되었다!");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int c7e8 = sc.nextInt();
				if (c7e8 == 0) {
				}

				System.out.println(m.warlock());
				
				mp3.play(comPath+"beauty.mp3");
				Thread.sleep(1000);
				System.out.println("			친구의 직업은 이제부터 [흑마법사]입니다.");
				Thread.sleep(1000);
				System.out.println("			당신의 친구가 당신 대신 전투에 참여합니다. ");
				Thread.sleep(1000);
				System.out.println("			크리티컬 스킬 [거부할수없는유혹-500]을 배웠습니다.");
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int c7e9 = sc.nextInt();
				if (c7e9 == 0) {
				}
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"battleBGM.mp3");
				
				System.out.println("			전투가 시작되었습니다.");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
				System.out.println();
				Thread.sleep(1000);
				System.out.println("			[나] HP>> " + Warlock.getHp());
				System.out.println();
				Thread.sleep(1000);

				while (Drakaina.getHp() > 0 && Warlock.getHp() > 0) {
					
					if (pickWeapon == 1) {
						Warlock.setAttack("			우산공격~!");
					} else if (pickWeapon == 2) {
						Warlock.setAttack("			건틀렛주먹~!");
					} else if (pickWeapon == 3) {
						Warlock.setAttack("			광선검어택~!");
					} else if (pickWeapon == 4) {
						Warlock.setAttack("			해골검어택~!");
					}
					
					int myhp = Warlock.getHp();
					int drahp = Drakaina.getHp();
					if (pickWeapon == 1) {
						System.out.println(p.umbAttack());
						mp3.play(comPath+"umbrella.mp3");
						drahp -= 100;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 2) {
						System.out.println(p.gaunAttack());
						mp3.play(comPath+"fistpunch.mp3");
						drahp -= 200;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 3) {
						System.out.println(p.lightAttack());
						mp3.play(comPath+"lightsaver.mp3");
						drahp -= 300;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 4) {
						System.out.println(p.swordAttack());
						mp3.play(comPath+"swordAttack.mp3");
						drahp -= 250;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					}

					System.out.println("			==========[드라카이나]의 공격==========");
					System.out.println();
					System.out.println("			[1] 일반공격                   [2] 크리티컬 ");
					int pickdra = sc.nextInt();
					Thread.sleep(200);
					if (pickdra == 1) {
						System.out.println(p.fireRage());
						mp3.play(comPath+"dragon.mp3");
						myhp -= 300;
						Warlock.setHp(myhp);
						System.out.println();
						Thread.sleep(200);
						System.out.println("			[나] HP>> " + Warlock.getHp());
						Thread.sleep(200);

					} else if (pickdra == 2) {
						System.out.println(p.thunderLightening());
						mp3.play(comPath+"thunder.mp3");
						myhp -= 500;
						Warlock.setHp(myhp);
						System.out.println();
						Thread.sleep(200);
						System.out.println("			[나] HP>> " + Warlock.getHp());
						Thread.sleep(200);

					}

					System.out.println();
					System.out.println("			==========[영웅이]의 공격==========");
					System.out.println();
					System.out.println("			[1] 무기공격                   [2] 마법공격");
					int pickattack = sc.nextInt();
					Thread.sleep(200);

					if (pickattack == 1) { // 무기공격

						if (pickWeapon == 1) {
							System.out.println(p.umbAttack());
							mp3.play(comPath+"umbrella.mp3");
							drahp -= 100;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 2) {
							System.out.println(p.gaunAttack());
							mp3.play(comPath+"fistpunch.mp3");
							drahp -= 200;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 3) {
							System.out.println(p.lightAttack());
							mp3.play(comPath+"lightsaver.mp3");
							drahp -= 300;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 4) {
							System.out.println(p.swordAttack());
							mp3.play(comPath+"swordAttack.mp3");
							drahp -= 250;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						}

						System.out.println();
						Thread.sleep(500);
						System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
						Thread.sleep(500);
						System.out.println();
					} else if (pickattack == 2) {
						System.out.println(p.warlockAttack());
						mp3.play(comPath+"warlockAttack.mp3");
						int hp = Drakaina.getHp() - 1000;
						Drakaina.setHp(hp);
						System.out.println();
						Thread.sleep(500);
						System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
						Thread.sleep(500);
						System.out.println();

					}
					if (Drakaina.getHp() <= 0) {
						Thread.sleep(500);
						System.out.println("\n\n");
						System.out.println(m.lasthit());
						System.out.println("\n\n");
						System.out.println("			[영웅이]님의 승리! ");
					}
					if (Warlock.getHp() <= 0) {
						System.out.println("			[드라카이나]의 승리!");
						System.out.println("			당신은 패배했습니다.....!");
					}

				}
			}

			if (pickClass == 3) {

				for (int a = 0; a < m.eggmongs().length; a++) {
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.println(m.eggmongs()[a]);
					System.out.println("\n\n\n\n\n\n\n\n\n");
					Thread.sleep(200);
				}

				mp3.play(comPath+ "eggcracking.mp3");
				Thread.sleep(1000);
				System.out.println("			어랏...? [에그몽 초콜릿]의 상태가 이상하다....  ");
				Thread.sleep(1000);
				System.out.println("			[에그몽 초콜릿]에 금이 가기 시작했다.... ");
				Thread.sleep(1000);
				System.out.println("			에그몽이 부화했다. 유니콘이 되었습니다. ");
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int c7e10 = sc.nextInt();
				if (c7e10 == 0) {
				}

				System.out.println(m.paladin());

				mp3.play(comPath+"Paladin.mp3");
				Thread.sleep(1000);
				System.out.println("			유니콘에 올라탔습니다..  ");
				Thread.sleep(1000);
				System.out.println("			당신의 직업은 이제부터 [성기사]입니다");
				Thread.sleep(1000);
				System.out.println("			크리티컬 스킬 [빛의 심판-500]을 배웠습니다.");
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int c7e11 = sc.nextInt();
				if (c7e11 == 0) {
				}
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"battleBGM.mp3");
				System.out.println("			전투가 시작되었습니다.");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
				System.out.println();
				Thread.sleep(1000);
				System.out.println("			[나] HP>> " + Paladin.getHp());
				System.out.println();
				Thread.sleep(1000);

				while (Drakaina.getHp() > 0 && Paladin.getHp() > 0) {
					
					if (pickWeapon == 1) {
						Paladin.setAttack("			우산공격~!");
					} else if (pickWeapon == 2) {
						Paladin.setAttack("			건틀렛주먹~!");
					} else if (pickWeapon == 3) {
						Paladin.setAttack("			광선검어택~!");
					} else if (pickWeapon == 4) {
						Paladin.setAttack("			해골검어택~!");
					}
					
					int myhp = Paladin.getHp();
					int drahp = Drakaina.getHp();
					if (pickWeapon == 1) {
						System.out.println(p.umbAttack());
						mp3.play(comPath+"umbrella.mp3");
						drahp -= 100;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 2) {
						System.out.println(p.gaunAttack());
						mp3.play(comPath+"fistpunch.mp3");
						drahp -= 200;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 3) {
						System.out.println(p.lightAttack());
						mp3.play(comPath+"lightsaver.mp3");
						drahp -= 300;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 4) {
						System.out.println(p.swordAttack());
						mp3.play(comPath+"swordAttack.mp3");
						drahp -= 250;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					}

					System.out.println("			==========[드라카이나]의 공격==========");
					System.out.println();
					System.out.println("			[1] 일반공격                   [2] 크리티컬 ");
					int pickdra = sc.nextInt();
					Thread.sleep(200);
					if (pickdra == 1) {
						System.out.println(p.fireRage());
						mp3.play(comPath+"dragonEmerge.mp3");
						myhp -= 300;
						Paladin.setHp(myhp);
						System.out.println();
						Thread.sleep(200);
						System.out.println("			[나] HP>> " + Paladin.getHp());
						Thread.sleep(200);

					} else if (pickdra == 2) {
						System.out.println(p.thunderLightening());
						mp3.play(comPath+"thunder.mp3");
						myhp -= 500;
						Paladin.setHp(myhp);
						System.out.println();
						Thread.sleep(200);
						System.out.println("			[나] HP>> " + Paladin.getHp());
						Thread.sleep(200);
					}

					System.out.println();
					System.out.println("			==========[영웅이]의 공격==========");
					System.out.println();
					System.out.println("			[1] 무기공격                   [2] 마법공격");
					int pickattack = sc.nextInt();
					Thread.sleep(200);

					if (pickattack == 1) { // 무기공격

						if (pickWeapon == 1) {
							System.out.println(p.umbAttack());
							mp3.play(comPath+"umbrella.mp3");
							drahp -= 100;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 2) {
							System.out.println(p.gaunAttack());
							mp3.play(comPath+"fistpunch.mp3");
							drahp -= 200;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 3) {
							System.out.println(p.lightAttack());
							mp3.play(comPath+"lightsaver.mp3");
							drahp -= 300;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 4) {
							System.out.println(p.swordAttack());
							mp3.play(comPath+"swordAttack.mp3");
							drahp -= 250;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						}

						System.out.println();
						Thread.sleep(500);
						System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
						Thread.sleep(500);
						System.out.println();
					} else if (pickattack == 2) {
						System.out.println(p.paladinAttack());
						int hp = Drakaina.getHp() - 1000;
						Drakaina.setHp(hp);
						System.out.println();
						Thread.sleep(500);
						System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
						Thread.sleep(500);
						System.out.println();

					}
					if (Drakaina.getHp() <= 0) {
						Thread.sleep(500);
						System.out.println("\n\n");
						System.out.println(m.lasthit());
						System.out.println("\n\n");
						System.out.println("			[영웅이]님의 승리! ");
					}
					if (Paladin.getHp() <= 0) {
						System.out.println("			[드라카이나]의 승리!");
						System.out.println("			당신은 패배했습니다.....!");
					}

				}
			}

			if (pickClass == 4) {

				System.out.println(m.human());
				mp3.play(comPath+"Druid or Human.mp3");
				Thread.sleep(1000);
				System.out.println("			[영웅이] 참이슬을 마신다. ");
				Thread.sleep(1000);
				System.out.println("			[영웅이] 알 수 없는 용기가 솟아난다. ");
				Thread.sleep(1000);
				System.out.println("			전투게이지 상승!!");
				Thread.sleep(1000);
				System.out.println("			당신의 직업은 이제부터 [겁대가리상실한 타락 휴먼]입니다");
				Thread.sleep(1000);
				System.out.println("			크리티컬 스킬 [용감무쌍(-50)]을 배웠습니다.");
				System.out.println();
				System.out.println("			넘어가기 [0] ");
				int c7e12 = sc.nextInt();
				if (c7e12 == 0) {
				}
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(comPath+"battleBGM.mp3");
				System.out.println("			전투가 시작되었습니다.");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
				System.out.println();
				Thread.sleep(1000);
				System.out.println("			[나] HP>> " + Human.getHp());
				System.out.println();
				Thread.sleep(1000);

				while (Drakaina.getHp() > 0 && Human.getHp() > 0) {
					
					if (pickWeapon == 1) {
						Human.setAttack("			우산공격~!");
					} else if (pickWeapon == 2) {
						Human.setAttack("			건틀렛주먹~!");
					} else if (pickWeapon == 3) {
						Human.setAttack("			광선검어택~!");
					} else if (pickWeapon == 4) {
						Human.setAttack("			해골검어택~!");
					}
					int myhp = Human.getHp();
					int drahp = Drakaina.getHp();
					if (pickWeapon == 1) {
						System.out.println(p.umbAttack());
						mp3.play(comPath+"umbrella.mp3");
						drahp -= 100;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 2) {
						System.out.println(p.gaunAttack());
						mp3.play(comPath+"fistpunch.mp3");
						drahp -= 200;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 3) {
						System.out.println(p.lightAttack());
						mp3.play(comPath+"lightsaver.mp3");
						drahp -= 300;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					} else if (pickWeapon == 4) {
						System.out.println(p.swordAttack());
						mp3.play(comPath+"swordAttack.mp3");
						drahp -= 250;
						Drakaina.setHp(drahp);
						Thread.sleep(200);
					}


					System.out.println("			==========[드라카이나]의 공격==========");
					System.out.println();
					System.out.println("			[1] 일반공격                   [2] 크리티컬 ");
					int pickdra = sc.nextInt();
					Thread.sleep(200);
					if (pickdra == 1) {
						System.out.println(p.fireRage());
						mp3.play(comPath+"dragon.mp3");
						myhp -= 300;
						Human.setHp(myhp);
						System.out.println();
						Thread.sleep(200);
						System.out.println("			[나] HP>> " + Human.getHp());
						Thread.sleep(200);

					} else if (pickdra == 2) {
						System.out.println(p.thunderLightening());
						mp3.play(comPath+"thunder.mp3");
						myhp -= 500;
						Human.setHp(myhp);
						System.out.println();
						Thread.sleep(200);
						System.out.println("			[나] HP>> " + Human.getHp());
						Thread.sleep(200);
					}

					System.out.println();
					System.out.println("			==========[영웅이]의 공격==========");
					System.out.println();
					System.out.println("			[1] 무기공격                   [2] 마법공격");
					int pickattack = sc.nextInt();
					Thread.sleep(200);

					if (pickattack == 1) { // 무기공격

						if (pickWeapon == 1) {
							System.out.println(p.umbAttack());
							mp3.play(comPath+"umbrella.mp3");
							drahp -= 100;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 2) {
							System.out.println(p.gaunAttack());
							mp3.play(comPath+"fistpunch.mp3");
							drahp -= 200;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 3) {
							System.out.println(p.lightAttack());
							mp3.play(comPath+"lightsaver.mp3");
							drahp -= 300;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						} else if (pickWeapon == 4) {
							System.out.println(p.swordAttack());
							mp3.play(comPath+"swordAttack.mp3");
							drahp -= 250;
							Drakaina.setHp(drahp);
							Thread.sleep(200);
						}

						System.out.println();
						Thread.sleep(500);
						System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
						Thread.sleep(500);
						System.out.println();
					} else if (pickattack == 2) {
						System.out.println(p.HumanAttack());
						mp3.play(comPath+"ohfck.mp3");
						int hp = Drakaina.getHp() - 1000;
						Drakaina.setHp(hp);
						System.out.println();
						Thread.sleep(500);
						System.out.println("			[드라카이나] HP >>" + Drakaina.getHp());
						Thread.sleep(500);
						System.out.println();

					}
					if (Drakaina.getHp() <= 0) {
						Thread.sleep(500);
						System.out.println("\n\n");
						System.out.println(m.lasthit());
						System.out.println("\n\n");
						System.out.println("			[영웅이]님의 승리! ");
					}
					if (Human.getHp() <= 0) {
						System.out.println("			[드라카이나]의 승리!");
						System.out.println("			당신은 패배했습니다.....!");
					}

				}
			}

			///////////////////////////////////// Final chapter.8 Home sweet home.
			
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"dragondie.mp3");
			System.out.println("\n\n\n\n");
			System.out.println(m.victory());
			System.out.println("\n\n\n\n");
			Thread.sleep(1000);
			System.out.println("			[드라카이나]가 피를 토하며 쓰러졌습니다...! ");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("			넘어가기 [0] ");
			int c8e1 = sc.nextInt();
			if (c8e1 == 0) {
			}
			
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath+"win.mp3");
			
			// 용사라짐

			System.out.println("\n\n\n\n");
			System.out.println(m.dragonDissapear());
			System.out.println("\n\n\n\n");
			Thread.sleep(1000);
			System.out.println("			[영웅이]의 승리!!!!!!!!! "); 
			System.out.println();
			Thread.sleep(1000);
			System.out.println("			넘어가기 [0] ");
			int c8e2 = sc.nextInt();
			if (c8e2 == 0) {
			}
			// 승리하는 장면 
			System.out.println("\n\n\n\n");
			System.out.println(m.victory2());
			System.out.println("\n\n\n\n");
			Thread.sleep(1000);
			System.out.println();
			Thread.sleep(1000);
			System.out.println("			넘어가기 [0] ");
			int c8e3 = sc.nextInt();
			if (c8e3 == 0) {
			}

			
			
			
			System.out.println("\n\n\n\n");
			System.out.println(m.mother());
			System.out.println("\n\n\n\n");
			Thread.sleep(1000);
			System.out.println("			[엄마] 영웅이 왔니~? 많이 늦었네 ~");
			Thread.sleep(1000);
			System.out.println("			[영웅이] 그게.... 친구를 좀 만나서... "); 
			System.out.println();
			System.out.println("			[영웅이] 엄마 보고 싶었어요ㅠㅠ~~!... "); 
			Thread.sleep(1000);
			System.out.println("			넘어가기 [0] ");
			int c8e4 = sc.nextInt();
			if (c8e4 == 0) {
			}
			
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(comPath + "closing.mp3");
			
			// 김치찌개
			System.out.println("\n\n\n\n");
			System.out.println(m.dinner());
			System.out.println("\n\n\n\n");
			Thread.sleep(1000);
			System.out.println("			맛있는 두부 김치찌개 완성 (보글보글)");
			Thread.sleep(1000);
			System.out.println("			[엄마] 저녁 먹자!!");
			Thread.sleep(1000);
			System.out.println("			[영웅이] 잘 먹겠습니다~! ");
			Thread.sleep(1000);
			System.out.println("			[영웅이] 내가 생각해도 난 역시 너무 대단... 나 진짜 이름값 한다~~!! ");
			Thread.sleep(1000);
			System.out.println("			[영웅이] 나는 최고의 HERO!!! ");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("			넘어가기 [0] ");
			int c8e5 = sc.nextInt();
			if (c8e5 == 0) {
			}
	

			System.out.println();
			System.out.println();
			System.out.println();

			Thread.sleep(100);
			System.out.println();

			for (int i = 0; i < MomAscii.getInstance().getGameEndAsciiArt().length; i++) {
				System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n%s\n\n\n\n\n\n\n\n\n\n\n\n\n",
						MomAscii.getInstance().getGameEndAsciiArt()[i]);
				Thread.sleep(500);
			}
		

			System.out.println(
					"       ================================================================================================================\n");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println(
					"              MOVIE NAME                   YEAR                        TITLE                         ARTIST    ");
			Thread.sleep(200);
			
			//내용물이 안올라오고 있는 문제 해결 
			System.out.println();
			System.out.println();
			System.out.println();
			Thread.sleep(200);
			for (int i = 0; i < cinemasList.size(); i++) {
				String mname = cinemasList.get(i).getMovieNameKR();
				int year = cinemasList.get(i).getYear();
				String title = cinemasList.get(i).getMovieSongName();
				String artist = cinemasList.get(i).getMovieSongArtist();
				System.out.println("          " + mname + "               " + year + "                " + title
						+ "             " + artist);
				System.out.println("\n\n");
				Thread.sleep(1000);
			}
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
