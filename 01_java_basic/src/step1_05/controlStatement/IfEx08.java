
package step1_05.controlStatement;

import java.util.Scanner;

/*
 * 
 * # 중첩 if 문
 * 
 * 	- if문 안의 명령어에 또 if문이 중첩으로 들어간 형태
 * 
 * */
//sqld sqlp 

public class IfEx08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("* 성적 입력 : ");
		int getGrade = sc.nextInt();
		
		if (getGrade >= 60) {
			if (getGrade == 100) {
				System.out.println("만점");
			}
			System.out.println("합격");
		}
		
		if (getGrade < 60) {
			System.out.println("불합격");
		}
		
		sc.close();
		
	}

}
