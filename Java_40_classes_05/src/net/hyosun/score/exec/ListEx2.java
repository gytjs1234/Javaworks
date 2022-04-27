package net.hyosun.score.exec;

import java.util.ArrayList;
import java.util.List;

import net.hyosun.service.domain.StudentVO;

public class ListEx2 {
	public static void main(String[] args) {
		// 자바9부터는 뒤에꺼 생략가능

		List<StudentVO> stList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			StudentVO vo = new StudentVO();

			String strNum = String.format("%05d", i + 1);

			int intNum = (int) (Math.random() * 100) + 1;
			int intGrade = (intNum % 4) + 1;
			String strGrade = intGrade + "";
			vo.setStName(strNum);
			vo.setStName(strGrade);
			System.out.println(vo.toString());
			stList.add(vo);

		}
	}

}
