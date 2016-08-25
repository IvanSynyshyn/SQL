import java.sql.SQLException;

public class CreateTable extends ReaderSQL {
	
	public void createTable() {
		try {
			int updateCount = st.executeUpdate("create table Fired (id serial, name text, position text, salary integer, DoB Date)");
			System.out.println("Created table update count = " + updateCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void readSQL() {
		super.readSQL();
		System.out.println("prochytav");
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
