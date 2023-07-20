package Main;

import Account.Account;

public class Main {

    public static void main(String[] args) {
        Server.createServer().start();
        Account account = new Account();
        Start.indexPageStart(account);
    }
}
