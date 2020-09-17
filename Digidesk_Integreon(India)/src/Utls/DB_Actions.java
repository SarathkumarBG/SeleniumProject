package Utls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.NotFoundException;

public class DB_Actions extends Actions
{

	static Connection con;
	static Statement stmt;
	
	//Register Deriver
	public static void forName(String element) throws NotFoundException
	{
		forName(element);
	}
	
	//Create connection
	public static Connection getConnection(String url,String name, String password) throws SQLException
	{
		Connection con = DriverManager.getConnection(url, name, password);
		
		 return con;
	}
	
	//Create Statement
	public static Statement createStatement() throws SQLException
	{
		Statement stmt = con.createStatement();
		return stmt;
	}
	
	//Execute Query
	public static ResultSet executeQuery(String Query_statement) throws SQLException
	{
		ResultSet rst = stmt.executeQuery(Query_statement);
		return rst;
	}
	
	//Close the connection object
	public static void Connection_close() throws SQLException
	{
		con.close();
	}
	
}
