package conditional.quiz;

public class Quiz6 {

	public static void main(String[] args) {

		int score = 82;
		
		if (score >= 90 && score <= 99) {
			System.out.println("수");
			
		} else if (score >= 80) {
			System.out.println("우");
			
		} else if (score >= 70) {
			System.out.println("미");
			
		} else {
			System.out.println('양');
		}
	}

}
