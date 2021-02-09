package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 * 
 */

public class IfEx14_정답예시 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.print("동전의 앞면(0), 뒷면(1) 입력 : ");
		int me = scan.nextInt();
		
		if (coin == me) 	System.out.println("정답!");
		if (coin != me) 	System.out.println("땡!");
		

		scan.close();
		
	}

}
