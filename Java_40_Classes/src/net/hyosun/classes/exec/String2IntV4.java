package net.hyosun.classes.exec;

import java.util.Scanner;

public class String2IntV4 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("정수입력>");
		
		/*
		int intNum =scan.nextInt(); 메서드는 Enter다음의
		nextLine()에 전달하여 이후의 nextLine()에 문제를 일으킨다
		 * 
		 */
		
		String strNum =scan.nextLine();
		int intNum =0;
		if(strNum.equals("")) {
			System.out.println("숫자만 입력해 주세요");
		}else {
		
			intNum =Integer.valueOf(strNum);
		}
		
		String strValue =scan.nextLine();
		System.out.print("문자열 입력>");
		
		System.out.println("입력된 정수" +intNum);
		System.out.println("입력된 문자열"+strValue);
	}

}
