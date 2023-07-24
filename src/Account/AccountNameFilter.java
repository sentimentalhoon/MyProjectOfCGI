/**
 * account 의 name을 받아 해당 id 가 정상적인지 확인한다.
 */
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

	/**
	 * name 을 검사한다.
	 * length 가 0 일 경우 false 를 반환한다.
	 * @param name
	 * @return
	 */
	public Boolean nameFilter(String name) {
		if (name.length() == 0) {
			return false;
		}

		return isInvalidName(name);
	}

	/**
	 * name 값을 받아 문자인지 확인힌다.
	 * @param name
	 * @return
	 */
	private static boolean isAlphaNumeric(String name) {
		boolean flag = true;
		char ac[] = name.toCharArray();
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

	/**
	 * name 값을 받아 정규표현식에 맞는 형식인지 확인한다.
	 * a-z 로 시작하는지 확인
	 * 0-9 숫자로 시작한다면 false를 리턴
	 * 문자열에 a-z, 0-9 를 제외한 문자가 포함되어있으면 false 를 리턴한다.
	 * @param name
	 * @return
	 */
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
