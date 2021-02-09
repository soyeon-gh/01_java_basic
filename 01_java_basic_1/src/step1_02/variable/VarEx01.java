package step1_02.variable;

/*
 * 
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 *  
 * 
 * */

public class VarEx01 {

	public static void main(String[] args) {

		/*
		
		1. 정수 : Integer(int)
		2. 실수 : double
		3. 문자 1개 : Character(char)
		4. 문자열 : String
		5. 참과 거짓 : boolean
		
		*/
		
		int nData; // 변수의 선언(쓰레기 데이터가 저장되어있다.)
		nData = 10; // 변수의 값을 저장
		System.out.println(nData);
		
		double fData = 3.14;
		System.out.println(fData);
		
		char cData1 = 'a';
		char cData2 = '가';
		System.out.println(cData1);
		System.out.println(cData2);
		
		String strData = "JAVA";
		System.out.println(strData);
		
		boolean isChecked = true;
		System.out.println(isChecked);
		
		int tempData = 10;
		//int tempData = 9; >> error : 변수명은 고유해야만 한다.
		tempData = 9;
		tempData = 7;
		System.out.println(tempData); // 최근 값만 저장되어 있다.
		
	}

}
