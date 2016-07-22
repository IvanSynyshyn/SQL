import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReaderSQL {
	private static final String url = "jdbc:postgresql://localhost:5432/Ivan";
	private static final String user = "postgres";
	private static final String password = "livfan";
	private static Connection con;
	private static Statement st;
	private static ResultSet rs;

	public void readSQL() {
		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("select * from public.\"TBF\" order by salary desc");
			while (rs.next()) {
				System.out.println(rs.getString(2) + " " + rs.getInt(4));
			}
		} catch (SQLException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
		} finally {

			try {
				con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

}
