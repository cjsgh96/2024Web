package day33;

import java.sql.*;

public class DBTEST2 {

	public static void main(String[] args) {
		
		//DB연결정보
		//driver
		//url
		//사용자 , 비밀번호
		
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		
		try {
			//1. 드라이버 로드 (객체생성) 
			Class.forName(driver);
			
			//2. 데이터베이스 연결
			Connection con = DriverManager.getConnection(url, user, password);
			
			//3. 문장 얻어오기
			Statement st = con.createStatement();
			
			//4. 쿼리작성 ( developer에서 )
			String searchName="정기원"; //응용  특정 이름을 불러오고 싶을때
			String sql="select * from acorntbl where name = '"+searchName+"' ";
			
			//5. 실행 (executeQuery()-조회, executeUpdate()-나머지 [등록,변경,삭제])
			
			ResultSet rs = st.executeQuery(sql);
			
			// rs.next() 값이 있으면 true를 없으면 false 를 반환한다. 
			while(rs.next()) {
				System.out.println(rs.getString(1)); //rs.getString() 컬럼을 구분해서 꺼내오기 위해 사용 1,2,3
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}