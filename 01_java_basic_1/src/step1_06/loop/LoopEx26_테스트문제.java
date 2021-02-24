package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계]
 * 
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 *    
 */

public class LoopEx26_테스트문제 {

	
	public int primeNumber(int getNumber) {
		int number = 0;
		boolean isRunning = true;

		while (isRunning) {

			

			int maxNumber = getNumber * 2;

			if (getNumber != 0) {

				int cnt = 0;
				boolean isLoop = true;
				// <-- getNumber가 소수인지 판별 -->
				int i = getNumber;
				while (isLoop) {

					for (int j = 1; j <= i; j++) {

						if (i % j == 0) {
							cnt++;
						}
					}

					if (cnt == 2) {
						number = i;
						isLoop = false;
					}
					
					i++;
				}
				System.out.println(number);

//				for (int i = getNumber; i <= maxNumber; i++) {
//					
//					if (i % j == 0) {
//						cnt++;
//					}
//					
//					j ++;
//					
//					if(cnt == 2)  {
//						 number = i;
//						 System.out.println(getNumber + "보다 큰 첫번째 소수는 " +  number);
//					}
//				}

			} else {
				System.out.println("종료합니다.");
				isRunning = false;
			}
		}
		
		
		return getNumber;
	}
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = 0;
		boolean isRunning = true;

		while (isRunning) {

			System.out.println("0을 입력하면 종료됩니다.");
			System.out.print("Enter Number ? ");
			int getNumber = scan.nextInt();

			int maxNumber = getNumber * 2;

			if (getNumber != 0) {

				int cnt = 0;
				boolean isLoop = true;
				// <-- getNumber가 소수인지 판별 -->
				int i = getNumber;
				while (isLoop) {

					for (int j = 1; j <= i; j++) {

						if (i % j == 0) {
							cnt++;
						}
					}

					if (cnt == 2) {
						number = i;
						isLoop = false;
					}
					
					i++;
				}
				System.out.println(number);

//				for (int i = getNumber; i <= maxNumber; i++) {
//					
//					if (i % j == 0) {
//						cnt++;
//					}
//					
//					j ++;
//					
//					if(cnt == 2)  {
//						 number = i;
//						 System.out.println(getNumber + "보다 큰 첫번째 소수는 " +  number);
//					}
//				}

			} else {
				System.out.println("종료합니다.");
				isRunning = false;
			}
		}
		scan.close();

	}

}
