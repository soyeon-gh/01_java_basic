package step1_03.operator;

public class OpEx04_정답 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println("예) 점수가 60점 이상 >> " + (score >= 60));
        System.out.println();
        
        //문제1) 15가 3의 배수이면 true 출력
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
        
        int number15 = 15;
        
        System.out.println("문제1) 15가 3의 배수인가? >> " + (number15 % 3 == 0));
        System.out.println();
        
        //문제2) 100이 짝수이면 true 출력
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수

        int number100 = 100;
        System.out.println("문제2) 100이 짝수인가? >> " + (number100 % 2 == 0));
        System.out.println();
        
        //문제3)아래돈중 1000원짜리 이상화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
        int money = 178600;
        System.out.println("문제3) 178600원 중 1000원짜리가 3장 이상인가? >> " + ((money % 5000) / 1000 >= 3));

	}

}
