package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			
			if(con!=null) {
				System.out.println("db ok");
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
	
	//매서드
	//에이콘학생목록 조회
	//ArrayList<Acorn> selectAll()
	
	public ArrayList<Acorn> selectAll(){
		
		Connection con = dbcon();
		ArrayList<Acorn> list = new ArrayList<>();
		//
		String sql="select * from acorntbl";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
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
	
	
	
	public static void main(String[] args) {
		
		AcornDAO dao = new AcornDAO();
		dao.dbcon();
		
			
		
		
	}
	
	
	
}
