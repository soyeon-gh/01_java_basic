package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.print("정수1 입력 : ");
		int getNum1 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int getNum2 = scan.nextInt();
		
		int totalNubmer = getNum1 + getNum2;
		System.out.println("두 수의 합 = " + totalNubmer);
		
		
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.print("숫자 한 개 입력 : ");
		int getNum3 = scan.nextInt();
		System.out.println(getNum3 % 2 == 1);
		
		
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적 입력 : ");
		int getScore = scan.nextInt();
		System.out.println(60 <= getScore && getScore <= 100);
		
		scan.close();

	}

}
