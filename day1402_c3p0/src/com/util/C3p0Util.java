package com.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Util {
	//得到数据源
	private static DataSource ds=new ComboPooledDataSource();
	
	public static Connection getConnection() throws SQLException{
		Connection c=null;
		c=ds.getConnection();		
		return c;
	}
	//关闭连接
	   public static void closeAll(ResultSet rs ,Statement st,Connection conn){
				if(rs!=null){
					try {
						rs.close();
					} catch (SQLException e) {
									e.printStackTrace();
					}
					
				}
				
				
				if(st!=null){
					try {
						st.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				if(conn!=null){
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
					
				}
				
			}
}
