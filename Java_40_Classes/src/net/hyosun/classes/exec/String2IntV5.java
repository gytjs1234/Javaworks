package net.hyosun.classes.exec;

public class String2IntV5 {
	public static void main(String[] args) {
		
		
		//숫자 앞에 +또는-가 있는 경ㅇ두는 정상 변환 된다
		String strNum ="-3";
		strNum="+3";

		//+-이외의 기호는 	NumberFormatExcept 발생
		int intNum=Integer.valueOf(strNum);
		strNum="*3";
		System.out.println(strNum);
	}

}
