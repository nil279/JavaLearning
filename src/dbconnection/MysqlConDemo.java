package dbconnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import org.apache.log4j.Logger;

public class MysqlConDemo {

	public static void main(String[] args) {
		String url = null;
		String user = null;
		String password = null;
		Connection con = null;
		 
		Logger logger = Logger.getLogger(MysqlConDemo.class);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			// get credentials from property file :

			Properties prop = new Properties();
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			InputStream stream = loader.getResourceAsStream("mysqlCon.properties");
			
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
			//

			 con = DriverManager.getConnection(url, user,password);
			 
			 Statement stmt=con.createStatement();  
			 ResultSet rs=stmt.executeQuery("select * from notes");  
			 while(rs.next())  
			 logger.info(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			 //con.close();  

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally{
			if(con!=null){
				try {
					con.close();
					logger.info("Connection closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
						
		}
	}
