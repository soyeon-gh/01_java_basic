package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_정답 {

	public static void main(String[] args) {
		
		int dbId = 0;
		int dbPw = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< join us >>");
		
		System.out.print("* id 를 입력해주세요 >> ");
		dbId = sc.nextInt();
		System.out.print("* password 를 입력해주세요 >> ");
		dbPw = sc.nextInt();
		
		System.out.println("=====================================");
		
		System.out.println("<< login >>");
		
		System.out.print("* id 를 입력해주세요 >> ");
		int getId = sc.nextInt();
		
		if (getId == dbId) {
			
			System.out.print("* password 를 입력해주세요 >> ");
			int getPassword = sc.nextInt();
			
			if (getPassword == dbPw) {
				System.out.println("로그인 성공!");
			} 
			
			if(getPassword != dbPw) {
				System.out.println("비밀번호를 잘못 입력하셨습니다.");
			}
		} 
		
		if (getId != dbId) {
			System.out.println("아이디를 잘못 입력하셨습니다.");
		}
		
		sc.close();
		
		
	}

}
