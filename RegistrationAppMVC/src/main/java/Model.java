import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model 
{
	private String uname;
	private String upassword;
	private String email;
	private String ucity;
	private Connection connect;
	private PreparedStatement pstm;
	private int row;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	
	public int register()
	{
		try 
		{
			connect=JdbcUtil.getDBConnection();
			String sql = "INSERT INTO register (uname, email, upassword, ucity) VALUES (?,?,?,?)";
			pstm = connect.prepareStatement(sql);
			pstm.setString(1, uname);
			pstm.setString(2, email);
			pstm.setString(3, upassword);
			pstm.setString(4, ucity);
			row = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			JdbcUtil.closeConnection(connect, pstm);
		}
		return row;
	}
}
