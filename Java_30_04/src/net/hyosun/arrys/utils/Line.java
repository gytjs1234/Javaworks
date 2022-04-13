package net.hyosun.arrys.utils;

public class Line {

	/*
	 * class 영역에 dLine,sLine 문자열형 변수를 선언
		static: 프로젝트 코드가 실행되는 순간 항상 자동으로 사용할 준비가 되도록
			선언하는키워드
			final:변수에 final 키워드가 부착되면,한번 저장된 값을
			절대 변경할수 없다(can not assign)
			프로젝트에서 공통으로 공유하여 사용할 변수는
			public static final 키워드를 함꼐 사용한다.
	 */
	/*
	 * dLine(변수)속성은 static 으로 선언되어 있기떄문에
	 * Line클래스를 인스턴스로 생성하지 않고도 접근할수있다.
	 */
	public static final String dLine = "=".repeat(100);
	public static final String sLine = "-".repeat(100);
	
	/*
	 * return type 이 문자열형(String 형 ,String type)인
	 * dLine method 선언
	 */
	public static String dLine(int count){
		String dLine ="=";
		return dLine.repeat(count);
		
	}
	/*
	 * int type argument 가 1개있고
	 * return type 이 String type(문자열 형) 인 sLine method 선언
	 */
	public static String sLine(int count) {
		String sLine ="-";
		return sLine.repeat(count);
	}
}
