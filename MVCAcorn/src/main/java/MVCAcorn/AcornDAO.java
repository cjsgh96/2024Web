package MVCAcorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AcornDAO {
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	public Connection dbcon() {
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.println("DB OK");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	public static void main(String[] args) {
		
		AcornDAO dao = new AcornDAO();
		dao.dbcon();		
	}
	
	
}