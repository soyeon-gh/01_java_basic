package step1_02.variable;

// 산술 연산자 하고 와서 진행
public class VarEx02_정답 {

	public static void main(String[] args) {

		// 예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력

		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("* 잔돈 = " + change + "원");
		System.out.println();

		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)

		int monthlyPaycheck = 100; // 월급
		int annualIncome = monthlyPaycheck * 12; // 연봉
		double tax = 0.1; // 세금
		double taxAnnualIncome = annualIncome - (annualIncome * tax); // 세후연봉

		System.out.println("* 연봉 >> (세전) " + annualIncome + " (세후) " + taxAnnualIncome);
		System.out.println();

		// 문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?

		int testScore01 = 30;
		int testScore02 = 50;
		int testScore03 = 4;

		int totalScore = (testScore01 * testScore02 * testScore03) / 3;

		System.out.println("* 평균 점수 >> " + totalScore);
		System.out.println();

		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력

		int width = 3;
		int height = 6;
		int area = (width * height) / 2;

		System.out.println("* 삼각형의 넓이 >> " + area);
		System.out.println();

		// 문제4) 100초를 1분 40초로 출력

		int second = 60;
		int questionSecond = 100;
		int answerMinute = questionSecond / second;
		int answerSecond = (questionSecond - second) / 1;
		System.out.println("* 시간 출력 >> " + answerMinute + "분" + answerSecond + "초");
		System.out.println();

		// 문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		// 정답5) 500원(1개), 100원(3개)

		int questionMoney = 800;
		int Money500 = 500;
		int Money100 = 100;
		int Money500Cnt = questionMoney / Money500;
		int Money100Cnt = (questionMoney - Money500) / Money100;
		System.out.println("* 500원 >> " + Money500Cnt + "개 " + "100원 >> " + Money100Cnt + "개");
		System.out.println();

	}

}
