package step1_06.loop;

import java.util.Scanner;

public class LoopEx19 {
	/*
	 * # do while문
	 * 
	 * [ 형식 ]
	 * 
	 * do {
	 * 	   반복할 명령어;
	 * } while ( 조건식 );
	 * 
	 * 
	 * 1. while문과 do~while문의 차이점은 반복 조건의 '검사시점'이다.
	 * 		( while    : 반복 조건식을 먼저 검사 )
	 * 		( do~while : 일단 한번 실행한 후 반복조건을 검사 )
	 * 
	 * 2. while문 조건식 뒤에 ;을 잊지 않고 반드시 써주어야 한다.
	 *  
	 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while ( num > 0 && num < 4) {
			System.out.print("# 숫자 입력(1~3) : ");
			num = sc.nextInt();
		}
		
		/////////////////////////////////////////////////////
		
		do {
			
			System.out.print("# 숫자 입력(1~3) : ");
			num = sc.nextInt();
			
		} while ( num > 0 && num < 4 );
		
		
		
		
		sc.close();

	}

}
