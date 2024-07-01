package loop.quiz;
// 중첩 반복문을 사용해서 직각삼각형을 그려보세요
// *
// **
// ***
// ****
// *****
public class Quiz10 {
    public static void main(String[] args) {

        // 반복문 없이 작성
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        // 반복문을 사용하여 작성(1)
        for (int i = 1; i <= 5; i++){
            System.out.println("??");
        }

        // 반복문을 사용하여 작성(2)
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
