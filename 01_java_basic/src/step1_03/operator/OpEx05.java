package step1_03.operator;

public class OpEx05 {
	/*
	 * 
	 *  논리 연산자
	 * 
	 *  1. 종류
	 *  
	 *  	&&(and) : 양쪽 모두다 참이어야 최종적으로 참(true)
	 *  			Ex) 무주택 세대주 이어야 '하고' 연봉이 3400미만 이어야 한다.
	 *  
	 *		||(or) : 어느 한쪽이라도 참이면 최종적으로 참(true)
	 *				Ex) 무주택 세대주 '이거나' 연봉이 3400미만 이어야 한다. 	
	 * 
	 *		!(not) : 부정연산자 ( true > false , false > true ) 
	 *
	 * 		[ 중요 ] 논리 연산자의 결과도 참(true) 또는 거짓(false)이다.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// && >> 하나라도 false 면 결과는 false
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		System.out.println();
		
		// || >> 하나라도 true 면 결과는 true
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);
		System.out.println();
		
		//! >> 반대 값 출력
		System.out.println(!(10==10));
		System.out.println(!(10!=10));
	}

}
