package JavaFestival;

import java.util.Scanner;

public class question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("행 개수 : ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++){
            for (int j = row - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
