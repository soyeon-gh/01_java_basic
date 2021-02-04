package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_정답 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int avg = 0;
		int sum = 0;
		int i = 1;
		int max = 0;
		int maxNumber = 0;
		
		System.out.println("===== 합격자 =====");
		
		while(i <= 10) {
			
			int randomNumber = random.nextInt(100) + 1;
			sum += randomNumber;
			
			if(randomNumber >= 60) {
				System.out.println(i + "번 학생");
				System.out.println(randomNumber + "점");
				System.out.println("==========");
				if(randomNumber > max) {
					max = randomNumber;
					maxNumber = i;
				}
			}
			
			i++;
			
		}
		
		avg = sum / 10;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("=============");
		System.out.println("1등 : " + maxNumber + "번 " + max + "점");
		
		
	}

}
