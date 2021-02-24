package step1_06.loop;

/*
 * # 2차원 반복문
 * 
 * 1   2  3  4  5
 * 10  9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */

public class LoopEx24_정답 {

	public static void main(String[] args) {

		int x = 1;
		int y = 5;
		
		
		for (int i = 0; i < 5; i++) {

			if (i % 2 == 0) {
				for (int j = x; j <= y; j++) {
					System.out.print(" " + j + "\t");
				}
			}
			else {
				for (int j = y; j >= x; j--) {
					System.out.print(" " + j + "\t");
				}
			}
			System.out.println();
			x = y + 1;
			y += 5;
			
		}

	}

}
