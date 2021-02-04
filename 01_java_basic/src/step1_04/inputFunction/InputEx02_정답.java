package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_정답 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("* 첫번째 숫자를 입력해주세요 >> ");
		int getNumber1 = sc.nextInt(); 
		
		System.out.print("* 두번째 숫자를 입력해주세요 >> ");
		int getNumber2 = sc.nextInt(); 
		
		int sum = getNumber1 + getNumber2;
		System.out.println("두 수의 합은 >> " + sum);
		System.out.println();
		
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		
		System.out.print("* 숫자를 입력해 주세요 >> ");
		int getNumber3 = sc.nextInt();
		
		boolean isChecked1 = getNumber3 % 2 != 0 ? true : false;
		
		System.out.println(isChecked1);
		System.out.println();
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		
		System.out.println("* 성적을 입력해 주세요 >>");
		int getGrade = sc.nextInt();
		
		boolean isChecked2 = getGrade >= 60 &&  getGrade < 100 ? true : false;
		
		System.out.println(isChecked2);
		
		sc.close();
	}
	
}
