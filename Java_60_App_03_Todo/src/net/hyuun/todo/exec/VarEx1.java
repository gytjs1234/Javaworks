package net.hyuun.todo.exec;

import net.hyosun.model.todo.TodoVO;

public class VarEx1 {

	public static void main(String[] args) {

		// primitive 변수
		// 순수하게 값을 저장하는 용도로만 사용하는 변수
		int num1;
		long num2;
		float num3;
		//단지 값을 변경만 가능 혹은 값을 읽어드리는 용도이다
		//순수하게 값만 저장가능

		// 클래스 타입변수, 참조형 변수
		// 1.wrapper 클래스 변수(클래스변수)
		// 사용할수 있다
		Integer num4 = 100;
		//숫자형 변수를 문자형으로 바꿔준다
		System.out.println(num4.toString());
		System.out.println(num4+"");
		Long num5;
		Float num6;

		// 2.TodoVO클래스 변수
		TodoVO tovo = new TodoVO();

		// 3.배열(이것도 참조형변수)
		int[] nums = new int[10];
		System.out.println(nums.length);

	}

}
