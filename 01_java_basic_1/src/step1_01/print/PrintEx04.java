package step1_01.print;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx04 {

	public static void main(String[] args) {
		
		/*
		 * 
		 *  # Date
		 *  
		 * 	[1] 날짜 및 시간 출력 서식 지정 방법
		 *  	. 날짜 및 시간 서식에 사용되는 영문자를 제외한 나머지 문자는 입력하는 그대로 출력된다.
		 *  	. Date date = new Date();
		 *  	. SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식");
		 *  [2] 날짜 및 시간 서식 적용 방법
		 *  	. sdf.format(date);
		 *  [3] 날짜 및 시작 출력 서식 문자의 종류
		 *  	. 구글에서 "simpledateformat 날짜 형식" 라고 검색하기
		 *  
		 *  
		 *  # System.currentTimeMillis()
		 *   
		 * 	- 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		 *   - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long로 처리해야 한다.
		 *   
		 */
		//ctrl + shift + o : 전체 import
		 // 구글 > 자바api 검색 > oracle홈페이지에서 메뉴얼을 볼 수 있다.
		
		
		
		Date d = new Date();
		//timestamp
		
		System.out.println(d);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sdf2.format(d));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		System.out.println(sdf3.format(d));
		
		System.out.println("\n==========================");
		
		//int time = System.currentTimeMillis(); //에러발생
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(sdf1.format(time));
		System.out.println(sdf2.format(time));
		System.out.println(sdf3.format(time));
		int number = 100000000;
		System.out.println(number);
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		System.out.println(nf.format(number));
		
		nf = NumberFormat.getCurrencyInstance();				// 통화 기호
		System.out.println(nf.format(number));
		
		nf = NumberFormat.getPercentInstance();					// 백분율
		System.out.println(nf.format(number));
		System.out.println("============================================================");
		
		// DecimalFormat df = new DecimalFormat("숫자 서식");
		// 숫자 서식은 무조건 "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여준다.
		DecimalFormat df = new DecimalFormat("#,##0");			// 천 단위 구분 기호
		System.out.println(df.format(number));
		
		df = new DecimalFormat("￦#,##0");						// 통화 기호
		System.out.println(df.format(number));
		
		df = new DecimalFormat("￥#,##0");
		System.out.println(df.format(number));
		
		df = new DecimalFormat("€#,##0");
		System.out.println(df.format(number));
		
		df = new DecimalFormat("￡#,##0");
		System.out.println(df.format(number));
		
		df = new DecimalFormat("$#,##0.00");					// 소숫점 아래 숫자를 출력하려면 "#,##0"뒤에 "."을 찍고 필요한 자리 만큼 "0"을 입력한다.
		System.out.println(df.format(1000000000.1234));
		
		df = new DecimalFormat("#,##0%");						// 백분율
		System.out.println(df.format(number));
		System.out.println("=================================================================\n");
		
		// String.format("형식"); 	// 문자열의 형식을 지정한다.
		String st = String.format("test : %d , %d , %d ,%d",1,3,5,7);
		System.out.println(st);
		
		st = String.format("test : %d/%d/%d/%d",1,3,5,7);
		System.out.println(st);
		
		st = String.format("=== %d/%d/%d/%d ===",1,3,5,7);
		System.out.println(st);
		
	}

}
