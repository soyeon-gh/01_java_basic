package step1_06.loop;

/*
 * 
 *  # 삼각형 출력하기
 * 
 *         1
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7
 *  8 8 8 8 8 8 8 8
 * 9 9 9 9 9 9 9 9 9 
 * 
*/

public class LoopEx28_테스트문제 {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("LoopEx28_테스트문제");
		System.out.println("# 삼각형 출력하기");
		System.out.println();
		
		int k = 0;

		for (int i = 1; i < 10; i++) {

			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= k; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			k += 1;

		}
		System.out.println();

	}

}
