package Main;

import com.google.gson.Gson;

import API.TodayWeather.Item;
import API.TodayWeather.TodayWeatherAPI;
import API.TodayWeather.TodayWeatherItem;
import API.TodayWeather.WeatherController;
import API.TodayWeather.WeatherDTO;
import DAO.DBFactory;
import Utils.PerformanceTimer;
import Utils.Print;
import Utils.SystemUtil;

public class Server extends Print {
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
		println("=====================================================");
		print("[DB] DB 정리 중입니다.");
		println("OK! " + timer.get() + " ms");
		timer.reset();
		System.out.println("=====================================================");
		println("이용메모리 : " + SystemUtil.getUsedMemoryMB() + "MB");
		println("=====================================================");
		timer = null;
	}

	private void initDBFactory() {
		DBFactory.setDatabaseSettings("oracle.jdbc.driver.OracleDriver",
				"jdbc:oracle:thin:@project-db-cgi.smhrd.com:1524:xe",
				"cgi_5_230721_2", "smhrd2");
		try {
			DBFactory.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public TodayWeatherItem initWeather() {
		TodayWeatherItem todayWeatherItem = new TodayWeatherItem();
		String result = TodayWeatherAPI.TodayWeather();
		Gson gson = new Gson();
		WeatherDTO weatherDTO = gson.fromJson(result, WeatherDTO.class);
		WeatherController weatherController = WeatherController.getInstance();
		for (Item item : weatherDTO.getResponse().getBody().getItems().getItem()) {
			if (item.getCategory().equals("T1H")) {
				todayWeatherItem.setT1h(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
			} else if (item.getCategory().equals("RN1")) {
				todayWeatherItem.setRn1(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
			} else if (item.getCategory().equals("UUU")) {
				todayWeatherItem.setUuu(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
			} else if (item.getCategory().equals("VVV")) {
				todayWeatherItem.setVvv(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
			} else if (item.getCategory().equals("REH")) {
				todayWeatherItem.setReh(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
			} else if (item.getCategory().equals("PTY")) {
				todayWeatherItem.setPty(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
			} else if (item.getCategory().equals("VEC")) {
				todayWeatherItem.setVec(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
			} else if (item.getCategory().equals("WSD")) {
				todayWeatherItem.setWsd(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
			}
		}
		return todayWeatherItem;
	}
}
