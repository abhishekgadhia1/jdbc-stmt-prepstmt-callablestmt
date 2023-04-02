import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice1","root","root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into booklist1(title, author) values ('Range','David')");
		ResultSet rs = stmt.executeQuery("select * from booklist1");
		System.out.println(i);
		
		while(rs.next())
		{
			String title = rs.getString("title");
			String author = rs.getString("author");
			System.out.println(title+" "+author);
		}
	}
	
	
}
