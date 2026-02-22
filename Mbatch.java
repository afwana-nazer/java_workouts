import java.sql.*;
class Mbatch{
public static void main (String args[])  throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/FREEPDB1","test","test");
	con.setAutoCommit(false);
	Statement stmt=con.createStatement();
	stmt.addBatch("insert into usertb values(11,'vimal',4000)");
	stmt.addBatch("insert into usertb values(12,'afwana',6000)");
	int[] i = stmt.executeBatch();
	System.out.println(i.length+ "data inserted");
	con.commit();
	con.close();
}
}