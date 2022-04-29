package com.callor.app;

public class Exec1 {
	public static void main(String[] args) {

		int intNums[] = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intNums[i] = num;
			System.out.println(intNums[i]);
		}
		for (int i = 0; i < intNums.length; i++) {
			if(intNums[i]>=55){
				System.out.println(intNums[i]);
				
			}
					
		}

	}

}
