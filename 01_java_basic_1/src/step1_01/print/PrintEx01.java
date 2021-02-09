package step1_01.print; // 1) 패키지 선언문은 '항상' 첫줄에 작성한다.

// 2) 주석 (comment) : 설명문을 작성하기 위한 방법으로 프로그램의 실행에 영향을 미치지 않는다.

// 2-1) 라인(line)주석 : 한 줄 주석
/* 
 * 2-2) 블록(block)주석 : 여러 줄 주석
 * 
 * 3) 에디터 화면 확대 및 축소 : ctrl + [+], ctrl + [-]
 * 
 * 4) 뒤로 되돌리기(redo) : ctrl + z
 * 
 * 	  앞으로 되돌리기(undo) : ctrl + y
 * 
 * 5) 저장 : ctrl + s , 저장하지 않았을 경우 파일명 왼쪽에 *표시가 나옴 ( 항상 저장하는 습관 권장 )
 * 
 * 6) 출력문 자동완성
 *    
 *    6-1) syso + ctrl + space
 *    6-2) sysout + ctrl + space
 *    6-3) sout + ctrl + space
 *    
 * 7) 유용한 단축키
 * 
 *    7-1) 복사 : ctrl + alt + 위 or 아래 방향키
 *    7-2) 이동 : alt + 위 or 아래 방향키
 *    7-3) 블록잡기 : shift + 위 or 아래 방향키
 *    7-4) 삭제 : ctrl + d  
 *    
 * 8)
 * 9)
 * 10)
 *    
 */
public class PrintEx01 {

	public static void main(String[] args) {

		// main 함수의 {} 안에서 프로그래밍을 한다.
		// class 의 이름의 첫글자는 무조건 대문자
		// tab으로 들여쓰기 이후 코드를 작성
		// println : 자동 줄바꿈 기능
		
		System.out.println("==============");
		System.out.println("  메뉴 선택");
		System.out.println("==============");
		System.out.println("1) 로그인(login)");
		System.out.println("2) 로그아웃(logout)");
		System.out.println("3) 종료(exit)");
		
		// 아무내용 없으면 줄바꿈 기능만 적용 ( 엔터키 )
		System.out.println();
		System.out.println();
		System.out.println();
		
		// print : 줄바꿈 기능이 없음
		System.out.print("출력문 1");	
		System.out.print("출력문 2");	
		System.out.println("출력문 3");	
		
		System.out.println("-- end --");
	}

}
