

public class DataBase {
	

	public static void main(String[] args) {
		Runnable job = new Runnable() {
			
			@Override
			public void run() {
				ReaderSQL rd = new ReaderSQL();
				rd.readSQL();
				System.out.println("Done by " + Thread.currentThread().getName());
			}
		};
		Thread thread1 = new Thread(job, "thread1");
		Thread thread2 = new Thread(job, "thread2");
		Thread thread3 = new Thread(job, "thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
//		ReaderSQL rd = new ReaderSQL();
//		rd.readSQL();
		
//		CreateTable ct = new CreateTable();
//		ct.createTable();
		
//		Changes ch = new Changes();
//		try {
//			ch.addLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
}
