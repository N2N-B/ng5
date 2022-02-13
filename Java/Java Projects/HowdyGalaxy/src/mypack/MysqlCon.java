package mypack;
import java.sql.*;  

public class MysqlCon {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sonoo","root","root");  //"user=root&password=root&characterEncoding=utf8"
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  

}
//java.sql.SQLException: Unknown initial character set index '255' received from server. 
//Initial client character set can be forced via the 'characterEncoding' property.SQLException 
//is a checked exception. 