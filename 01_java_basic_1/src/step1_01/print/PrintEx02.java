package step1_01.print;

public class PrintEx02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 자료형(data type)에 맞는 출력
		 * 
		 * 1-1. 정수 : 소수점이 없는 수
		 * 1-2. 실수 : 소수점이 있는 수
		 * 1-3. 문자 : 문자 1개
		 * 1-4. 문자열 : 문자 2개 이상
		 */
		System.out.println("1. 자료형(data type)에 맞는 출력");
		System.out.println(10);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println("ABCD");
		System.out.println();
		
		System.out.println(10 + 10);
		System.out.println('5' + '8');
		System.out.println("10" + 15);
		System.out.println();
		
		// 2. 복수의 데이터 출력( ,가 아닌 + 를 사용해야한다.)
		System.out.println("2. 복수의 데이터 출력");
		System.out.println(1 + 3 + 5);
		System.out.println(1 + "" + 3 + "" + 5);
		System.out.println(1 + " " + 3 + " " + 5);
		System.out.println(1 + " , " + 3 + " , " + 5);
		System.out.println();
		
		// 2-1. 문자열 + 문자열 = 문자열
		System.out.println("3" + "7");
		
		// 2-2. 숫자 + 숫자 = 숫자
		System.out.println( 3 + 7 );
		
		// 2-3. 문자열 + 숫자 = 문자열
		System.out.println("3" + 7 );
		
		// 2-4. 숫자 + 문자열 = 문자열
		System.out.println( 3 + "7");
		
		System.out.println();
		System.out.println("더하기 = " + 3 + 7 );
		System.out.println("더하기 = " + (3 + 7) );
		
		
		
	}
}
