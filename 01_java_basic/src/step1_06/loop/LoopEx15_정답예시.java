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

public class LoopEx15_정답예시 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int totalScore = 0;
		double avg = 0.0;
		int passStudentCnt = 0;
		int maxScore = 0;
		int maxNum = 0;
		int i = 1;
		
		while (i <= 10) {
			
			int score = ran.nextInt(100) + 1;
			System.out.print(score + " ");
			
			totalScore += score;
			
			if (score >= 60) {
				passStudentCnt++;
			}
			
			if (maxScore < score) {
				maxScore = score;
				maxNum = i;
			}
			
			i++;
		}
		System.out.println();
		
		avg = totalScore / 10.0;
		
		System.out.println("총점 = " + totalScore + "점");
		System.out.println("평균 = " + avg + "점");
		System.out.println("합격생 수 = " + passStudentCnt + "명");
		System.out.println("1등학생 = " + maxScore + "[" + maxNum + "번]");

	}

}
