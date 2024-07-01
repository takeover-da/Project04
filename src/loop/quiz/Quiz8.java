package loop.quiz;
//  중첩반복문
//  구구단에서 짝수는 생략하고 홀수단만 출력하세요
public class Quiz8 {
    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++) {
            for (int times = 1; times <= 9; times++) {
                if (times % 2 == 0) {
                    continue;
                }
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
}
