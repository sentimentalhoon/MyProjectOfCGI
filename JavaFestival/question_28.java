package JavaFestival;

import java.util.Scanner;

public class question_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2진수로 입력하여 주십시요. (0,1만 이용 가능!) : ");

        String str2Num = sc.next();

        System.out.printf("%s(2) = %d(10)", str2Num, Integer.parseInt(str2Num, 2));
    }
}
