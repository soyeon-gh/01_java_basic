package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx21_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(151) + 100;
		
		System.out.println("==========================");
		System.out.println("가운데 숫자 맞추기 게임");
		System.out.println("==========================");
		System.out.println("150~250 사이의 랜덤 숫자를 맞추세요");
		
		System.out.print("숫자를 입력해주세요 >>");
		int myNumber = sc.nextInt();
		
		int answer = randomNumber % 100 / 10;
		
		if (myNumber == answer) {
			System.out.println("랜덤 숫자 : " + randomNumber);
			System.out.println("랜덤 숫자의 가운데 숫자 : " + answer);
			System.out.println("내가 입력한 숫자 : " + myNumber);
			System.out.println("정답");
		} else {
			System.out.println("랜덤 숫자 : " + randomNumber);
			System.out.println("랜덤 숫자의 가운데 숫자 : " + answer);
			System.out.println("내가 입력한 숫자 : " + myNumber);
			System.out.println("땡");
		}
		
		sc.close();
		
	}

}
