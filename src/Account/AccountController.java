/**
 * Account 를 저장하는 공간이다.
 * account 를 저장, 삭제, 갯수를 처리한다.
 */
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

    /**
     * 모든 account 의 갯수를 정렬 후 구해온다.
     * 
     * @return
     */
    public Account[] getAllAccounts() {
        return accountsMap.values().toArray(
                new Account[accountsMap.size()]);
    }

    /**
     * key 으로 map 에서 해당 정보를 구해온다.
     * 
     * @param key
     * @return
     */
    public static Account getAllAccountsHashMap(String key) {
        return accountsMap.get(key);
    }

    public int getOnlinePlayerCount() {
        return accountsMap.size();
    }

    /**
     * account 의 정보를 map 에 넣는다.
     * 단 허가되지 않은 계정의 경우 리턴한다.
     * @param account
     */
    public synchronized void login(Account account) {
        if (!account.isValid()) {
            throw new IllegalArgumentException("허가되지 않은 계정입니다.");
        }
        accountsMap.put(account.getName(), account);
    }

    /**
     * logout 하였을 경우 map 에서 제거한다.
     * @param client
     * @return
     */
    public synchronized boolean logout(Account client) {
        if (client.getName() == null) {
            return false;
        }
        return accountsMap.remove(client.getName()) != null;
    }
}
