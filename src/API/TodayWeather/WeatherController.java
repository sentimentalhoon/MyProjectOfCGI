package API.TodayWeather;

import com.google.gson.Gson;

public class WeatherController {

    private WeatherController() {
    }

    private static WeatherController _instance = null;

    public static WeatherController getInstance() {
        if (_instance == null) {
            _instance = new WeatherController();
        }
        return _instance;
    }

    public WeatherDTO getWeather() {
        try {
            String result = TodayWeatherAPI.TodayWeather();
            Gson gson = new Gson();
            WeatherDTO weatherDTO = gson.fromJson(result, WeatherDTO.class);
            return weatherDTO;
        } catch (Exception e) {
        }
        return null;
    }

    public String getCategoryKR(String categoryString, String unitValue) {
        switch (categoryString) {
            case "POP":
                return String.format("강수확률 : %s %%", unitValue);
            case "PTY":
                if (unitValue.equals("0")) {
                    unitValue = "맑음";
                } else if (unitValue.equals("1")) {
                    unitValue = "비";
                } else if (unitValue.equals("2")) {
                    unitValue = "비/눈";
                } else if (unitValue.equals("3")) {
                    unitValue = "빗방울";
                } else if (unitValue.equals("4")) {
                    unitValue = "소나기";
                } else if (unitValue.equals("5")) {
                    unitValue = "빗방울";
                } else if (unitValue.equals("6")) {
                    unitValue = "빗방울눈날림";
                } else if (unitValue.equals("7")) {
                    unitValue = "눈날림";
                }
                return String.format("강수형태 : %s", unitValue);
            case "PCP":
                return String.format("1시간 강수량 : %s mm ", unitValue);
            case "REH":
                return String.format("습도 : %s %%", unitValue);
            case "SNO":
                return String.format("1시간 신적설 : %s cm ", unitValue);
            case "SKY":
                return String.format("하늘상태 : %s ", unitValue);
            case "TMP":
                return String.format("1시간 기온 : %s ℃", unitValue);
            case "TMN":
                return String.format("일 최저기온 : %s ℃", unitValue);
            case "TMX":
                return String.format("일 최고기온 : %s ℃", unitValue);
            case "UUU":
                return String.format("풍속(동서성분) : %s m/s", unitValue);
            case "VVV":
                return String.format("풍속(남북성북) : %s m/s", unitValue);
            case "WAV":
                return String.format("파고 : %s M", unitValue);
            case "VEC":
                return String.format("풍향 : %s deg", unitValue);
            case "WSD":
                return String.format("풍속 : %s m/s", unitValue);
            case "T1H":
                return String.format("기온 : %s ℃", unitValue);
            case "RN1":
                return String.format("1시간 강수량 : %s mm ", unitValue);
            default:
                return null;
        }
    }
}
