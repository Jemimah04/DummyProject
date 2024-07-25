package Generic_Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {

	
	
	public void dataBaseConnection(WebDriver driver) throws Throwable
	{
		Driver driverRef=new Driver();
		 DriverManager.registerDriver(driverRef);
        }
	
	public void dataBaseClose() throws Throwable
	{
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders", "root", "jemi");
	     con.close();
	}
}
