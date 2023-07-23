package API.TodayWeather;

public class TodayWeatherInfomation {
    
    private static TodayWeatherInfomation _instance = null;

    public static TodayWeatherInfomation getInstance() {
        if (_instance == null) {
            _instance = new TodayWeatherInfomation();
        }
        return _instance;
    }

    public TodayWeatherItem getTodayWeatherItem() {
        return todayWeatherItem;
    }

    public void setTodayWeatherItem(TodayWeatherItem todayWeatherItem) {
        this.todayWeatherItem = todayWeatherItem;
    }

    private TodayWeatherItem todayWeatherItem;
}
