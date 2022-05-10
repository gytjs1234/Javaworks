package net.hyuun.todo.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import net.hyuun.model.todo.TodoVO;
import net.hyuun.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService {

	private final List<TodoVO> todoList;

	public TodoServiceImplV1() {
		todoList = new ArrayList<>();
	}
	/*
	 * 
	 * 매개변수로 content(할일) 내용을 전달받아 key,추가날짜,시간 를 생성한후 TodoVO에 담고 todoList에 추가하기
	 * 
	 * java에서 날짜, 시간을 취급하는 방법이 여러가지가있다. 1.7이전에서는 Date,Calendar 클래스를 사용하여 날짜와 시간을
	 * 취급했다 1.8이후에서는 LocalDate,LocalTime,LocalDateTime이라는 클래스를 시용하여 날짜와 시간을 취급한다.
	 */

	// 현재 날짜와 시간
	@Override
	public void todoInsert(String content) {
		// 컴퓨터의 현재 날짜 시각을 읽어오기
		// java 1.8에서는 Date클래스의 생성자에
		// System.currentTimeMillis());메소드를 주입해 주어야한다
		Date curDate = new Date(System.currentTimeMillis());

		// Date객체의 값을 날짜,시각 문자열 타입으로 변경하기 위한 객체 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");

		// 현재시간과 날짜,시각 들이 저장이된다.
		// SimpleDateFormat 에 의해서 패턴대로 날짜 시각 문자열을 만든다.
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);

		/*
		 * Key 값 : Data관련하여 사용되는 key,ID 값 Data의 무결성(정확한값)을 보장하기 위하여 모든 데이터(레코드단위,row단위)는
		 * 데이터를 유일하게 식별(구별)할수 있는 데이터를 가지고 있어야한다. 각 언어,DBMS등에서는 고유의 방법으로 ID를 만들고 관리한다.
		 * 
		 * java에서는 java.util.UUID 클래스를 사용하여 범 우주적으로 유일한 ID 값을 생성하는 도구를 제공한다.
		 */

		UUID uuid = UUID.randomUUID();
		String idStr = uuid.toString();

		TodoVO tVO = TodoVO.builder().tKey(idStr).tContent(content).sdate(today).build();
		todoList.add(tVO);

	}

	@Override
	public List<TodoVO> todoSelectAll() {
		return todoList;
	}

	@Override
	public void findByKey(String key) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(TodoVO tVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveTodo(String fileName) {
		// TODO Auto-generated method stub

	}

}
