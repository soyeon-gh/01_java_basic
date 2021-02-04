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
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가) ! 여기서부터는 직접 값을 지정하는 것이 아닌 계산식으로 요금 계산
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx23_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이용할 정거장 수를 입력하세요 : ");
		int useStationCnt = scan.nextInt();
		
		int fee = 0;
		if (1 <= useStationCnt && useStationCnt <= 5) {
			fee = 500;
		}
		else if (6 <= useStationCnt && useStationCnt <= 10) {
			fee = 600;
		}
		else {
            int add = useStationCnt - 10;
			if (useStationCnt % 2 == 1) {
				add += 1;
			}
            fee = 600 + add/2*50;
			
		}
		
		System.out.println("요금 = " + fee + "원");
		
		scan.close();

	}

}
