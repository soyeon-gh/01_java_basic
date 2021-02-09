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
//ctrl + f : 찾기
public class LoopEx09_정답 {

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

				System.out.print("* 계좌번호를 입력해주세요 : ");
				int userId = scan.nextInt();

				if (userId == myAcc) {

					System.out.print("* 입금하실 금액을 입력해주세요 : ");
					int userMoney = scan.nextInt();
					System.out.println("==================================");
					System.out.println(userMoney + " 원이 입금 되었습니다.");
					System.out.println("==================================");
					myMoney += userMoney;

				} else {
					System.out.println("====================");
					System.out.println("계좌번호가 다릅니다.");
					System.out.println("====================");
				}

			} // .selectMenu 1 end

			else if (selectMenu == 2) {

				System.out.print("* 계좌번호를 입력해주세요 : ");
				int userId = scan.nextInt();

				if (userId == myAcc) {

					System.out.print("* 출금하실 금액을 입력해주세요 : ");
					int userMoney = scan.nextInt();

					if (userMoney > myMoney) {
						System.out.println("==================================");
						System.out.println("출금하실 금액을 초과 하였습니다.");
						System.out.println("==================================");
					} else {
						System.out.println("==================================");
						System.out.println(userMoney + " 원이 출금 되었습니다.");
						System.out.println("==================================");
						myMoney -= userMoney;
					}

				} else {
					System.out.println("====================");
					System.out.println("계좌번호가 다릅니다.");
					System.out.println("====================");
				}
			} // .selectMenu 2 end
			else if (selectMenu == 3) {

				System.out.print("* 계좌번호를 입력해주세요 : ");
				int userId = scan.nextInt();

				if (userId == myAcc) {

					System.out.print("* 이체하실 계좌번호를 입력해주세요 : ");
					int yourId = scan.nextInt();

					if (yourId == yourAcc) {

						System.out.print("* 이체하실 금액을 입력해주세요 : ");
						int userMoney = scan.nextInt();
						
						if (userMoney > myMoney) {
							System.out.println("==================================");
							System.out.println("이체하실 금액을 초과 하였습니다.");
							System.out.println("==================================");
						} else {
							System.out.println("==================================");
							System.out.println(userMoney + " 원이 이체 되었습니다.");
							System.out.println("==================================");
							myMoney -= userMoney;
							yourMoney += userMoney;
						}
					} else {
						System.out.println("===========================");
						System.out.println("상대방 계좌번호가 다릅니다.");
						System.out.println("===========================");
					}

				} else {
					System.out.println("====================");
					System.out.println("계좌번호가 다릅니다.");
					System.out.println("====================");
				}
			} // .selectMenu 3 end
			else if (selectMenu == 4) {
				System.out.println("============================================================");
				System.out.println("조회를 선택하셨습니다.");
				System.out.println(myAcc +"님의 계좌 잔액은 " + myMoney +"원 입니다.");
				System.out.println(yourAcc + "님의 계좌 잔액은 " + yourMoney +"원 입니다.");
				System.out.println("============================================================");
			} // .selectMenu 4 end
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			} // .selectMenu 0 end
		}

		scan.close();

	}

}
