package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx23_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 입력해주세요 : ");
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				
				
					System.out.println(i);
				
				
			}
		}
		
		sc.close();
		
		
	}
	
}
