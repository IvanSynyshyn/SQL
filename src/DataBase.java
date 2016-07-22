import java.sql.*;

public class DataBase {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Ivan", "paisley", "livfan");
conn.
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}
	}

}
