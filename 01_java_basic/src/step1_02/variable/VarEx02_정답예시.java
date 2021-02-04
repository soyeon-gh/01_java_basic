package step1_02.variable;

public class VarEx02_정답예시 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int salary = 100;
		int beforeTaxSalary = salary * 12;
		int tax = beforeTaxSalary / 10;
		int afterTaxSalary = beforeTaxSalary - tax;
		System.out.println("세후연봉 = " + afterTaxSalary + "원");
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		int total = score1 + score2 + score3;
		double avg = total / 3.0;
		System.out.println("평균 = " + avg + "점");
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int width = 3;
		int height = 6;
		int triArea = width * height / 2;
		System.out.println("삼각형의 넓이 = " + triArea);
		
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int minutes = time / 60;
		int seconds = time % 60;
		System.out.println(minutes + "분 " + seconds + "초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원(1개), 100원(3개)  
        int money = 800;
        int fivHund = money / 500;
        int oneHund = (money % 500) / 100;
        System.out.println("500원의 개수 = " + fivHund);
        System.out.println("100원의 개수 = " + oneHund);		
		
	}

}
