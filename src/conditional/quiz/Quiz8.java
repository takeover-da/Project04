package conditional.quiz;

public class Quiz8 {

	public static void main(String[] args) {

		int score = 50;
		int value = score / 10;
		
		switch (value) {
		
		case 9:
			System.out.println("수");
			break;
			
		case 8:
			System.out.println("우");
			break;
			
		case 7:
			System.out.println("미");
			break;
			
		default:
			System.out.println("양");
			break;
		}
		
		// 이와같이 조건이 복잡한 경우에는 switch문 보다는 if문이 편리하다.
	}

}
