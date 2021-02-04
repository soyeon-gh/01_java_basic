package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 >> ");
		int choice = sc.nextInt();

		Random random = new Random();
		int randomNumber = random.nextInt(101);

		// 내가 선택한 숫자가 홀수면
		if (choice == 1) {

			if (0 == randomNumber % 2) {
				System.out.println("랜덤숫자 : " + randomNumber);
				System.out.print("땡");
			}

			if (0 != randomNumber % 2) {
				System.out.println("랜덤숫자 : " + randomNumber);
				System.out.print("홀수 정답");
			}
		}
		
		// 내가 선택한 숫자가 짝수면
		if (choice == 2) {

			if (0 == randomNumber % 2) {
				System.out.println("랜덤숫자 : " + randomNumber);
				System.out.print("짝수 정답");
			}

			if (0 != randomNumber % 2) {
				System.out.println("랜덤숫자 : " + randomNumber);
				System.out.print("땡");
			}
		}
		
		// 1 과 2가아닌 다른 숫자를 눌렀을 경우
		if (choice != 1 && choice != 2) {
			System.out.println("내가 고른 숫자 : " + choice);
			System.out.print("1과 2중에 골라주세요");
			
		}

		sc.close();

	}

}
