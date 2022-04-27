package net.hyosun.service;

import net.hyosun.service.domain.StudentVO;

// StudentServie 가 할일
/*
 * 1.student.txt 파일을 읽어서 학생 데이터들 만들기
 * 2.생성된 학생데이터들을 return해주기
 * 3.학번을 argument로 받아서 해당 학생데이터를 return해주기
 */
public interface StudentService {
	/*
	 * 추상 메서드 메서드의 접근제한자(public),메서드의 이름,
	 * 매게변수,return type만 정의한것
	 * 연산(실행)되는 실제 코드가 없는 method
	 */
	
	
	//추상메서드
	public void loadStudent();

	public StudentVO[] getStudents();

	// stNum 학번을 학생데이터들에서 찾아서(findByNum)
	// 학생 데이터를 return하기
	
	//추상메서드는 
	public StudentVO findByNum(String stNum);

}
