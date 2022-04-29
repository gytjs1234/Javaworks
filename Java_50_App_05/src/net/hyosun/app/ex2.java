package net.hyosun.app;

public class ex2 {
	public static void main(String[] args) {
		int pay = 50000;
		int pay7 = 10000;
		int pay1 = 5000;
		int pay2 = 1000;
		int pay3 = 500;
		int pay4 = 100;
		int pay5 = 50;
		int pay6 = 10;

		int payment = 3000000;
		int num = payment / pay;
		int num2 = num / pay1;
		int num3 = num2 / pay2;
		int num4 = num3 / pay3;
		int num5 = num4 / pay4;
		int num6 = num5 / pay5;
		int num7 = num6 / pay6;

		System.out.println("오만원권:" + num);
		System.out.println("만원권:" + num7);
		System.out.println("오천원권:" + num2);
		System.out.println("천원권:" + num3);
		System.out.println("500원짜리:" + num4);
		System.out.println("100짜리:" + num5);
		System.out.println("50원짜리:" + num6);
		System.out.println("10원짜리:" + num7);

	}

}
