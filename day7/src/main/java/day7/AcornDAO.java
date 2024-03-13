package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//테이블(acorntbl) 하나당 DAO 한 개 만든다
public class AcornDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	public Connection dbcon() {
		Connection con=null;
		try {
			Class.forName(driver);
			 con = DriverManager.getConnection(url,user,password);
			if(con != null) {
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
	
	public ArrayList<Acorn> selectAll(){
		
		ArrayList<Acorn> list = null;
		list = new ArrayList<>();
		
		//DB연결
		Connection con = dbcon();
		//sql작성
		String sql="select * from acorntbl"; 
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
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
		//실행된 결과
		
		return list;
	}
	
	//등록
	public void insertMember(Acorn newAcorn) {
		//연결
		dbcon();
		Connection con =dbcon();
		
		//sql
		String sql="insert into acorntbl(id,pw,name) values(?,?,?)";
		
		 try {
			 PreparedStatement pst	= con.prepareStatement(sql);
			 pst.setString(1, newAcorn.getId());
			 pst.setString(2, newAcorn.getPw());
			 pst.setString(3, newAcorn.getName());
			 
			 pst.executeUpdate();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		
	}
	
	public Acorn selectOne(String id) {
		
		//연결
		dbcon();
		Connection con = dbcon();
		
		//sql
		String sql="select * from acorntbl where id =?";
		
		Acorn acorn = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				String id_tmp = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				acorn = new Acorn(id_tmp,pw,name);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return acorn;
		
	}
	
	public void update(String id, String newpw) {
		dbcon();
		Connection con = dbcon();
		String sql ="update acorntbl set pw =? where id =?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, newpw);
			pst.setString(2, id);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		/* 
			ArrayList<Acorn> list = dao.selectAll();
			for(Acorn acorn : list ) {
				System.out.println(acorn);
			} 
		*/
		Acorn a = new Acorn();
		dao.update("haha", "4545");
		
	}
}