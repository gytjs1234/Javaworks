 package net.hyosun.var;

public class Var_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		num1 = num1 + 10; // 영문자 17글자 (빈칸 ;)포함해서

		// 용량을 줄이기 위해서
		num1=num1+10; // 영문자13글자
        
		
		num1+= 10; // num1 =num1 +10;과 똑같은 코드
		
		num1 +=1; //1증가 시키기
		num1 +=1; 
		num1 +=1; 
		
		num1 ++; //1만 증가시킬떄 (많이사용됨)
		
		num1= num1 - 10; 
		num1-=10;        //위아래 같은코드 같은의미
		
		num1 = num1 - 1;
		num1 -=1;
		num1 --; //1씩 증가할떄

		num1 *=3;   //num1=num1*3; 원래의 num1 값에 3을 곱해서 다시 num1에 저장하라

		num1 -=3; //num1 =num1-3;
		num1 /=3; //num1 =num1/3;
		num1 %=2; // num1=num1 % 2;
		
		
		
		
		System.out.println(num1);
		
		
		
		
		
		
	}

}
