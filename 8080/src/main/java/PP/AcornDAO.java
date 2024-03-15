package PP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {
	
	/* DB 불러오기 */
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	public Connection acorndb() {
	
		Connection con = null;
		
		try {
			/* 데이터베이스 객체 생성 */
			Class.forName(driver); 
			con = DriverManager.getConnection(url, user, password);
			/* 정상 접속 체크하기 */
			
			if ( con != null) {
				System.out.println("접속완료");
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
	public ArrayList<Acorn> selectAll(){
		
		ArrayList<Acorn> list = new ArrayList<> ();
		Connection con = acorndb();
		
		String sql ="select * from acorntbl";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.getResultSet();
			while(rs.next()) {
				String id =	rs.getString(1);
				String pw =	rs.getString(2);
				String name = rs.getString(3);
				
				Acorn acorn = new Acorn(id,pw,name);
				
				list.add(acorn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return list;
	}
	
}
