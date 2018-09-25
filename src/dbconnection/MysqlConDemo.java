package dbconnection;

import java.sql.*;

public class MysqlConDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sonoo";
		String user = "centtric\\npatel";
		String password = "Notes!60";
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			 con = DriverManager.getConnection(url, user,password);
			 
			 Statement stmt=con.createStatement();  
			 ResultSet rs=stmt.executeQuery("select * from emp");  
			 while(rs.next())  
			 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
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
					System.out.println("Connection closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
						
		}
	}
