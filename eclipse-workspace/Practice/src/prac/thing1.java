import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class thing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=null;
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "Ironmaiden99!");
		
		//Object of stmt class to execute queries
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from CustomerInfo where location = 'Asia' and purchasedDate = curdate();");
		while(rs.next())
		{
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		System.out.println(rs.getString(4));
		}
		conn.close();

	
		
	}

}

