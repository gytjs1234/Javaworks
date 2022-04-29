package net.hyosun.app.exec;

public class Exec7 {
	public static void main(String[] args) {
		
		int intNum[] = new int[100];
		int count = 0;
		for (int i = 0; i < intNum.length; i++) {

			int Nums = (int)(Math.random() * 100) + 2;
			intNum[i] = Nums;

		}
		
		for (int i = 2; i < intNum.length; i++) {
			if(intNum[i]%i==0){
				 break;
			}else {
				count++;
			}
		}
		System.out.printf("소수갯수:"+count);

	}
}
