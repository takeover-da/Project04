// switch문(String)

package conditional;

public class Ex6_switch문_String {

	public static void main(String[] args) {

		String rank = "1";  //순위
		
		// 변수와 값이 일치하는 case문을 실행한다
		switch (rank) {
		case "1":  //rank 값이 1이면
			System.out.println("메달의 색은 금입니다");
			break;
		case "2":  //rank 값이 2이면
			System.out.println("메달의 색은 은입니다");
			break;
		case "3":  //rank == "3"
			System.out.println("메달의 색은 동입니다");
			break;
		default:  //변수와 일치하는 값이 없으면
			System.out.println("메달이 없습니다.");
		}
		
//		// switch문은 실수타입을 사용할 수 없다!
//		float r = 1.1f;
//		switch (r) {  //에렁
//		case 1.5f:
//			break;
//		}
	}

}
