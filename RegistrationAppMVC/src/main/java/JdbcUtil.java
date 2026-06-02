import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil 
{
	static 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Driver is registered");
	}
	
	public static Connection getDBConnection()
	{
		String url = "jdbc:mysql://localhost:3306/tron_db";
		String userName="root";
		String userPwd="root123";
		Connection connect = null;
		try {
			connect = DriverManager.getConnection(url,userName,userPwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connect;
	}
	
	public static void closeConnection(Connection connect, PreparedStatement pstm)
	{
		try {
			connect.close();
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
