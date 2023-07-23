package Utils;

public class CountKorean {    
    public String countKorean(int countSpace, String str) {
        int countKorean = 0;

        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            if ((c >> 7) > 0) {
                countKorean += 2;
            } else {
                countKorean += 1;
            }
        }
        return str + printSpace(countSpace - countKorean);
    }

    public String printSpace(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
