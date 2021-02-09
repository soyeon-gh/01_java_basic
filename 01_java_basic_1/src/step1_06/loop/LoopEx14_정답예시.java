package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int maxNum = 0;
		
		int i = 1;
		
		while (i <= 3) {
			
			System.out.print("정수" + i + " 입력 : ");
			int num = scan.nextInt();
			
			if (maxNum < num) {
				maxNum = num;
			}
			i++;
		}
		
		System.out.println("최대값 = " + maxNum);

		scan.close();
		
	}

}
