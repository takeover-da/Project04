package conditional.quiz;

public class Quiz7 {

	public static void main(String[] args) {
		
		char animal = 'd';
		
		switch (animal) {
		case 'b':
			System.out.println("새");
			break;
		case 'c':
			System.out.println("고양이");
			break;
		case 'd':
			System.out.println("강아지");
			break;
			
		default:
			System.out.println("잘못입력되었습니다!");
		}
	}

}
