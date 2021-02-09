package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int max = 0;
		while (i <= 3) {
			System.out.print(i + ". 정수를 입력해주세요 >> ");
			int number = sc.nextInt();
			i++;
			if(number > max) {
				max = number;
			} 
		}
		System.out.println("최대값 : " + max);
		
		sc.close();
	

	}

}

