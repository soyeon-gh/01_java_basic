package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//메뉴 가격
		int price1 = 8700; 
		int price2 = 6200;
		int price3 = 1500;
		
		int cnt = 1; // 반복횟수
		int sum = 0; // 총금액
		
		//메뉴 선택 횟수
		int cntPrice1 = 0;
		int cntPrice2 = 0;
		int cntPrice3 = 0;
		
		System.out.println("====== 롯데리아 ======");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		while (cnt <= 5) {
			
			System.out.print("메뉴를 선택해주세요 >> ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				sum += price1;
				cntPrice1++;
			} else if(menu == 2) {
				sum += price2;
				cntPrice2++;
			} else if(menu == 3) {
				sum += price3;
				cntPrice3++;
			} else {
				System.out.println("*** 메뉴는 1,2,3 번 중 선택해주세요 ***");
			}
			
			cnt++;
		}	
		
		System.out.println("총 금액 : " + sum + "원");
		System.out.print("현금 입력 : ");
		int money = sc.nextInt();
		
		int change = money - sum; // 잔돈
		
		if(money > sum) {
			System.out.println();
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 불고기 버거 : " + cntPrice1 + "개");
			System.out.println("2. 새우   버거 : " + cntPrice2 + "개");
			System.out.println("3. 콜       라 : " + cntPrice3 + "개");
			System.out.println("4. 총   금  액 : " + sum + "원");
			System.out.println("5. 잔       돈 : " + change + "원");
			
		} else {
			System.out.println("돈이 부족합니다.");
		}
		
		
		sc.close();
	}

}
