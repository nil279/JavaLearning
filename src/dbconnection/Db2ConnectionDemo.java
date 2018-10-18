package dbconnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import filesneed.PropertyFile;

public class Db2ConnectionDemo {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(Db2ConnectionDemo.class);
		logger.info("Create connection to DB2");
		
		String JDBCClassName1 = "com.ibm.db2.jcc.DB2Driver";
		System.out.println("test");

		String url = null;
		String user = null;
		String password = null;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String rowcnt = null;	

		// get credentials from property file :

		Properties prop = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream stream = loader.getResourceAsStream("Db2Con.properties");
		try {
			prop.load(stream);
			
			logger.info("Loaded property file");
						
			url = prop.getProperty("dburl");
			user = prop.getProperty("dbuser");
			password = prop.getProperty("dbpassword");
			//String sds = (String) prop.setProperty("temp","temporary");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// DB2 connection
		logger.info(url);
		logger.info(user);
		logger.info(password);
		try {
			// Load class into memory
			Class.forName(JDBCClassName1);
			// Establish connection
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT count(*) FROM DB2ADMIN.SYSCOVERAGECODE FETCH FOR FETCH ONLY WITH UR");
			while (rs.next()) {
				rowcnt = rs.getString(1);
				logger.info("Total count of rows = " + rowcnt);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				logger.info("Connected successfully.");
				try {
					conn.close();
					logger.info("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		// System.exit(0);
	}
}
