package connection;
import java.sql.*;
import java.io.*;
public class UploadImageInDatabase {

	private Connection con;
	private PreparedStatement ps;
	public UploadImageInDatabase()
	{
		con=DataConnection.getConnection();
	}
	public void insertImage()throws SQLException,IOException
	{
		ps=con.prepareStatement("insert into employe values (?,?)");
		ps.setString(1, "firstimage");
		FileInputStream fin=new FileInputStream("/home/administrator/Pictures/image.jpeg");
		ps.setBinaryStream(2, fin, fin.available());
		int result=ps.executeUpdate();
		if(result>0)
		{
			System.out.println("Data inserted");
		}
	}
	public void readImage()throws SQLException,IOException
	{
		ps=con.prepareStatement("select emppic from employe where firstname=?");
		ps.setString(1, "firstimage");
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			Blob imagedata=rs.getBlob(1);
			byte arr[]=imagedata.getBytes(1, (int)imagedata.length());
			FileOutputStream fout=new FileOutputStream("/home/administrator/Pictures/result.jpeg");
			fout.write(arr);
			System.out.println("File Created");
		}
		else
		{
			System.out.println("not Inserted");
		}
	}
	public static void main(String[] args) {
		UploadImageInDatabase uimg=new UploadImageInDatabase();
		try {
			//uimg.insertImage();
			uimg.readImage();
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
