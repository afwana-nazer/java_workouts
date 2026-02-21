import java.sql.*;
class DBP {
	public static void main (String args[]) {
	try 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
		PreparedStatement stmt = con.prepareStatement("insert into emp2 values(?,?)");
		stmt.setInt(1,1);
		stmt.setString(2, "afwana");
		int i=stmt.executeUpdate();
		System.out.println(i+" record inserted");

	 	Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from emp2");

                while(rs.next()) {
                System.out.println(rs.getInt(1) + " , " + rs.getString(2));
                }
 
		con.close();
        }
	catch(Exception e) {
        System.out.println(e);
	}
    }
}

