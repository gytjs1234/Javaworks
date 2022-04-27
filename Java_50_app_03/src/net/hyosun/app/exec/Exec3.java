package net.hyosun.app.exec;

public class Exec3 {
	/*
	 * 임의의 정수 10개를 만들어 각각의 수를 even()메서드에 매개변수로 전달하고 even()메서드는 매개변수로 전달받은 값이 짝수이면
	 * 전달받은 값,아니면 0을 return even()메서드가 return 한 값을 합산하여 출력
	 */
	public static void main(String[] args) {
		System.out.println();

	}

	public static int even() {
		int Num = (int) (Math.random() * 10) + 1;
		if (Num % 2 == 0) {
			
		} else {
			System.out.println(0);
		}
		
		return 0;
	}
	public static int even(int num) {

		return 0;
	}
}
