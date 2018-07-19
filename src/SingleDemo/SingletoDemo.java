package SingleDemo;

import java.sql.Connection;

public class SingletoDemo extends Thread{
	
	public void run()
	{
		System.out.println("run method of thread");
		long tb4=System.currentTimeMillis();
        Connection conn= Dbsingleton.getConnection();
		
		System.out.println(conn);
		long aft=System.currentTimeMillis();

		System.out.println("time taken = "+(aft-tb4));
	}
	
	public static void main(String[] args) {
		
		SingletoDemo d=new SingletoDemo();
		d.start();
		SingletoDemo d1=new SingletoDemo();
		d1.start();
		
		
		
		
		
	}

}
