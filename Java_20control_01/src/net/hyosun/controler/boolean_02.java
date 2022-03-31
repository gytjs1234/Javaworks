package net.hyosun.controler;

public class boolean_02 {
public static void main(String[] args) {
	
	boolean bYes = true;
	
//bYes 에 저장된 값을 출력	
	System.out.println(bYes);
	//bYes에 저장된 값이 true 인지 비교연산하여 결과를 출력
	System.out.println(bYes == true);
	
	
	boolean bWhat = bYes;
	bWhat = bYes ==true;
	
}//end main()


public static boolean bYes() {
	return true;
	
}
}
