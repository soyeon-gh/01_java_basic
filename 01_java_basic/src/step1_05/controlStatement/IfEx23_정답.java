package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  
 * ! 여기서부터는 일일이 지정이 아닌 계산식으로 필요함.
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx23_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========================================================");
		System.out.println("                        요금표");
		System.out.println("1) 1~5	: 500원");
		System.out.println("2) 6~10	: 600원");
		System.out.println("3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ");
		System.out.println("4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)");
		System.out.println("5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)");
		System.out.println("===========================================================");
		System.out.println("이용할 정거장 수를 입력해주세요 >> ");
		int station = sc.nextInt();
		
		int addStation = 0;
		int fare = 0;
	
		if (station >= 1 || station <= 5 ) {
			fare = 500;
		} else if (station >= 6 || station <= 10) {
			fare = 600;
		} else {
			
			fare += addStation;
			
		} 
		System.out.println("============== 요금안내 ==============");
		System.out.println("정류장 : " + station);
		System.out.println("요금 : " + fare + " 원");
		sc.close();
	}

}
