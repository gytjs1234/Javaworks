package com.callor.app.exec;

public class Exec2 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int count = 0; //갯수새기
		int sum = 0; //합계
		
		//배열의 값을 채워 넣는 부분
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			boolean beven = (num[i] % 2 == 0);
			if (beven) {
				count++;
				sum += num[i];
			}

		}
		System.out.println("짝수의 갯수:" + count);
		System.out.println("짝수의 합:" + sum);

	}
	
	

}
