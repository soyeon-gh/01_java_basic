package step1_06.loop;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */

// 2021.01.29. 20:25
public class LoopEx11_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		boolean isRunnig = true;
		int playCount = 1;
		
		System.out.println("===================================");
		System.out.println("# 베스킨라빈스31");
		System.out.println("p1과 p2가 번갈아가면서 1~3 중 입력");
		System.out.println("31을 넘으면 게임은 종료");
		System.out.println("===================================");
		while (isRunnig) {
			
				if (br < 31) {
					System.out.println(playCount + "턴");
					System.out.print("p1 >> ");
					p1 = sc.nextInt();
					br += p1;
					System.out.println("숫자 카운트 : " + br);
					System.out.print("p2 >> ");
					p2 = sc.nextInt();
					br += p2;
					System.out.println("숫자 카운트 : " + br);
				}
				else {
					System.out.println("게임종료");
					isRunnig = false;
				}
				playCount++;
			
		}
		sc.close();

	}

}
