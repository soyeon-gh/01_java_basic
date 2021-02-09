package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_정답 {

	public static void main(String[] args) {
		System.out.println("369게임시작!");
		int i = 1;
		while (i <= 50) {

			int number10 = i / 10; // 10의자리
			int number1 = i % 10;  // 1의자리

			if (number1 != 0 && number1 % 3 == 0 || number10 == 3) { 
				if(number10 == 3 && number1 % 3 == 0) {
					System.out.println("짝짝");
				} else {
					System.out.println("짝");
				}
			}
			else {
				System.out.println(i);
			}
			i++;
		}
	}

}
