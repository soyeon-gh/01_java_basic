package step1_03.operator;

public class OpEx01 {

	public static void main(String[] args) {

		/*
		 * [ 중요 ]
		 * 
		 * 정수 / 정수 = 정수 
		 * 정수 / 실수 = 실수 
		 * 실수 / 정수 = 실수 
		 * 실수 / 실수 = 실수
		 * 
		 * - 최소 1개이상 실수형태의 모습을 가지고 있어야 한다. 
		 * - 프로그래밍 언어마다 약간씩 차이가 있다.
		 * 
		 * 산술 연산자 ( + , - , / , % , * )
		 * 
		 */

		System.out.println(10 + 3); // 덧셈
		System.out.println(10 - 3); // 뺄셈
		System.out.println(10 * 3); // 곱셈

		System.out.println();

		System.out.println(10 / 3);// 나눗셈
		System.out.println(10.0 / 3.0);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3);
		System.out.println((double) 10 / 3);

		System.out.println();

		System.out.println(10 % 3); // 나머지

	}

}
