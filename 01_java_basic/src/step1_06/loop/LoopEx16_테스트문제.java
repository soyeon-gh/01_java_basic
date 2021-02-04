package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 카카오 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 */

public class LoopEx16_테스트문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		// 목적지(destination)
		int desX = random.nextInt(21) - 10;
		int desY = random.nextInt(21) - 10;

		// 카운트
		int cntX = 0;
		int cntY = 0;
		
		// 현재 위치
		int x = 0;
		int y = 0;

		// 방향(direction)
		int dir = 0;

		// 속도
		int speed = 0;

		// 요금
		int fee = 0;

		boolean isRun = true;

		while (isRun) {
			System.out.println("─────────────────────");
			System.out.println("     카카오 택시");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("─────────────────────");

			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");

			System.out.println("─────────────────────");
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();

			// 방향설정
			if (selectMenu == 1) {

				if (dir == 0) {

					System.out.println("┌────────────────────────────┐");
					System.out.println("│   동(1) 서(2) 남(3) 북(4)  │");
					System.out.println("└────────────────────────────┘");

					System.out.print(">> 방향번호를 입력해주세요 : ");
					dir = scan.nextInt();

					if (dir == 1) {
						System.out.println("┌────────────────────────────┐");
						System.out.println("│ 1번 동쪽을 선택하셨습니다. │");
						System.out.println("└────────────────────────────┘");
					} else if (dir == 2) {
						System.out.println("┌────────────────────────────┐");
						System.out.println("│ 2번 서쪽을 선택하셨습니다. │");
						System.out.println("└────────────────────────────┘");
					} else if (dir == 3) {
						System.out.println("┌────────────────────────────┐");
						System.out.println("│ 3번 남쪽을 선택하셨습니다. │");
						System.out.println("└────────────────────────────┘");
					} else if (dir == 4) {
						System.out.println("┌────────────────────────────┐");
						System.out.println("│ 4번 북쪽을 선택하셨습니다. │");
						System.out.println("└────────────────────────────┘");
					} else {
						System.out.println("┌────────────────────────────┐");
						System.out.println("│  1,2,3,4 번 중 골라주세요. │");
						System.out.println("└────────────────────────────┘");
					}
				} else {
					System.out.println("┌───────────────────────────────┐");
					System.out.println("│  이미 방향을 선택하셨습니다.  │");
					System.out.println("└───────────────────────────────┘");
				}
			} // .selectMenu 1 end

			// 속도설정
			else if (selectMenu == 2) {

				// 방향이 입력되어있으면
				if (dir != 0) {

					// 속도가 입력이 안되어있으면
					if (speed == 0) {
						System.out.println("─────────────────────");
						System.out.print("속도를 입력해주세요 : ");
						speed = scan.nextInt();

						// 속도가 3이하면
						if (speed > 0 && speed <= 3) {
							System.out.println("┌────────────────────────────┐");
							System.out.println("│  속도 " + speed + "를 입력하셨습니다.  │");
							System.out.println("└────────────────────────────┘");
						}
						// 속도가 1,2,3 외의 숫자가 입력되면
						else {
							System.out.println("┌────────────────────────────────────┐");
							System.out.println("│  1부터 최대 3까지 이동 가능합니다. │");
							System.out.println("└────────────────────────────────────┘");
							speed = 0;
						}
					}

					// 속도 값이 있는데 속도선택을 선택했을경우
					else {
						System.out.println("┌───────────────────────────────┐");
						System.out.println("│  이미 속도를 입력하셨습니다.  │");
						System.out.println("└───────────────────────────────┘");
					}
				}

				// 방향의 값이 없고 속도선택을 먼저 선택했을 경우
				else {
					System.out.println("┌───────────────────────────────┐");
					System.out.println("│   방향을 먼저 입력해주세요.   │");
					System.out.println("└───────────────────────────────┘");
				}

			} // .selectMenu 3 end

			// 이동하기
			else if (selectMenu == 3) {
				
				if (dir != 0 && speed != 0) {
					if (dir == 1) {
						x += speed;
						cntX += 1;
					} else if (dir == 2) {
						x -= speed;
						cntX += 1;
					} else if (dir == 3) {
						y -= speed;
						cntY += 1;
					} else if (dir == 4) {
						y += speed;
						cntY += 1;
					}
					
					dir = 0;
					speed = 0;
					
					if (desX == x && desY == y) {
						System.out.println("┌───────────────────────────────┐");
						System.out.println("│    목적지에 도착하셨습니다.   │");
						System.out.println("│     x축 " + cntX + "번, Y축 " + cntY + "번 이동     │");
						System.out.println("└───────────────────────────────┘");
						isRun = false;

					}
				} else {
					System.out.println("┌───────────────────────────────┐");
					System.out.println("│   방향을 먼저 입력해주세요.   │");
					System.out.println("└───────────────────────────────┘");
				}

			} // .selectMenu 3 end

			else {
				System.out.println("1,2,3 만 눌러주세요.");
			}

		}
		scan.close();
	}

}
