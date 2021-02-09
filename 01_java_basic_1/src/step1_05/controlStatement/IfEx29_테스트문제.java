package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class IfEx29_테스트문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// String 변수
		String userLeft = "";
		String userRight = "";
		String computerLeft = "";
		String computerRight = "";

		String scissors = "가위";
		String rock = "바위";
		String paper = "보";

		System.out.println("────────────────────────────");
		System.out.println(" 가위 바위 보 (하나빼기) ");
		System.out.println("가위바위보를 두 번 입력하여");
		System.out.println("한 개를 골라 컴퓨터를 이겨보세요.");
		System.out.println("────────────────────────────");
		System.out.println("1. 가위 │ 2. 바위 │ 3. 보");
		System.out.println("숫자 1부터 3까지 입력해주세요.");
		System.out.println("────────────────────────────");

		// -- me --
		System.out.print("1. 가위바위보 입력 >> ");
		int meLeft = sc.nextInt();
		System.out.print("2. 가위바위보 입력 >> ");
		int meRight = sc.nextInt();

		// me String
//		if(meLeft == 1) {
//			userLeft = scissors;
//		} else if(meLeft == 2) {
//			userLeft = rock;
//		} else if(meLeft == 3) {
//			userLeft = paper;
//		} else if(meRight == 1) {
//			userRight = scissors;
//		} else if(meRight == 2) {
//			userRight = rock;
//		} else if(meRight == 3) {
//			userRight = paper;
//		}

		// meFinal = 1 : 왼쪽 선택
		// meFinal = 2 : 오른쪽 선택
		System.out.println("1. " + meLeft + " , 2. " + meRight);
		System.out.print("하나빼기 >> ");
		int meFinal = sc.nextInt();

		// meFinal의 값에 따라 meLeft / meRight 값 대입
		if (meFinal == 1) {
			meFinal = meLeft;
		} else {
			meFinal = meRight;
		}

		// -- computer --
		int comLeft = random.nextInt(3) + 1;
		int comRight = random.nextInt(3) + 1;

		// computer String
//		if(comLeft == 1) {
//			computerLeft = scissors;
//		} else if(comLeft == 2) {
//			computerLeft = rock;
//		} else if(comLeft == 3) {
//			computerLeft = paper;
//		} else if(comRight == 1) {
//			computerRight = scissors;
//		} else if(comRight == 2) {
//			computerRight = rock;
//		} else if(comRight == 3) {
//			computerRight = paper;
//		}

		// comFinal = 1 : 왼쪽 선택
		// comFinal = 2 : 오른쪽 선택
		int comFinal = random.nextInt(2) + 1;

		// comFainal의 값에 따라 comLeft / comRight 값 대입
		if (comFinal == 1) {
			comFinal = comLeft;
		} else {
			comFinal = comRight;
		}

		// -- 결과 --

		if (meFinal == comFinal) {
			System.out.println("me : " + meFinal);
			System.out.println("computer : " + comFinal);
			System.out.println("무승부!");
		} else if (meFinal == 1) {
			if (comFinal == 2) {
				System.out.println("me : " + meFinal);
				System.out.println("computer : " + comFinal);
				System.out.println("com win!");
			} else {
				System.out.println("me : " + meFinal);
				System.out.println("computer : " + comFinal);
				System.out.println("win!");
			}
		} else if (meFinal == 2) {
			if (comFinal == 1) {
				System.out.println("me : " + meFinal);
				System.out.println("computer : " + comFinal);
				System.out.println("win!");
			} else {
				System.out.println("me : " + meFinal);
				System.out.println("computer : " + comFinal);
				System.out.println("com win!");
			}
		} else if (meFinal == 3) {
			if (comFinal == 1) {
				System.out.println("me : " + meFinal);
				System.out.println("computer : " + comFinal);
				System.out.println("com win!");
			} else {
				System.out.println("me : " + meFinal);
				System.out.println("computer : " + comFinal);
				System.out.println("win!");
			}
		}
		System.out.println("────────────────────────────");
		System.out.println("computer 1. " + comLeft);
		System.out.println("computer 2. " + comRight);
		System.out.println("me " + meFinal);
		System.out.println("computer " + comFinal);
		System.out.println("────────────────────────────");
		;
		sc.close();
	}

}
