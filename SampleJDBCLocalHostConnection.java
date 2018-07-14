import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SampleJDBC 
{
    //There exists a database named 'qadbt' in Mysql Server containing a table named EmployeeInfo.
    //Prerequisite add external jar file 'mysql-connector-java.jar'.
    
    public static void main( String[] args ) throws SQLException
    {
    	String host = "localhost";
    	String port = "3306";
    	String databaseName= "qadbt";
    	Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + databaseName, "root", "Acer987*#");
    	Statement s = con.createStatement();
    	
    	ResultSet rs = s.executeQuery("select * from EmployeeInfo where id = 1001");
    	while(rs.next()){
    		System.out.println(rs.getString("name"));
        	System.out.println(rs.getString("location"));
    	}
    	
    }
}
