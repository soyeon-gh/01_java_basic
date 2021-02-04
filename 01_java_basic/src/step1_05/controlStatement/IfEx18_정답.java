package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_정답 {

	public static void main(String[] args) {
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		com = random.nextInt(3);
		
		System.out.println("==== 가위바위보 게임 ====");
		System.out.println("0 : 가위 , 1 : 바위 , 2 : 보");
		System.out.print("ME >> ");
		me = sc.nextInt();
		
		if (me == com) {
			System.out.println("COM >> " + com);
			System.out.println("ME >> " + me);
			System.out.println("비김");
		} else if (me == 0 && com == 1) {
			System.out.println("COM >> " + com + ".바위");
			System.out.println("ME >> " + me + ".가위");
			System.out.println("COM WIN!!");
		} else if (me == 0 && com == 2) {
			System.out.println("COM >> " + com + ".보");
			System.out.println("ME >> " + me + ".가위");
			System.out.println("WIN!!");
		} else if (me == 1 && com == 2) {
			System.out.println("COM >> " + com + ".보");
			System.out.println("ME >> " + me + ".바위");
			System.out.println("COM WIN!!");
		} else if (me == 1 && com == 0) {
			System.out.println("COM >> " + com + ".가위");
			System.out.println("ME >> " + me + ".바위");
			System.out.println("WIN!!");
		} else if (me == 2 && com == 0) {
			System.out.println("COM >> " + com + ".가위");
			System.out.println("ME >> " + me + ".보");
			System.out.println("COM WIN!!");
		} else if (me == 2 && com == 1) {
			System.out.println("COM >> " + com + ".바위");
			System.out.println("ME >> " + me + ".보");
			System.out.println("WIN!!");
		} 
		
		sc.close();
	}

}
