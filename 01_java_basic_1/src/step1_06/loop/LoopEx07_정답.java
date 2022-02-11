package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		int score = 100;
		boolean isRunning = true;
		
		System.out.println("# Up & Down 게임");
		System.out.println("========================================");
		System.out.println("점수는 100점");
		System.out.println("오답을 입력할 때마다 5점씩 차감됩니다.");
		System.out.println("========================================");
		System.out.println("1 ~ 100까지 숫자를 입력해주세요");
		
		while (isRunning) {
			
			System.out.print("user >> ");
			int userAnswer = sc.nextInt();
			if (userAnswer == randomNumber) {
				System.out.println("computer >> " + randomNumber);
				System.out.println("user >> " + userAnswer);
				System.out.println("정답입니다.");
				System.out.println("점수 : " + score);
				isRunning = false;
			} else if(score == 0) {
				System.out.println("게임종료");
				System.out.println("점수 : " + score);
				isRunning = false;
			} else if(userAnswer < randomNumber){
				System.out.println("더 큰 수 입니다.");
				System.out.println(score);
				score -= 5;
			} else if(userAnswer > randomNumber){
				System.out.println("더 작은 수 입니다.");
				System.out.println(score);
				score -= 5;
			} 
		}
		/*
		while (isRunning) {
			
			if (score != 0) {
				
				System.out.print("user >> ");
				int userAnswer = sc.nextInt();
				
				if (userAnswer == randomNumber) {
					System.out.println("computer >> " + randomNumber);
					System.out.println("user >> " + userAnswer);
					System.out.println("정답입니다.");
					System.out.println("점수 : " + score);
					isRunning = false;
				} else if(userAnswer < randomNumber){
					System.out.println("더 큰 수 입니다.");
					score -= 5;
				} else if(userAnswer > randomNumber){
					System.out.println("더 작은 수 입니다.");
					score -= 5;
				}
			} else if(score == 0) {
				System.out.println("게임종료");
				System.out.println("점수 : " + score);
				isRunning = false;
			} 
		}
		*/
		
		sc.close();
	}

}
