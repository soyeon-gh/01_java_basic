package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx24_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		
		int randomNumber1 = random.nextInt(10) + 1;
		int randomNumber2 = random.nextInt(10) + 1;
		int randomNumber3 = random.nextInt(4) + 1;
		int answer = 0;
		
		if (randomNumber3 == 1) {
			answer = randomNumber1 + randomNumber2;
		} else if(randomNumber3 == 2){
			answer = randomNumber1 - randomNumber2;
		} else if(randomNumber3 == 3){
			answer = randomNumber1 * randomNumber2;
		} else {
			answer = randomNumber1 / randomNumber2;
		}
		
		System.out.println("===== 연산자 기호 맞추기 게임 =====");
		System.out.println(randomNumber1 + " ? " + randomNumber2 + " = " + answer);
		System.out.println("1) + 2) - 3) * 4) / ");
		System.out.print("답 : ");
		int userAnswer = sc.nextInt();
		
		if (userAnswer == randomNumber3) {
			System.out.println("당신의 답 : " + userAnswer);
			System.out.println("정답 : " + randomNumber3);
			System.out.println("정답입니다!");
		} else {
			System.out.println("당신의 답 : " + userAnswer);
			System.out.println("정답 : " + randomNumber3);
			System.out.println("틀렸습니다.");
		}
		
		sc.close();
	}

}
