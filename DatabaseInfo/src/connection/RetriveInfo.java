package connection;
import java.sql.*;
public class RetriveInfo
{
   private Connection con;
   private PreparedStatement ps;
   public RetriveInfo()
   {
	   con=DataConnection.getConnection();
   }
   public void retriveInfo()throws SQLException
   {
	   ps=con.prepareStatement("select * from Movie");
	   ResultSet rs=ps.executeQuery();
	   while(rs.next())
	   {
		   System.out.println("The Movie id is "+rs.getInt(1));
		   System.out.println("The moviename is "+rs.getString(2));
		   
	   }
	   ResultSetMetaData rmeta=rs.getMetaData();
	   System.out.println("The Column name of first is "+rmeta.getColumnName(1));
	   System.out.println("the total columns are "+rmeta.getColumnCount());
	   System.out.println("The Data type of second cloumn is "+rmeta.getColumnTypeName(2));
	   DatabaseMetaData bmeta=con.getMetaData();
	   System.out.println(bmeta.getDriverName());
   }
   public static void main(String[] args) {
	RetriveInfo ri=new RetriveInfo();
	try {
		ri.retriveInfo();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
   
}
