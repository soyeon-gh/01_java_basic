package step1_06.loop;

//# 반복문 기본문제[2단계]

public class LoopEx03_정답 {

	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답1) 15
		
		System.out.println("문제1) 1~5까지의 합 출력");
		int i = 1;
		int sum = 0;
		while (i <= 5) {
			sum += i;
			i++;
		}
		System.out.println("1~5까지의 합 출력 >> " + sum);
		System.out.println();
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		System.out.println("문제2) 1~10까지 반복해 3미만 7이상만 출력");
		i = 1;
		
		while ( i <= 10 ) {
			
			if(i < 3 || i >= 7) {
				System.out.println("3미만 7이상의 수 >> " + i);
			}
			i++;
		}
		
		System.out.println();
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		System.out.println("문제3) 문제2의 조건에 맞는 수들의 합 출력");
		
		i = 1;
		sum = 0;
		while ( i <= 10 ) {
			
			if(i < 3 || i >= 7) {
				sum += i;
			}
			i++;
		}
		System.out.println("합계 >> " + sum);
		
		System.out.println();
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6

		System.out.println("문제4) 문제2의 조건에 맞는 수들의 개수 출력");
		
		i = 1;
		sum = 0;
		while ( i <= 10 ) {
			
			if(i < 3 || i >= 7) {
				sum ++;
			}
			i++;
		}
		System.out.println("개수 >> " + sum);
		
		System.out.println();
	}

}
