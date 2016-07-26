import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Changes extends ReaderSQL {
	// як створити метод з конструктором, щоб додавати нових людей в таблицю так,
	// щоб id не потрібно було вносити вручно, а воно автоматично додавало
	// 1 до попереднього значення?

	public void addLine() throws IOException {
		Scanner sc = new Scanner(System.in);
		try {
			PreparedStatement ps = con.prepareStatement("insert into public.\"TBF\" values (2, 3, 4, 5)");
			System.out.println("Print name of employee:");
			ps.setString(2, sc.nextLine());
			System.out.println("Print position of employee:");
			ps.setString(3, sc.nextLine());
			System.out.println("Print salary of employee:");
			ps.setInt(4, sc.nextInt());
			System.out.println("Print date of birdth of employee:");
			// how to set Date format?
			ps.setString(5, sc.nextLine());
			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}