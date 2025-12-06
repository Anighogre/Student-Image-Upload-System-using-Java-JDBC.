package com.ani.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ani.beans.Student;
import com.ani.connection.ConnectionProvider;

public class StudentService implements IstudentService {

	@Override
	public int insertData(Student std) {
		Connection con = ConnectionProvider.getConnection();
		String query1 = "insert into student06 values(?,?,?,?)";
		int res = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getRoll_Number());
			pstmt.setString(3, std.getAddress());
			pstmt.setBlob(4, std.getInputstream());
			
			 res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public void fetchData(int rollNo) 
	{
		

	}

}
