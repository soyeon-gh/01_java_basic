package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답!" 또는 "땡!"을 출력한다.
 */

public class IfEx06_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int x = scan.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int y = scan.nextInt();
		
		int answer = x * y;
		
		System.out.print("정답 입력 : ");
		int myAnswer = scan.nextInt();
		
		if (answer == myAnswer) {
			System.out.println("정답!");
		}
		if (answer != myAnswer) {
			System.out.println("땡!");
		}

		scan.close();

	}

}
