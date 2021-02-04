package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * 2. 로그아웃
 * 
 */

public class LoopEx08_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				if (identifier == -1) {
					
					System.out.print("계좌번호 입력 : ");
					int myAcc = scan.nextInt();
					
					System.out.print("비밀번호 입력 : ");
					int myPw = scan.nextInt();
					
					if (myAcc == dbAcc1 && myPw == dbPw1) {
						identifier = 1;
						System.out.println(dbAcc1 + "님, 환영합니다.");
					}
					else if (myAcc == dbAcc2 && myPw == dbPw2) {
						identifier = 2;
						System.out.println(dbAcc2 + "님, 환영합니다.");
					}
					else {
						System.out.println("계좌번호와 비밀번호를 확인해주세요.");
					}
					
				}
				else {
					if (identifier == 1) {
						System.out.println("현재 " + dbAcc1 + "님, 로그인 중...");
					}
					else if (identifier == 2) {
						System.out.println("현재 " + dbAcc2 + "님, 로그인 중...");
					}
				}
			}
			else if (selectMenu == 2) {
				if (identifier != -1) {
					identifier = -1;
					System.out.println("로그아웃 되었습니다.");
				}
				else {
					System.out.println("로그인 후 이용해주세요.");
				}
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
		
	}

}
