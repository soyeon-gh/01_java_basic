package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */


public class LoopEx04_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int cnt = 1;
		int sum = 0;
		
		while(cnt <= 5) {
			
			int i = random.nextInt(10) + 1;
			int j = random.nextInt(10) + 1;
			int answer = i * j;
			System.out.println(cnt + ". " + i + " x " + j + " = " + "??");
			System.out.print("답 입력 >> ");
			int userAnswer = sc.nextInt();
			System.out.println();
			if(userAnswer == answer) {
				System.out.println("정답");
				System.out.println();
				sum += 1;
			}else {
				System.out.println("땡");
				System.out.println();
			}
			
			cnt++;
			
			
		}
		System.out.println("성적 >> " + sum + " 개 맞추셨습니다.");
	sc.close();

	}

}
