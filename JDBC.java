package Mars10.tests;
import java.sql.*;
public class JDBC {

	public static void main(String[] args) {
 try {
		//String url="jdbc:oracle:thin://192.168.169.138:1561//V10QA01";
	   String url= "jdbc:oracle:thin:@192.168.169.60:1761:DI403";
		String uname ="mars";
		String pass = "mars";
		
		String query = ("select * from ms_rep where Rep_id='110'");
		//String query = ("update ms_rep set FIRST_NM='George 123' where Rep_id='110'");
		String firstname;
		String lastname;
		String title;
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()){			
		firstname = rs.getString("FIRST_NM");
		System.out.println(firstname);
		lastname = rs.getString("LAST_NM");
		System.out.println(lastname);
		title=rs.getString("Title");
		System.out.println(title);			
		}
		//String name = rs.getString("FIRST_NM");
		System.out.println("Connection Executed");
		System.out.println("result is" + rs);
		
		con.close();
 }
 		catch(Exception exc) {
 			exc.printStackTrace();
	}
	}
}
