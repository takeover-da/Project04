package conditional.quiz;

public class Quiz5 {

	public static void main(String[] args) {

		int month = 13;
		
		if (month >= 3 && month <= 5 ) {
			System.out.println("현재 계절은 봄입니다.");
			
		} else if(month >= 6 && month <= 8) {
			System.out.println("현재 계절은 여름입니다.");
			
		} else if(month >= 9 && month <= 11) {
			System.out.println("현재 계절은 가을입니다.");
			
		} else if(month == 12 || month == 1 || month == 2) {
			System.out.println("현재 계절은 겨울입니다.");
			
		} else {
			System.out.println("입력이 잘못되었습니다!");
			
		}
	}

}
