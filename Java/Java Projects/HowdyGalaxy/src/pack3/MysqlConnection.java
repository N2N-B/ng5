package pack3;
import java.sql.*;  

public class MysqlConnection {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sonoo?" + "user=root&password=root&characterEncoding=utf8");  
		//here sonoo is database name, root is user name and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from sonoo.emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  

}
//create database sonoo;  
//use sonoo;  
//create table emp(id int(10),name varchar(40),age int(3));  
//JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database. 
//It is a part of JavaSE (Java Standard Edition). JDBC API uses JDBC drivers to connect with the database. There are four types of JDBC drivers:

//JDBC-ODBC Bridge Driver,
//Native Driver,
//Network Protocol Driver, and
//Thin Driver
//We have discussed the above four drivers in the next chapter.
//
//We can use JDBC API to access tabular data stored in any relational database. 
//By the help of JDBC API, we can save, update, delete and fetch data from the database. 
//It is like Open Database Connectivity (ODBC) provided by Microsoft.

//We can use JDBC API to handle database using Java program and can perform the following activities:

//Connect to the database
//Execute queries and update statements to the database
//Retrieve the result received from the database.

//What is API
//API (Application programming interface) is a document that contains a description of all the features 
//of a product or software. It represents classes and interfaces that software programs can follow to communicate 
//with each other. An API can be created for applications, libraries, operating systems, etc.

//There are 5 steps to connect any java application with the database using JDBC. These steps are as follows:
//Register the Driver class
//Create connection
//Create statement
//Execute queries
//Close connection

//1) Register the driver class
//The forName() method of Class class is used to register the driver class.
//Example to register the OracleDriver class
//Here, Java program is loading oracle driver to esteblish database connection.

//Class.forName("oracle.jdbc.driver.OracleDriver");  

//Java program is loading mysql driver to establish database connection.
//Class.forName("com.mysql.jdbc.Driver");  

// 2) Create the connection object
//The getConnection() method of DriverManager class is used to establish connection with the database.

//Example to establish connection with the Oracle database
//Connection con=DriverManager.getConnection(  
//"jdbc:oracle:thin:@localhost:1521:xe","system","password");  

//Example to establish connection with the mysql database
//Connection con=DriverManager.getConnection(  
//		"jdbc:mysql://localhost:3306/sonoo?" + "user=root&password=root&characterEncoding=utf8");  
//		//here sonoo is database name, root is user name and password  

//3) Create the Statement object
//The createStatement() method of Connection interface is used to create statement.

//Example to create the statement object
//Statement stmt=con.createStatement();  

//4) Execute the query
//The executeQuery() method of Statement interface is used to execute queries to the database. 
//This method returns the object of ResultSet that can be used to get all the records of a table.
//
//Example to execute query
//ResultSet rs=stmt.executeQuery("select * from emp");  
//  
//while(rs.next()){  
//System.out.println(rs.getInt(1)+" "+rs.getString(2));  
//}  

//5) Close the connection object
//By closing connection object statement and ResultSet will be closed automatically. 
//The close() method of Connection interface is used to close the connection

//Example to close connection
//con.close(); 

//DriverManager class
//The DriverManager class acts as an interface between user and drivers. 
//It keeps track of the drivers that are available and handles establishing a connection between a database and 
//the appropriate driver.

//Useful methods of DriverManager class
//Method	Description
//1) public static void registerDriver(Driver driver):	is used to register the given driver with DriverManager.
//2) public static void deregisterDriver(Driver driver):	is used to deregister the given driver (drop the driver from the list) with DriverManager.

//Connection interface
//A Connection is the session between java application and database. 
//The Connection interface is a factory of Statement, PreparedStatement i.e. object of 
//Connection can be used to get the object of Statement. 
//It's an interface that extends Wrapper interface.

//Statement interface
//The Statement interface provides methods to execute queries with the database. 
//The statement interface is a factory of ResultSet i.e. it provides factory method to get the object of ResultSet.

//PreparedStatement interface
//The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.
//
//Let's see the example of parameterized query:
//
//String sql="insert into emp values(?,?,?)";  
//As you can see, we are passing parameter (?) for the values. 
//Its value will be set by calling the setter methods of PreparedStatement.
//
//Why use PreparedStatement?
//Improves performance: The performance of the application will be faster 
//if you use PreparedStatement interface because query is compiled only once.

//ResultSet interface
//The object of ResultSet maintains a cursor pointing to a row of a table. 
//Initially, cursor points to before the first row.
//
//By default, ResultSet object can be moved forward only and it is not updatable.
//But we can make this object to move forward and backward direction by passing either TYPE_SCROLL_INSENSITIVE or 
//TYPE_SCROLL_SENSITIVE in createStatement(int,int) method as well as we can make this object as updatable by:
//
//Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
//                     ResultSet.CONCUR_UPDATABLE);  

//ResultSet interface is used to retrieve the data of a row in a table.
//Cursor in SQL Server
//A cursor in SQL Server is a database object that allows us to retrieve each row at a time and manipulate its data.

//JDBC RowSet It holds tabular data like ResultSet but it is easy and flexible to use.

//Java CallableStatement Interface
//CallableStatement interface is used to call the stored procedures and functions.
//
//We can have business logic on the database by the use of stored procedures and functions that will make the 
//performance better because these are precompiled.
//
//Suppose you need the get the age of the employee based on the date of birth, you may create a function that 
//receives date as the input and returns age of the employee as the output.
//
//What is the difference between stored procedures and functions.
//The differences between stored procedures and functions are given below:
//
//
//Stored Procedure	                              Function
//is used to perform business logic.	               is used to perform calculation.
//must not have the return type.	                   must have the return type.
//may return 0 or more values.	                   may return only one values.
//We can call functions from the procedure.	       Procedure cannot be called from function.
//Procedure supports input and output parameters.	   Function supports only input parameter.
//Exception handling using try/catch block can be used in stored procedures.	Exception handling using try/catch can't be used in user defined functions.
//
// 
//How to get the instance of CallableStatement?
//The prepareCall() method of Connection interface returns the instance of CallableStatement. Syntax is given below:
//
//public CallableStatement prepareCall("{ call procedurename(?,?...?)}");  



//A procedure always contains a name, parameter lists, and SQL statements.
//DELIMITER &&  
//CREATE PROCEDURE get_in_patient_info ()  
//BEGIN  
//    SELECT * FROM In-Patient_info ;  
//    SELECT COUNT(In-Patient id) AS Total_In-Patients FROM In-Patient_info;    
//END &&  
//DELIMITER ; 
//
//
//DELIMITER is defined to tell the mysql client to treat the statements, functions, stored procedures or triggers 
//as an entire statement.
//
//MySQL Count() Function
//MySQL count() function is used to returns the count of an expression.
//
//SELECT COUNT(In-Patient id) AS Total_In-Patients FROM In-Patient_info;  
//In the above example:
//Count() Function executes the following statement that returns all rows from the In-Patient_info table
//
//
//MySQL Functions
//Creating a function
//In MySQL, Function can also be created. A function always returns a value using the return statement.
//
//DELIMITER $$   
//CREATE FUNCTION get_in_patient_info (In-Patient__id INT) RETURNS VARCHAR( 20 )   
//BEGIN   
//DECLARE In-Patient_name VARCHAR( 20 ) DEFAULT "";  
//SELECT name INTO In-Patient_name FROM designation WHERE id = In-Patient__id;  
//RETURN In-Patient_name;  
//END $$  
//
