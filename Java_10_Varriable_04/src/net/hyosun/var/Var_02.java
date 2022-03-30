package net.hyosun.var;

public class Var_02 {
public static void main(String[] args) {
	
	
	int intNum1 = 0;
	intNum1 =num1();
	System.out.println(intNum1);
	
	int intNum2 =0;
	intNum2 =33;
	intNum2 = intNum1 +100;
	
	
	/*
	 * add() : add method 라고 읽는다
	 *  add()를 실해 하여 그결과를 intNum2에 저장해 달라 
	 *  */
	
	intNum2 =add();
}//end main() 메서드

//add()메소드 를 선언하기  자바에 없는 명령어를 만들었음
public static int add( ) {
	//정수 55와 33을 덧셈하여 return  하기
	return 55 + 33;
}//add 메소드 끝

//num1()를 선언하기
public static int num1 () {
//num1 메소드를 선언했다.	
	return 100;
	//명령  +문장
	/*1. 숫자직접입력
	2.다른변수의 값을 읽어서 입력
	3. 어떤 명령을 수행해서 그 결과를 담는 방법*/
	
}//num1 메소드 끝

}
