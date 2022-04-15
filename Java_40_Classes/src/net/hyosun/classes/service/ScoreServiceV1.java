package net.hyosun.classes.service;

import java.util.Scanner;

import net.hyosun.classes.utls.LIne;

public class ScoreServiceV1 {
	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan;

	/*
	 * 상속을 염두해 두고 클래스를 선언할떄는 인스턴스변수들을 private이 아닌 protected로 선언한다.
	 * 
	 * protected : private 의 성질을 가지면서 상속받은 클래스서 상속받아 변수를 선언한 것과 같은 효과를 낸다 인스턴스변수도
	 * 상속이 된다.
	 */
	public ScoreServiceV1() {
		this(10);

	}

	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);
	}

	public int input() {
		System.out.println(LIne.dLine(lineLength));
		System.out.println("빛나라 성적처리");
		System.out.println(LIne.sLine(lineLength));

		int index = 0;
		for (index = 0; index < students.length; index++) {
			int stNum = index + 1;
			System.out.printf("%d 번 학생 이름(END:중단)", stNum);
			// 키보드에서 문자열 입력받기
			String strName = scan.nextLine();
			students[index] = strName;

			System.out.printf("%d 번 국어점수: >", stNum);
			int intScore = scan.nextInt();// 국어점수를 입력하면 intScore에담김
			intKor[index] = intScore; // 담긴 intScore을 index번째요소의 저장공간에 저장시킴

			// 이름 대신 End 문자열을 입력하면 입력받기를 중단한다
			if (strName.equals("END")) {

				break;
			}
			// 학생이름을 배열에 저장할때는 if()다음에 위치해야 한다
			// 만약 if()위에 코드를 위치하면,중단 되기전에
			// students[index]요소에 END 문자열이 먼저 저장되기 떄문에
			// 학생 이름에 ENd 가 나타 날것이다

		}
		return 0;
	}

	public void print() {
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%s\t", students[i]);
		}
		System.out.println();
	}
}
