package conditional.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		int x = 5;
		
		if ((x % 2 == 0) || (x % 3 == 0)) {
			
			System.out.println(x + "는 2 또는 3의 배수입니다");
		}
	}

}
