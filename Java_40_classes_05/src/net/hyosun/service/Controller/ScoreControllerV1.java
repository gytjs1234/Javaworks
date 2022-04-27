package net.hyosun.service.Controller;

import net.hyosun.service.Impl.ScoreServiceImplV1;
import net.hyosun.service.Impl.StudentServiceImplV1;
import net.hyosun.service.domain.StudentVO;

public class ScoreControllerV1 {
	public static void main(String[] args) {

		String stFile = "Student.txt";
		int stLength = 50;// 명
		StudentServiceImplV1 stv1 = new StudentServiceImplV1(stFile, stLength);

//		StudentServiceImplV1 sv2 = new StudentServiceImplV1();
		stv1.loadStudent();
		StudentVO[] stList = stv1.getStudents();
		StudentVO stNo1 = stv1.findByNum("0001");
		
		

		ScoreServiceImplV1 sv1 = new ScoreServiceImplV1();
		sv1.makeScore();
		int intSum = sv1.retSum();
		float fAge = sv1.retAvg();
		sv1.printScore();
	}
}
