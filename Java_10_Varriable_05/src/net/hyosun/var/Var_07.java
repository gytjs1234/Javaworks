package net.hyosun.var;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Var_07 {
public static void main(String[] args) {
	
	int intNum = (int)(Math.random()*1000)+10;
	int intANS =33;
	
	
	
	/*
	 * Logic Algebra(비교연산), boolean 연산
	 * intNum 에 담긴 값이 제시된 값보다 크거나 작은것을
	 * 판단하는 연산
	 */
	System.out.println(intNum);
	System.out.println(intNum > intANS);
	
	
	//==true false 검사하는 표식  로직연산 
	System.out.println((intNum%2)== 0);	
	

}
}
