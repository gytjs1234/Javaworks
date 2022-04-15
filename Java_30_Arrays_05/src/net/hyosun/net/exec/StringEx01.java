package net.hyosun.net.exec;

public class StringEx01 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String strNation ="KOREA";
		System.out.println(strNation=="KOREA");
		
		/*
		 * 문자열형 변수는 숫자형, 불린형 변수와 저장방식이
		 * 다르다
		 * 떄문에 문자열형 변수에 저장된 문자열을 EQ(==)비교를 하는것은
		 * 매우 위험한 코드가 될수 있다.
		 * 문자열형 변수는 절대EQ(==)또는 Not EQ(!=)를 사용하여
		 * 비교하지 않는다.
		 * 
		 * 
		 */
		String strName = new String("홍길동");
		System.out.println(strName);
		System.out.println(strName=="홍길동");
		
		System.out.println(strNation.equals("KOREA"));
		System.out.println(strName.equals("홍길동"));
		
		boolean bYes = strNation.equals("KOREA");
		if(bYes) {
			System.out.println("strNation 변수에는 \"KOREA\" 가 담겨있다");
		}
		bYes=strName.equals("홍길동");
		
		strNation ="Republic of Korea";
		bYes = strNation.equals("Republic of Korea");
		System.out.println("d"+bYes);
		
		
		//아래의 코드를 한문장의 명령문으로 완성하기
		String upString =strNation.toUpperCase();
		bYes =upString.equals("REPUBLIC OF KOREA");
		System.out.println("a"+bYes);
		
		//method Chaining
		bYes = strNation.toUpperCase().equals("REPUBIC OF KOREA");
		bYes= strNation.toLowerCase().equals("republic of korea");
		
		bYes =strNation.equalsIgnoreCase("republic of Korea");
		//대소문자를 무시하고 문자열을 비교하라  띄어쓰기는 무시하지않는다
		
	}
	
}
