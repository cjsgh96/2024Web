package day33;

import java.sql.*;
import java.util.ArrayList;

public class DBTEST5 {

	public static void main(String[] args) {		 
			
		//DB연결정보
		//driver 
		//url
		//사용자 , 비밀번호		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";	
		
		ArrayList<Acorn_> list = new ArrayList<>();
		
				
		try {
			//1. 드라이버 로드 (객체생성)
			Class.forName(driver);			
			//2. 데이터베이스 연결
			Connection  con = DriverManager.getConnection(url, user, password);
			
			//3. 문장얻어오기 
			 
			String sql  ="select * from  acorntbl";
			PreparedStatement  pst =con.prepareStatement(sql);
			 	 
			
			//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
			ResultSet  rs =pst.executeQuery();	
			
			//
			
			while( rs.next()) {
				
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				Acorn_ acorn = new Acorn_();
				list.add(new Acorn_(id,pw,name));
				
			} 			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(Acorn_ a : list) {
			System.out.println(a.getId());
		 	System.out.println(a.getPw()) ;
			System.out.println(a.getName()); 
		}
		
		

	}

}
