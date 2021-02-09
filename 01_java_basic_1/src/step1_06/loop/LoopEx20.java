package step1_06.loop;

import java.util.Scanner;

public class LoopEx20 {

	public static void main(String[] args) {

		int i = 0;
		while (true) {
			
			if (i == 7) {
				break;
			}
			System.out.println(i);
			i++;
			
		}
		
		System.out.println();
		
		i = 0;
		
		while ( i < 8 ) {
			
			i++;
			if (i == 1 || i == 3 || i == 5) {
				continue;
			}
			System.out.println(i);
			
		}
		
		System.out.println();
		
		// continue 사용예제
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("1. 햄버거");
			System.out.println("2. 콜라");
			System.out.println("3. 감자");
			
			System.out.print("#메뉴입력 : ");
			int getMenu = scan.nextInt();
			
			if (getMenu != 1 && getMenu !=2  && getMenu != 3) {
				System.out.println("1~3번 중에 선택하세요.");
				continue;
			}
			
			if      (getMenu == 1) System.out.println("햄버거");
			else if (getMenu == 2) System.out.println("콜라");
			else if (getMenu == 3) System.out.println("감자");
			
			System.out.print("#현금 투입 :");
			int getMoney = scan.nextInt();
			
		}
		
	}

}
