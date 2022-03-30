package net.hyosun.var;

public class Var_01 {
public static void main(String[] args) {
	
	int num1 =0;
	int num2 =0;
	//변수에 값 저장하기
	//변수에 어떤 값을 저장하면 이미 저장된 값은? : 사라진다
	num1 =33;
	num2 =55;
	
		//사칙연산 결과를 저장 보관 하기 위한 변수 선언 clear
	int intDeffrence = 0;
	int intproduct = 0;
	int intDivide = 0;
	int intsum = 0;
	
	// num1, num2 변수에 담긴 값을 읽어와서
	//4칙연산을 수행한 후 각각의 변수에 저장하기
	//변수에 담긴 값을 읽어서 연산을 수행한 후 다른 변수에 저장하기
	intsum = num1 +num2;
	intproduct = num1 * num2;
	intDivide = num1 / num2;
	intDeffrence = num1 - num2;
			
			
	
	//화면에 form 을 만든 후 출력하기
	System.out.printf("%d+%d=%d\n", num1,num2,num1+num2);
	System.out.printf("%d-%d=%d\n", num1,num2,num1-num2);
	System.out.printf("%dX%d=%d\n", num1,num2,num1*num2);
	System.out.printf("%d/%d=%d\n", num1,num2,num1/num2);
	

	System.out.printf("%d+%d=%d\n",num1,num2,intsum);
	System.out.printf("%d-%d=%d\n",num1,num2,intDeffrence);
	System.out.printf("%dX%d=%d\n",num1,num2,intproduct);
	System.out.printf("%d/%d=%d\n",num1,num2,intDivide);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
