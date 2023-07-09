package JavaFestival;

import java.util.Arrays;

public class question_23 {
    public static void main(String[] args) {

        int n = 5;
        int[][] array = new int[n][n];
        int[][] array2 = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = num++;
            }
        }
        System.out.println("=======원본======");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("=======왼쪽 90도 회전 후=======");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = array[j][array[i].length - 1 - i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
    }
}
