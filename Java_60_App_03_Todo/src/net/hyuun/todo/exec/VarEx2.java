package net.hyuun.todo.exec;

import java.util.ArrayList;
import java.util.List;

import net.hyosun.model.todo.TodoVO;

public class VarEx2 {

	public static void main(String[] args) {
		List<TodoVO> todoList = new ArrayList<>();

		/*
		 * 빌더 패턴을 사용한 VO 객체 생성 클래스.builder()메서드에 의해서
		 * 
		 * VO 객체가 선언되고 필드 변수로 선언한 것과 같은 이름의 setter 메서드를 사용하여
		 * 
		 * VO 객체의 변수값을 채워 넣으면서 VO 객체를 생성하는 것
		 */
		TodoVO tVO = TodoVO.builder().sdate("2022-05-11").tContent("과제하기").build();

		todoList.add(tVO);

		//todoList의 0번째 요소를 getter 하면
		//한개의 todoVO 를 추출 할수 있다
		TodoVO todoVO = todoList.get(0);
		todoVO.setTKey("009");

	}

}
