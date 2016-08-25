import java.io.IOException;

public class DataBase {
	

	public static void main(String[] args) {
		
		ReaderSQL rd = new ReaderSQL();
		rd.readSQL();
		
		CreateTable ct = new CreateTable();
		ct.createTable();
		
		Changes ch = new Changes();
		try {
			ch.addLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
