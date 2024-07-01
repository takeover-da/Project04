// break문

package loop;

public class Ex9 {

public static void main(String[] args) {
    int sum = 0;    // 합계
    int i;  // 마지막에 i의 값을 출력하기 위해 외부에 선언

    // break는 특정조건에서 빠져나와야할때 사용할것
    for (i = 1; i <= 20; i++) { // i가 1부터 20이 될때까지 총 20번 수행함
        sum = sum + i;
        System.out.println("i: " + i + " , sum: " + sum);
        if (sum >= 100) {   // 합이 100을 넘으면 for문 종료
            break;
        }
    }

    System.out.println("i : " + i); // 14
    System.out.println("sum : " + sum); // 1~14까지의 합은 105
    }

}