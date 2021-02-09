package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[1단계]
 * 
 * 1. com은 바위(1)만 낼 수 있다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */

public class IfEx03_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int com = 1;

		System.out.println("   *** 가위바위보 게임 *** ");
		System.out.println(" *** 가위(0)바위(1)보(2) *** ");
		
		System.out.print("me : ");
		int me = sc.nextInt();
		if (me < com) {
			System.out.println("내가 졌다");
		} else if (me == com) {
			System.out.println("비겼다");
		} else if (me > com) {
			System.out.println("내가 이겼다");
		} else {
			System.out.println("0부터 2까지의 숫자를 입력해주세요.");
		}

		sc.close();
	}

}
