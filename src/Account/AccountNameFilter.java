package Account;

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

	public Boolean nameFilter(String name) {
		if (name.length() == 0) {
			return false;
		}

		return isInvalidName(name);
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
			numOfNameBytes = name.getBytes("UTF-8").length;
			if (5 < (numOfNameBytes - name.length()) || 12 < numOfNameBytes) {
				return false;
			}
		} catch (UnsupportedEncodingException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
			return false;
		}
		if (!name.matches("^[a-zA-Z].*$")) {
			return false;
		}
		if (name.matches("^[0-9].*$")) {
			return false;
		}
		if (!name.matches("^[a-zA-Z0-9]+$")) {
			return false;
		}
		if (!isAlphaNumeric(name)) {
			return false;
		}
		return true;
	}
}
