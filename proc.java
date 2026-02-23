import java.sql.*;
public class proc {
public static void main (String args[]) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/FREEPDB1","test","test");
	CallableStatement stmt = con.prepareCall("{call usrinsert(?,?) }");
	stmt.setInt(1,101);
	stmt.setString(2,"miya");
	stmt.execute();
	System.out.println("success");
 }
}
