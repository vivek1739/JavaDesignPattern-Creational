package SingleDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbsingleton {

	private static Connection con = null;

	private Dbsingleton() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		synchronized (Dbsingleton.class) {
			if (con == null) {
				new Dbsingleton();
			}
			return con;
		}
	}

}
