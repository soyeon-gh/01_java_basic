package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int identifier = -1;
		// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean isRun = true;
		while (isRun) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {

				if (identifier == -1) {

					System.out.print("* 아이디를 입력해주세요 : ");
					int userId = scan.nextInt();

					if (userId == dbAcc1) {

						System.out.print("* 비밀번호를 입력해주세요 : ");
						int userPassword = scan.nextInt();

						if (userPassword == dbPw1) {
							System.out.println("========================");
							System.out.println(dbAcc1 + "님 환영합니다.");
							System.out.println("========================");
							identifier = 1;

						} else {
							System.out.println("========================");
							System.out.println("비밀번호를 틀리셨습니다.");
							System.out.println("========================");
						}

					} else if (userId == dbAcc2) {

						System.out.print("* 비밀번호를 입력해주세요 : ");
						int userPassword = scan.nextInt();

						if (userPassword == dbPw2) {
							System.out.println("========================");
							System.out.println(dbAcc2 + "님 환영합니다.");
							System.out.println("========================");
							identifier = 2;

						} else {
							System.out.println("========================");
							System.out.println("비밀번호를 틀리셨습니다.");
							System.out.println("========================");
						} // .password check end
					} else {
						System.out.println("========================");
						System.out.println("잘못된 아이디입니다.");
						System.out.println("========================");
					} // .id check end

				} else {
					System.out.println("========================");
					System.out.println("이미 로그인 되어있습니다.");
					System.out.println("========================");
				} // .identifier end

			} // .sel 1 end

			else if (sel == 2) {
				if (identifier == 1) {
					System.out.println("================================");
					System.out.println(dbAcc1 + "님 로그아웃 되었습니다.");
					System.out.println("================================");
					identifier = -1;
				} else if (identifier == 2) {
					System.out.println("================================");
					System.out.println(dbAcc2 + "님 로그아웃 되었습니다.");
					System.out.println("================================");
					identifier = -1;
				} else {
					System.out.println("========================");
					System.out.println("로그인시 이용가능합니다.");
					System.out.println("========================");
				}
			} // .sel 2 end
			else if (sel == 3) {
				if (identifier == 1) {

					System.out.print("* 입금하실 금액을 입력해주세요 : ");
					int userMoney = scan.nextInt();
					System.out.println("================================");
					System.out.println(userMoney + "원 입금되었습니다.");
					System.out.println("================================");
					dbMoney1 += userMoney;

				} else if (identifier == 2) {

					System.out.print("* 입금하실 금액을 입력해주세요 : ");
					int userMoney = scan.nextInt();
					System.out.println("================================");
					System.out.println(userMoney + "원 입금되었습니다.");
					System.out.println("================================");
					dbMoney2 += userMoney;

				} else {
					System.out.println("========================");
					System.out.println("로그인시 이용가능합니다.");
					System.out.println("========================");
				}
			} // .sel 3 end
			else if (sel == 4) {
				if (identifier == 1) {

					System.out.print("* 출금하실 금액을 입력해주세요 : ");
					int userMoney = scan.nextInt();

					if (userMoney < dbMoney1) {

						System.out.println("================================");
						System.out.println(userMoney + "원 출금되었습니다.");
						System.out.println("================================");
						dbMoney1 -= userMoney;

					} else {
						System.out.println("================================");
						System.out.println("출금하실 금액을 초과하였습니다.");
						System.out.println("================================");
					}

				} else if (identifier == 2) {

					System.out.print("* 출금하실 금액을 입력해주세요 : ");
					int userMoney = scan.nextInt();

					if (userMoney < dbMoney2) {

						System.out.println("================================");
						System.out.println(userMoney + "원 출금되었습니다.");
						System.out.println("================================");
						dbMoney2 -= userMoney;

					} else {
						System.out.println("================================");
						System.out.println("출금하실 금액을 초과하였습니다.");
						System.out.println("================================");
					}

				} else {
					System.out.println("========================");
					System.out.println("로그인시 이용가능합니다.");
					System.out.println("========================");
				}
			} // .sel 4 end
			else if (sel == 5) {
				if (identifier == 1) {

					System.out.print("* 이체하실 계좌번호를 입력해주세요 :");
					int yourId = scan.nextInt();

					if (yourId == dbAcc2) {

						System.out.print("* 이체하실 금액을 입력해주세요 : ");
						int userMoney = scan.nextInt();

						if (userMoney < dbMoney1) {

							System.out.println("================================");
							System.out.println(userMoney + "원 이체되었습니다.");
							System.out.println("================================");
							dbMoney1 -= userMoney;
							dbMoney2 += userMoney;

						} else {
							System.out.println("================================");
							System.out.println("이체하실 금액을 초과하였습니다.");
							System.out.println("================================");
						}
					} else {
						System.out.println("==========================================");
						System.out.println("이체하실 계좌번호는 잘못된 계죄번호입니다.");
						System.out.println("==========================================");
					}

				} else if (identifier == 2) {

					System.out.print("* 이체하실 계좌번호를 입력해주세요 :");
					int yourId = scan.nextInt();

					if (yourId == dbAcc1) {

						System.out.print("* 이체하실 금액을 입력해주세요 : ");
						int userMoney = scan.nextInt();

						if (userMoney < dbMoney2) {

							System.out.println("================================");
							System.out.println(userMoney + "원 이체되었습니다.");
							System.out.println("================================");
							dbMoney2 -= userMoney;
							dbMoney1 += userMoney;

						} else {
							System.out.println("================================");
							System.out.println("이체하실 금액을 초과하였습니다.");
							System.out.println("================================");
						}
					} else {
						System.out.println("==========================================");
						System.out.println("이체하실 계좌번호는 잘못된 계죄번호입니다.");
						System.out.println("==========================================");
					}
				} else {
					System.out.println("========================");
					System.out.println("로그인시 이용가능합니다.");
					System.out.println("========================");
				}
			} // .sel 5 end
			else if (sel == 6) {
				if (identifier == 1) {

					System.out.println("============================================");
					System.out.println(dbAcc1 + " 님의 잔액은 " + dbMoney1 + " 원 입니다.");
					System.out.println("============================================");

				} else if (identifier == 2) {

					System.out.println("============================================");
					System.out.println(dbAcc2 + " 님의 잔액은 " + dbMoney2 + " 원 입니다.");
					System.out.println("============================================");

				} else {
					System.out.println("========================");
					System.out.println("로그인시 이용가능합니다.");
					System.out.println("========================");
				}
			} // .sel 6 end
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();

	}

}
