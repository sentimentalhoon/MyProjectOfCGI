package Account;

import java.util.concurrent.ConcurrentHashMap;

public class AccountController {
    private static ConcurrentHashMap<String, Account> accountsMap = new ConcurrentHashMap<String, Account>();

    private AccountController() {
    }

    private static AccountController _instance = null;

    public static AccountController getInstance() {
		if (_instance == null) {
			_instance = new AccountController();
		}
		return _instance;
	}

    public Account[] getAllAccounts() {
        return accountsMap.values().toArray(
                new Account[accountsMap.size()]);
    }

    public static Account getAllAccountsHashMap(String key){
        return accountsMap.get(key);
    }
    public int getOnlinePlayerCount() {
        return accountsMap.size();
    }

    public synchronized void login(Account account){
        if (!account.isValid()) {
            throw new IllegalArgumentException("허가되지 않은 계정입니다.");
        }
        accountsMap.put(account.getName(), account);
    }

    public synchronized boolean logout(Account client) {
        if (client.getName() == null) {
            return false;
        }
        return accountsMap.remove(client.getName()) != null;
    }
}
