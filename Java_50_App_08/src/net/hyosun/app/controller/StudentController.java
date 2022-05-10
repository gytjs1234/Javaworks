package net.hyosun.app.controller;

import java.sql.SQLException;
import java.util.List;

import net.hyosun.app.model.StudentVO;
import net.hyosun.app.pesistance.StudentDao;

public class StudentController{
	public static void main(String[] args) {
		StudentDao stDao = new StudentDao();
		try {
			List<StudentVO> stList = stDao.selectAll();
			for (StudentVO stVO : stList){
				System.out.println(stVO.toString());
			}
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
