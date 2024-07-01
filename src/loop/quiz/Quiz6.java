package loop.quiz;

public class Quiz6 {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        for (num = 1; num <= 100; num++) {
            sum = sum + num;

            if (sum >= 500) {
                break;
            }
        }
        System.out.println("num: " + num + " , sum: " + sum);
    }
}
