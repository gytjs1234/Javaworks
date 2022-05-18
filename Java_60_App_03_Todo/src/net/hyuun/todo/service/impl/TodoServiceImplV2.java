package net.hyuun.todo.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import net.hyosun.model.todo.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1 {

	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}
	/*
	 * 저장된 todolist.txt 파일을 읽어서 todoList 에 추가하기
	 * 
	 * todolist.txt 파일 열기 한라인씩 읽어서 컴마(,)
	 *  
	 * 기준으로 split 하고 todoVO 에 담고 todoList 에 추가
	 * 
	 */

	@SuppressWarnings("resource")
	protected void loadTodoList() {
		// inputStream 을 생성하고
		FileInputStream is = null;
		// Scanner에 연결
		Scanner scan = null;

		// 파일열기를 한다
		try {
			is = new FileInputStream(saveFileName);
		} catch (FileNotFoundException e) {
			System.out.println(saveFileName+"파일이 없습니다.");
			return;
		}
		scan =new Scanner(is);
		//첫번째 key,sdate,stime,edate,etime,content
		int T_KEY=0;
		int T_SDATE=1;
		int T_STIME=2;
		int T_EDATE=3;
		int T_ETIME=4;
		int T_CONETENT=5;
		
		while(scan.hasNext()) {
			String line =scan.nextLine();
			
			//읽어들인 line을 컴마를 기준으로  분해(split)
			//분해한 결과는 String 형 배열 모양이다
			String[]todo =line.split(",");
			
			//TodoVO tVO =TodoV
			//odoList.add(tVO);
			
					
			
		}
	}
}
