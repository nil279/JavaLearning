package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Db2ConnectionDemo {

	public static void main(String[] args) {
		String JDBCClassName1 = "com.ibm.db2.jcc.DB2Driver";
		// String JDBCClassName1 = "COM.ibm.db2os390.sqlj.jdbc.DB2SQLJDriver";
		String url = "jdbc:db2://CPRMDEV.CENTTRIC.COM:50000/CPJDCDQtest";
		String user = "centtric\\npatel";
		String password = "<password>";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null ;
		String rowcnt = null;

		try {
			// Load class into memory
			Class.forName(JDBCClassName1);
			// Establish connection			
   			conn = DriverManager.getConnection(url, user, password); 
   			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT count(*) FROM DB2ADMIN.SYSCOVERAGECODE FETCH FOR FETCH ONLY WITH UR");  
			while (rs.next()) {
				rowcnt = rs.getString(1);
		        System.out.println("Total count of rows = " + rowcnt);
		      }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				System.out.println("Connected successfully.");
				try {
					conn.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		//System.exit(0);
		}
}
