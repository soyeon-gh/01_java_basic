package step1_06.loop;


//# 반복문 기본문제[2단계]

public class LoopEx03_정답예시 {

	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		int tot = 0;
		int i = 1;
		while (i <= 5) {
			tot += i;
		/*	tot =  0 + 1	tot = 1
		 *  tot =  1 + 2	tot = 3
		 *  tot =  3 + 3   	tot = 6
		 *  tot =  6 + 4	tot = 10
		 *  tot =  10+ 5	tot = 15
		 */
			i++;
		}
		System.out.println("tot = " + tot);
		
		
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		i = 1;
		while (i <= 10) {
			
			if (7 <= i || i < 3) {
				System.out.print(i + " ");
			}
			i++;
			
		}
		System.out.println();
		
		
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		tot = 0;
		i = 1;
		
		while (i <= 10) {
			
			if (7 <= i || i < 3) {
				tot = tot + i;
			}
			i++;
			
		}
		System.out.println("tot = " + tot);
		
		
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		
		int cnt = 0;
		i = 1;
		
		while (i <= 10) {
			
			if (7 <= i || i < 3) {
				cnt++;
			}
			i++;
			
		}
		System.out.println("cnt = " + cnt);


	}

}
