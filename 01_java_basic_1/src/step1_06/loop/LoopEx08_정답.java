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
 * 
 */

public class LoopEx08_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int identifier = -1;						
		// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;
		
		
		while (isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {

				if (identifier == -1) {
					System.out.print("***아이디를 입력해 주세요 : ");
					int userId = scan.nextInt();
					if (userId == dbAcc1) { // 1

						System.out.print("***비밀번호를 입력해 주세요 : ");
						int userPassword = scan.nextInt();

						if (userPassword == dbPw1) {

							System.out.println("===========");
							System.out.println(dbAcc1 + "님");
							System.out.println("로그인 성공");
							System.out.println("===========");
							identifier = 1;

						} else {

							System.out.println("======================");
							System.out.println("비밀번호가 틀렸습니다.");
							System.out.println("======================");

						}

					} else if (userId == dbAcc2) { //2

						System.out.print("***비밀번호를 입력해 주세요 : ");
						int userPassword = scan.nextInt();

						if (userPassword == dbPw2) {

							System.out.println("===========");
							System.out.println(dbAcc2 + "님");
							System.out.println("로그인 성공");
							System.out.println("===========");
							identifier = 2;

						} else {

							System.out.println("======================");
							System.out.println("비밀번호가 틀렸습니다.");
							System.out.println("======================");

						}
					} else {

						System.out.println("======================");
						System.out.println("아이디가 틀렸습니다.");
						System.out.println("======================");

					}  // .login end
				} else if (identifier == 1 || identifier == 2) {
					
					System.out.println("========================");
					System.out.println("이미 로그인 되어있습니다.");
					System.out.println("========================");
					
				} //.identifier end
			} //.selectMenu end
			
			else if (selectMenu == 2) {
				
				if (identifier == -1) {
					
					System.out.println("======================");
					System.out.println("로그인 후 이용 가능합니다.");
					System.out.println("======================");
					
				} else if(identifier == 1) {
					
					System.out.println("=====================");
					System.out.println(dbAcc1 + "님 로그아웃");
					System.out.println("====================");
					identifier = -1;
					
				} else if(identifier == 2) {
					
					System.out.println("=====================");
					System.out.println(dbAcc2 + "님 로그아웃");
					System.out.println("=====================");
					identifier = -1;
					
				}
				
			}
			
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("=============");
				System.out.println("프로그램 종료");
				System.out.println("=============");
			}
		}

		scan.close();
	}

}
