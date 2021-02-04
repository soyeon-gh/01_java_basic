package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx22_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(50) + 1;
		
		int printNumber10 = randomNumber / 10;
		int printNumber1 = randomNumber % 10;
		
		System.out.println("랜덤 숫자 : " + randomNumber);
		
		if(printNumber10 == 3) {
			System.out.println("짝");
			
		} else if(printNumber1 == 3 || printNumber1 == 6 || printNumber1 == 9) {
			System.out.println("짝");
		}		
		
		sc.close();
		
	}

}
