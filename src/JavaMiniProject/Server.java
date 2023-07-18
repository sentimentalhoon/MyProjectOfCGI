package JavaMiniProject;

import JavaMiniProject.DAO.DBFactory;
import JavaMiniProject.Utils.PerformanceTimer;
import JavaMiniProject.Utils.SystemUtil;

public class Server {
	private volatile static Server uniqueInstance;

	private Server() {
	}

	public static Server createServer() {
		if (uniqueInstance == null) {
			synchronized (Server.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Server();
				}
			}
		}
		return uniqueInstance;
	}

	public void start() {
		initDBFactory();
		PerformanceTimer timer = new PerformanceTimer();
		System.out.println("=====================================================");
		System.out.print("[DB] DB 정리 중입니다.");
		System.out.println("OK! " + timer.get() + " ms");
		timer.reset();
		System.out.println("=====================================================");
		System.out.println("이용메모리 : " + SystemUtil.getUsedMemoryMB() + "MB");
		System.out.println("=====================================================");
		timer = null;
	}

	private void initDBFactory() {// L1DatabaseFactory 초기설정
		DBFactory.setDatabaseSettings("oracle.jdbc.driver.OracleDriver",
				"jdbc:oracle:thin:@localhost:1521:xe",
				"service", "Tkfkdgo12#$");
		try {
			DBFactory.getInstance();
		} catch (Exception e) { /* e.printStackTrace(); */
		}
	}
}