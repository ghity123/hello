package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

public class C3p0Test {
	
	@Test
	public void testSelect() throws SQLException{
		System.out.println("ggg");
		Connection conn=C3p0Util.getConnection();
		PreparedStatement ps=null;
		ps=conn.prepareStatement("insert into account values(4,100,'jimi')");
		ps.executeUpdate();
		
		
	}

}
