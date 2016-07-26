
public class CreateTable extends ReaderSQL{
	st.executeUpdate("create table Fired (id serial, name String, position String, "
			+ "salary int, DoB Date)");
	

}
