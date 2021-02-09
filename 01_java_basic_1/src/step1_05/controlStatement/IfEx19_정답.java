package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int myAcc = 1234;
		int myMoney = 8700;

		int yourAcc = 4321;
		int yourMoney = 12000;

		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		System.out.println("================================");
		
		System.out.print("계좌번호를 입력해주세요 >> ");
		int myNum = sc.nextInt();
		
		if (myAcc == myNum) {
			
			System.out.print("상대방 계좌번호를 입력해주세요 >> ");
			int yourNum = sc.nextInt();
			
			if (yourAcc == yourNum) {
				
				System.out.print("이체 할 금액을 입력해주세요 >> ");
				int money = sc.nextInt();
				
				if (myMoney >= money) {
					
					myMoney -= money;
					yourMoney += money;
					System.out.println("================================");
					System.out.println("myMoney = " + myMoney + "원");
					System.out.println("yourMoney = " + yourMoney + "원");
					System.out.println("이체가 완료되었습니다.");
					System.out.println("================================");
					
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				
			} else {
				System.out.print("잘못된 계좌번호 입니다.");
			}
			
		} else {
			System.out.print("잘못된 계좌번호 입니다.");
		}

		sc.close();

	}

}
