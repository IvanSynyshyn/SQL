import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Changes extends ReaderSQL {

	public void addLine() throws IOException {
		Scanner sc = new Scanner(System.in);
		try {
			PreparedStatement ps = con
					.prepareStatement("insert into Fired (name, position, salary, DoB) values (?, ?, ?, ?)");
			System.out.println("Print name of employee:");
			ps.setString(1, sc.nextLine());
			System.out.println("Print position of employee:");
			ps.setString(2, sc.nextLine());
			System.out.println("Print salary of employee:");
			ps.setInt(3, Integer.parseInt(sc.nextLine()));
			System.out.println("Print date of birdth of employee:");
			// how to set Date format?
			Date date = getDate(sc.nextLine());
			ps.setDate(4, date);
			
			int updated = ps.executeUpdate();

			System.out.println("Updated rows " + updated);

		} catch (SQLException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	private Date getDate(String dateString) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long timeMillis = df.parse(dateString).getTime();
			return new Date(timeMillis);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}