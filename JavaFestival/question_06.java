package JavaFestival;

public class question_06 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 77;
        for (int i = 1; i < 78; i++) {
            sum += i * (j - i);
        }
        System.out.println(sum);
    }
}