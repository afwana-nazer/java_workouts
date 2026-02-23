import java.sql.*;
class Mbatch1 {
	public static void main(String args[]) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/FREEPDB1","test","test");
	con.setAutoCommit(false);
	Statement stmt = con.createStatement();
	stmt.addBatch("insert into usertb1 values(1, 'afwana', 3000)");
	stmt.addBatch("insert into usertb1 values(2, 'Bhadra', 4000)");
	stmt.addBatch("insert into usertb1 values(3, 'joshu', 5000)");
	int[] i = stmt.executeBatch();
	System.out.println(i.length + "record inserted ");
	con.commit();

	ResultSet rs = stmt.executeQuery("select * from usertb1");
	while(rs.next()) {
	System.out.println(rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3));
	}
	
	con.close();
  }
}

	