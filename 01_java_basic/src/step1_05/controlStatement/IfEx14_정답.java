package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_정답 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int coin = ran.nextInt(2);

		System.out.println("번호를 입력하세요");
		System.out.print("0 : 동전의 앞면, 1 : 동전의 뒷면 >> ");
		int me = sc.nextInt();
		
		// 선택지에 맞게 선택했다면
		if (me == 0 || me == 1) {
			
			// 내가 고른 숫자와 동전이 맞으면
			if (coin == me) {
				System.out.println("동전 : " + coin);
				System.out.println("나 : " + me);
				System.out.println("정답!");
			}
			
			// 내가 고른 숫자와 동전이 틀리면
			if (coin != me) {
				System.out.println("동전 : " + coin);
				System.out.println("나 : " + me);
				System.out.println("땡");
			}

		}

		// 0과 1이 아닌 다른 숫자를 눌렀을 경우
		if (me != 0 && me != 1) {
			
			System.out.println("0과 1중에 골라주세요");
			
		}
		
		sc.close();
	}

}
