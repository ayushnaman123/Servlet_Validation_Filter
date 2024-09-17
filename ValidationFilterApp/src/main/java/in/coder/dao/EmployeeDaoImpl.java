package in.coder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.coder.dto.Employee;
import in.coder.util.JdbcUtil;

public class EmployeeDaoImpl implements IEmployeeDao {
	private static final String sqlInsertQuery = "Insert into employee(`eid`,`ename`,`eage`,`email`,`emobile`) value(?,?,?,?,?)";
	@Override
	public String doInsert(Employee employee) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		String status = null;
		try {
			connection = JdbcUtil.getJdbcConnection();
			if(connection!=null) {
				 pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			
			if(pstmt!=null) {
				pstmt.setString(1, employee.geteId());
				pstmt.setString(2, employee.geteName());
				pstmt.setInt(3, employee.geteAge());
				pstmt.setString(4, employee.geteMail());
				pstmt.setString(5, employee.geteMobile());
				
				int rowsAffected = pstmt.executeUpdate();
				
				if(rowsAffected==1)
					status="success";
				else
					status="failure";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
