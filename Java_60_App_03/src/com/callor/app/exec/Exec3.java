package com.callor.app.exec;

public class Exec3 {
	public static void main(String[] args) {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			System.out.println(num[i]);

		}

		System.out.println("=======================");
		int intSum = 0;
		for (int i = 1; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			intSum += num[i];
		}
		System.out.println("정수의 합:" + intSum);
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		/*
		 * 이
		 */
		float  fAvg=0;
		for(int i=0; i<num.length;i++) {
			num[i]=(int)(Math.random() * 100) + 1;
			fAvg=intSum/num.length;
		}
		System.out.println("평균:"+fAvg);

	}
}
