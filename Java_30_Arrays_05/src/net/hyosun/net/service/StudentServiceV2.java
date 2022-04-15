package net.hyosun.net.service;

import java.util.Scanner;

import net.hyosun.net.utils.Line;

/*
 * ServiceV2에서 ServiceV1을 상속 받았다
 * 상속을 받으면 ServiceV1에 선언된 변수,method를 그대로 물려받는다
 * 단,생성자 제외
 * 
 * 상속 키워드가 extends(확장)인 것에 주목!!!
 * 
 */
public class StudentServiceV2 extends StudentServiceV1 {

	// 기본생성자는 클래스를 선언하면 자동으로 선언되는 생성자 메서드
	public StudentServiceV2() {

		strStudents = new String[10];
		scan = new Scanner(System.in);

	}

	// 임의 생성자

	public StudentServiceV2(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);
	}

	/*
	 * Override(재 정의) ServiceV1에 선언된 메서드 중에서
	 *  inputStudent 메서드를 다시 정의 하고 이걸 사용하겠다.
	 */
	@Override
	public int inputStudent() {
		System.out.println(Line.dLine(50));
		System.out.println("학생정보 입력 V2");
		System.out.println(Line.SLine(50));

		int index = 0;
		for (index = 0; index < strStudents.length; index++){
			System.out.printf("%d 번 학생입력(QUIT:중단)>", index + 1);
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				break;
			}
			/*
			 * for()가 시작되기전에 선언된 index는 (){}종료되어도
			 * 값을 유지하고있다
			 * 
			 * 만약 for()명령문이 모두 수행되지 않고 중단되면
			 * 
			 * index<strStudents.length
			 */
			strStudents[index]=strName;
			
		}
//		System.out.println("index:"+index);
		if(index <strStudents.length) {
			System.out.println("입력이 중단");
		}else {
			System.out.println("입력 마침");
		}
//		System.out.println("종료");
		return 0;
	}

}
