package step1_05.controlStatement;

public class IfEx01 {
	/*
	 * 
	 *  # 조건문 if 
	 * 
	 *  조건식이 true이면 실행되는 구문 ( false면 실행 x )
	 *  
	 *  [ 형식 ]
	 *  
	 *  if (조건식) {
	 *  
	 *  	조건식이 true일때 실행할 명령어;
	 *  
	 *  }
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("1. 실행  0");
			System.out.println("2. 실행  0");
		}
		
		//죽은코드
//		if (false) {
//			System.out.println("1. 실행 X");
//			System.out.println("2. 실행 X");
//		}

		
		int number = 10;
		
		//if 문 안에 명령어가 1줄이면 {} 를 생략할 수 있다.
		if (number % 2 == 0) {
			System.out.println("짝수");
		} else if(number % 2 == 1) {
			System.out.println("홀수");
		}
	}

}
