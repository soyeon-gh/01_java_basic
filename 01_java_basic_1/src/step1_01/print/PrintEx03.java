package step1_01.print;

/*
 * 
 *  이스케이프 문자 ( escape sequence ) 
 * 
 * 	1) \n : 줄바꿈
 *  2) \t : tab
 *  3) \" : 문자 자체 " (문법x)
 * 
 * 
 *  서식 문자 출력
 *  
 *  1) %d : 정수
 *  2) %f : 실수
 *  3) %c : 단일 문자
 *  4) %s : 문자열
 *  
 *  5) %.1f : 소수점 1자리 까지 출력(반올림)
 * 	   %.2f : 소수점 2자리 까지 출력(반올림)
 *     %.3f : 소수점 3자리 까지 출력(반올림)
 * 
 * */

public class PrintEx03 {

	public static void main(String[] args) {

		System.out.println("안녕\n하세요.");
		System.out.println("안녕\t하세요.");
		System.out.println("\"안녕하세요.\"");
		
		System.out.println("=====================");
		
		
		System.out.printf("%d\n" , 10);
		System.out.printf("%f\n" , 3.14);
		System.out.printf("%.1f\n" , 3.14);
		System.out.printf("%.2f\n" , 3.14);
		System.out.printf("%.3f\n" , 3.14);
		System.out.printf("%c\n" , '#');
		System.out.printf("%s\n" , "글자");
		
		System.out.printf("이름 : %s , 나이 : %d , 총점 : %d , 평균 : %.1f\n" , "제임스 고슬링" , 20 , 400 , 100.0);
		
	}

}
