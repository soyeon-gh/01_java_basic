package step1_05.controlStatement;

public class IfEx25 {

	/*
	 * 
	 * # siwtch ~ case문
	 * 
	 * [형식]
	 * 
	 * switch(변수) {
	 * 
	 * case 값: 
	 *     명령어; 
	 *     break; 
	 * case 값: 
	 *     명령어; 
	 *     break; 
	 * case 값: 
	 *     명령어; 
	 * 	   break; 
	 * default: 
	 *     명령어;
	 * 
	 * }
	 * 
	 * - if문과 다르게 범위 형태로 직접적으로 분기하지 않고 값을 기준으로 분기한다. 
	 * - switch 기준변수에는 정수 , 문자, 문자열, 자료형을 사용할 수 있다. 
	 * - 해당 case의 아래 case까지 모두 수행한다. 
	 *   그것을 원치 않을 경우 의도적으로 break 명령어를 작성한다. 
	 * - default는 위의 케이스들 중 해당되는 곳이 없을때 분기되는 곳이다.
	 * 
	 */
	public static void main(String[] args) {

		char chrVar = 'A';// 'B' ,'C','D'로 대입해서 값을 확인해보시오.

		switch (chrVar) {

		case 'A':
			System.out.println("A로 분기합니다");
			break;
		case 'B':
			System.out.println("B로 분기합니다");
			break;
		case 'C':
			System.out.println("C로 분기합니다");
			break;
		default:
			System.out.println("default로 분기합니다");
		}

	}

}
