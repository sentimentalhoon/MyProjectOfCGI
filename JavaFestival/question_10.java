package JavaFestival;

import java.util.Arrays;
import java.util.Random;

public class question_10 {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random ran = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(100) + 1;
        }

        System.out.printf("배열에 있는 모든 값 : %s", Arrays.toString(array));
        System.out.print("\n/************ Arrays.sort() 를 사용 ***********/");
        Arrays.sort(array);
        System.out.printf("\n배열에 있는 모든 값 : %s", Arrays.toString(array));
        System.out.printf("\n가장 큰 값 : %d", array[array.length - 1]);
        System.out.printf("\n가장 작은 값 : %d", array[0]);

        System.out.print("\n/************ for문 Math.max, Math.min 을 사용 ***********/");
        int min = 0, max = 0, minValue = 0, maxValue = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                minValue = Math.min(array[i], array[j]);
                maxValue = Math.max(array[i], array[j]);
                if (min == 0) {
                    min = minValue;
                } else if (min > 0) {
                    if (minValue < min)
                        min = minValue;
                }

                if (maxValue > max) {
                    max = maxValue;
                }
            }
        }
        System.out.printf("\n가장 큰 값 : %d", max);
        System.out.printf("\n가장 작은 값 : %d", min);
    }
}