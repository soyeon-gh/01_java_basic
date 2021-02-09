package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("* 첫번째 숫자를 입력해주세요 : ");
		int number1 = sc.nextInt();
		
		System.out.print("* 두번째 숫자를 입력해주세요 : ");
		int number2 = sc.nextInt();
		
		System.out.print("* 세번째 숫자를 입력해주세요 : ");
		int number3 = sc.nextInt();
		
		// if (첫번째 숫자가 더 크다면)
		if (number1 > number2) {
			if (number1 > number3) {
				System.out.println("=== 가장 큰수는 " + number1 + " ===");
			}
		}
		
		// if (두번째 숫자가 더 크다면)
		if (number2 > number1) {
			if (number2 > number3) {
				System.out.println("=== 가장 큰수는 " + number2 + " ===");
			}
		}
		
		// if (세번째 숫자가 더 크다면)
		if (number3 > number2) {
			if (number3 > number1) {
				System.out.println("=== 가장 큰수는 " + number3 + " ===");
			}
		}
		
		sc.close();

	}

}
