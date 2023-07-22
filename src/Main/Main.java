package Main;

import API.TodayWeather.TodayWeatherInfomation;
import Account.Account;

public class Main {

    public static void main(String[] args) {        
        Server.createServer().start();
        TodayWeatherInfomation.getInstance().setTodayWeatherItem(Server.createServer().initWeather());
        Account account = new Account();
        Start.indexPageStart(account);
    }
}