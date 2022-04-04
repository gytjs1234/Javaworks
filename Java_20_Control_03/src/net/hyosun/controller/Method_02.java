package net.hyosun.controller;

public class Method_02 {

	public static void main(String[] args) {
     	
	int Num3=add();
	int Num4=multi();
		
		System.out.println(Num3);
		System.out.println(Num4);

		
	}
	public static int add(){
    int Num1=0;
    int Num2=0;
    Num1=(int)(Math.random()*100)+1;
    Num2=(int)(Math.random()*100)+1;
	int intSum=Num1+Num2;
	
    
		return intSum;
	}
	public static int multi(){
		int Num1=0;
		int Num2=0;
		Num1=(int)(Math.random()*100)+1;
		Num2=(int)(Math.random()*100)+1;
		int intmulti=Num1*Num2;
		
		return intmulti;
	}
	
}
