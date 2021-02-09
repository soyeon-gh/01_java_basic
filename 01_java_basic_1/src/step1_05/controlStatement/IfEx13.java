package step1_05.controlStatement;

import java.util.Random;

public class IfEx13 {

//ctrl + pageup / ctrl + pagedown : 페이지 이동

	/*
	 * 랜덤 라이브러리
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Random random = new Random();

		// 0~9 사이의 랜덤 값
		int rNum1 = random.nextInt(10);
		System.out.println(rNum1);

		// 100 ~ 200
		int rNum2 = random.nextInt(101) + 100; // 0부터100 + 100
		System.out.println(rNum2);

		for (int i = 0; i < 100; i++) {
			// -3 ~ 3 사이의 랜덤값
			int rNum3 = random.nextInt(7) - 3;
			System.out.println(rNum3);
		}
	}

}
