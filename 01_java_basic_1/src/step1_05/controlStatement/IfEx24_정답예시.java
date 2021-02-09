package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx24_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(10) + 1;
		int y = ran.nextInt(10) + 1;
		
		int answer = ran.nextInt(4) + 1;

		int z = 0;
		if 		(answer == 1) z = x + y;
		else if (answer == 2) z = x - y;
		else if (answer == 3) z = x * y;
		else if (answer == 4) z = x % y;
		
		System.out.println(x + " ? " + y + " = " + z);
		System.out.println("1)+ 2)- 3)* 4)%");
		
		System.out.print("번호를 선택하세요 : ");
		int myAnwer = scan.nextInt();
		
		if (answer == myAnwer) {
			System.out.println("정답!");
		}
		else {
			System.out.println("오답!");
		}

		scan.close();
		
	}

}
