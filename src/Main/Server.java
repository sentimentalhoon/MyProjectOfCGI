/**
 * main start 와 같이 시작되는 부분이다.
 * iniDBFactory : db 처리와 정리를 하고 있으며
 * initweather : 공공데이터 포털에서 날씨 정보를 가져온다.
 */
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

public class Server implements Print {
	private volatile static Server uniqueInstance;

	private Server() {
	}

	public static Server getInstance() {
		if (uniqueInstance == null) {
			synchronized (Server.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Server();
				}
			}
		}
		return uniqueInstance;
	}

	/**
	 * 서버 시작을 한다.
	 * initDBFactory 를 통해 db 에 접속한다.
	 * hikaricp를 통해 connection pool을 만든다.
	 * 
	 * 현재는 디비를 정리하지 않는다.
	 * 후에 필요없는 data 를 정리하는 부분을 추가한다.
	 */
	public void isStart() {
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
		try {
			DBFactory.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 공공데이터 포털 (data.go.kr) 에서 api 를 통해 json 으로 데이터를 받나느다.
	 * 해당 정보를 배열에 넣어둔다.
	 * 단 공공데이터 포털에서 connection time out 을 자주 일으킨다.
	 * @return
	 */
	public TodayWeatherItem initWeather() {
		TodayWeatherItem todayWeatherItem = new TodayWeatherItem();
		try {
			String result = TodayWeatherAPI.TodayWeather();
			if (result != null) {
				Gson gson = new Gson();
				WeatherDTO weatherDTO = gson.fromJson(result, WeatherDTO.class);
				WeatherController weatherController = WeatherController.getInstance();
				for (Item item : weatherDTO.getResponse().getBody().getItems().getItem()) {
					if (item.getCategory().equals("T1H")) {
						todayWeatherItem
								.setT1h(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
					} else if (item.getCategory().equals("RN1")) {
						todayWeatherItem
								.setRn1(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
					} else if (item.getCategory().equals("UUU")) {
						todayWeatherItem
								.setUuu(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
					} else if (item.getCategory().equals("VVV")) {
						todayWeatherItem
								.setVvv(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
					} else if (item.getCategory().equals("REH")) {
						todayWeatherItem
								.setReh(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
					} else if (item.getCategory().equals("PTY")) {
						todayWeatherItem
								.setPty(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
					} else if (item.getCategory().equals("VEC")) {
						todayWeatherItem
								.setVec(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
					} else if (item.getCategory().equals("WSD")) {
						todayWeatherItem
								.setWsd(weatherController.getCategoryKR(item.getCategory(), item.getObsrValue()));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todayWeatherItem;
	}

	public static void println(String str) {
		System.out.println(str);
	}

	public static void print(String str) {
		System.out.print(str);
	}
}
