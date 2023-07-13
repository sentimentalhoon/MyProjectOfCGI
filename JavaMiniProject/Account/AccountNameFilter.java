package JavaMiniProject.Account;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountNameFilter {
    private static Logger _log = Logger.getLogger(AccountNameFilter.class
    .getName());

    private static AccountNameFilter _instance = null;

    public static AccountNameFilter getInstance() {
		if (_instance == null) {
			_instance = new AccountNameFilter();
		}
		return _instance;
	}

	private AccountNameFilter() {
	}

    public Boolean nameFilter(String name){
		if (name.length() == 0) {
			return false;
		}
        
		if (isInvalidName(name)) {
            return false;
		}
        return true;
    }

	private static boolean isAlphaNumeric(String s) {
		boolean flag = true;
		char ac[] = s.toCharArray();
		int i = 0;
		do {
			if (i >= ac.length) {
				break;
			}
			if (!Character.isLetterOrDigit(ac[i])) {
				flag = false;
				break;
			}
			i++;
		} while (true);
		return flag;
	}

	private static boolean isInvalidName(String name) {
		int numOfNameBytes = 0;
		try {
			numOfNameBytes = name.getBytes("EUC-KR").length;
		} catch (UnsupportedEncodingException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
			return false;
		}

		if (isAlphaNumeric(name)) {
			return false;
		}
		// 문자가 5 문자를 넘는지, 전체로 12바이트를 넘으면(자) 무효인 이름으로 한다
		if (5 < (numOfNameBytes - name.length()) || 12 < numOfNameBytes) {
			return false;
		}
		return true;
	}
}
