package net.hyosun.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.hyosun.app.dbconfig.DBConnection;
import net.hyosun.app.model.StudentVO;

public class StudentDao {
	private final Connection dbConn;

	public StudentDao() {
		dbConn = DBConnection.getDBCConnection();

	}

	public List<StudentVO> selectAll() throws SQLException {
		String sql = "SELECT*FROM tbl_student";
		PreparedStatement pStr = null;
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();

		List<StudentVO> stList = new ArrayList<>();

		while (rSet.next()){
			StudentVO stVO = new StudentVO(rSet.getString("st_num"), rSet.getString("st_name"),
					rSet.getString("st_tel"), rSet.getString("st_addr"), rSet.getString("st_dept"),
					rSet.getInt("int_grade"));

			StudentVO stVO2 = StudentVO.builder()
					.stNum(rSet.getString("st_num"))
					.stName(rSet.getString("st_name"))
					.stTel(rSet.getString("st_tel"))
					.build();

		
		}

	}

}
