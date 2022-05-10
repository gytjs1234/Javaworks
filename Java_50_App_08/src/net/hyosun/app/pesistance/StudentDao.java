package net.hyosun.app.pesistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.hyosun.app.dbconfig.DBCconnection;
import net.hyosun.app.dbconfig.DBContract;
import net.hyosun.app.model.StudentVO;

public class StudentDao {
	private final Connection dbConn;

	public StudentDao() {
		// TODO Auto-generated constructor stub
		dbConn = DBCconnection.getDBConnection();

	}

	/*
	 * 예외처리하는 두가지방법 1.예외가 발생할 만한 코드를 try-catch로 묶어주는 방법 2.나를 호출한 곳으로 던지기
	 * 
	 * dao.selectAll() 예외가 발생하면 List<StudentVO>=dao.selectAll();
	 */
	public List<StudentVO> selectAll() throws SQLException {
		PreparedStatement pStr = null;
		String sql = DBContract.ST_SELECT;
		pStr = dbConn.prepareStatement(sql);
				//연결통로를 통헤 문자sql을전달함
		ResultSet rSet = pStr.executeQuery(); //호출하는용도
		return getResult(rSet);

	}
	
	
	
	
	

	private List<StudentVO> getResult(ResultSet rSet) throws SQLException {
		List<StudentVO> stList = new ArrayList<>();
		while (rSet.next()) {
			StudentVO stVO = StudentVO.builder()
					.stName(rSet.getString(DBContract.ST_COL.ST_NAME))
					.stGrade(rSet.getInt(DBContract.ST_COL.ST_GRADE))
					.stAddr(rSet.getString(DBContract.ST_COL.ST_ADDR))
					.stDept(rSet.getString(DBContract.ST_COL.ST_DEPT))
					.stNum(rSet.getString(DBContract.ST_COL.ST_NUM))
					
					.build();

			stList.add(stVO);

		}
		
		return stList;
	}

}
