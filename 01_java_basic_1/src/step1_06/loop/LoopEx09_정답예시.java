package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

public class LoopEx09_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("입금할 금액 입력 : ");
				int money = scan.nextInt();
				
				myMoney = myMoney + money;
				System.out.println("입금을 완료하였습니다.");
			}
			else if (selectMenu == 2) {
				System.out.print("출금할 금액 입력 : ");
				int money = scan.nextInt();
				
				if (money <= myMoney) {
					myMoney = myMoney - money;
					System.out.println("출금을 완료하였습니다.");
				}
				else {
					System.out.println("계좌잔액이 부족합니다.");
				}
			}
			else if (selectMenu == 3) {
				System.out.print("이체할 계좌번호 입력 : ");
				int acc = scan.nextInt();
				
				if (acc == yourAcc) {
					System.out.print("이체할 금액 입력 : ");
					int money = scan.nextInt();
					
					if (money <= myMoney) {
						myMoney = myMoney - money;
						yourMoney = yourMoney + money;
						System.out.println("이체를 완료하였습니다.");
					}
					else {
						System.out.println("계좌잔액이 부족합니다.");
					}
				}
				else {
					System.out.println("계좌번호를 확인해주세요.");
				}
			}
			else if (selectMenu == 4) {
				System.out.println("myMoney = " + myMoney + "원");
				System.out.println("yourMoney = " + yourMoney + "원");
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
