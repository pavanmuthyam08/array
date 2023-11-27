package connection;
import java.sql.*;


public class DataConnection 
{
 private static Connection con;
  private DataConnection() throws SQLException
  {
	  
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Image?","root","tiger");
	
	 
  }
  public static Connection getConnection()
  {
	  try {
		DataConnection c2=new DataConnection();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return con;
  }
 
	
}
