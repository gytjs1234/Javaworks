package net.hyosun.app.exec;

import java.util.ArrayList;
import java.util.List;

public class LIstEx1 {
	public static void main(String[] args) {
		/*
		 * List(ArrayList) java 에서 배열을 대신하여 사용되는 자료형 여러가지 자료형 중에서
		 *  가장 많이 사용하는 구조 List는
		 * interface이다 ArrayList:구현 클래스(인터페이스를 상속받는친구다.)
		 * 
		 */
		List<Integer> intList = new ArrayList<>();

		// 구현클래스 만으로 객체를 선언하고 생성하는 코드를 사용할수는 있지만,interface가 있는 경우는
		// 인터페이스를 사용하여 객체를 선언하는 것이 좋다.

		ArrayList<String> strList = new ArrayList<>();
		
		//List형 자료는 저장 추가 할 데이터의 type을 
		//Generic 으로 설정한다
		//Generic 으로 설정할수 있는 type 은 바드시 class  type이어야 한다.
		//primitive type은 Generic으로 설정 할수없다.
		List<Float> floatList =new  ArrayList<>();
	}

}
