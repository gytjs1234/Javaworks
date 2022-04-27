package net.hyosun.app.service;

import java.util.List;

import net.hyosun.app.domain.StudentVO;
//2
public interface StudentService {
	
	public void loadStudent();
	public List<StudentVO> getStudents(); //전체가져오기
	public StudentVO findByStNum(String stNum); //학번으로가져오기
	
	
						    					
	public List<StudentVO> findByStName(String stName);

}
