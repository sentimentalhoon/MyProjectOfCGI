package Main;

import API.TodayWeather.TodayWeatherInfomation;
import Account.Account;

public class Main {

    public static void main(String[] args) {        
        Server.getInstance().isStart();
        TodayWeatherInfomation.getInstance().setTodayWeatherItem(Server.getInstance().initWeather());
        Account account = new Account();
        Start.indexPageStart(account);        
    }
}
