<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>	
	
<%

 String id  = request.getParameter("id");
 out.println( id);
 String driver = "oracle.jdbc.driver.OracleDriver";
 String url = "jdbc:oracle:thin:@localhost:1521:testdb";
 String user = "scott";
 String password = "tiger";	
 
 
 String ticket_type ="";
 String ticket_date ="";
 String ticket_time ="";
 String ticket_age ="";
 String ticket_cnt ="";
	
			
	try {
		//1. 드라이버 로드 (객체생성)
		Class.forName(driver);			
		//2. 데이터베이스 연결
		Connection  con = DriverManager.getConnection(url, user, password);
		
		//3. 문장얻어오기 
	 
		String sql  ="select * from buy_history where id =?";
		PreparedStatement  pst =con.prepareStatement(sql);
		pst.setString(1, id);
		
		//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
		ResultSet  rs =pst.executeQuery();	
		
		//
		if( rs.next()) {	
			 ticket_type = rs.getString(20);
			 ticket_date = rs.getString(20);
			 ticket_time = rs.getString(20);
			 ticket_age = rs.getString(20);
			 ticket_cnt = rs.getString(3);
			
		} 			
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	 out.print(ticket_type);
	 out.print(ticket_date);
	 out.print(ticket_time);
	 out.print(ticket_age);
	 out.print(ticket_cnt);


%>	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
 div{ 
  border:1px solid black;
 }
 
 .wrap{
 width:500px;
 margin:0  auto;
 }
 
 .line{
   display: flex;
 }
 
 .col1{
  width:30%;
 }
 
 .col2{
  width:70%;
 }
 
 
 .line1, .line5{
 text-align: center;
 }
 
 
 .col1, .col2{
 padding:5px;
 }
  
</style>
<script>
function check() {	/*유효성체크*/
    var date = document.getElementById('date').value;
    var cnt = document.getElementById('cnt').value;

    if (date == "") {	/*날짜체크*/
        alert("날짜를 입력해주세요.");
        return false;
    }
    if (cnt == "" || isNaN(cnt) || cnt <= 0) {/*개수체크*/
        alert("구매할 표 개수를 입력해주세요.");
        return false;
    }
    return true;
}
function cancel() {/*취소에도 유효성검사가 적용되서 따로만듬*/
	var confirmCancel = confirm("변경을 취소하시겠습니까?");
    if (confirmCancel) {       
    	window.history.go(-1);
    }
}
</script>
</head>
<body>

<form  name="tck" action="updateAction.jsp"  method="post" onsubmit="return check()">
	<div  class="wrap">
		 <div class="line1">
			   <h2> 티켓 변경 </h2>
			   </div>
		<div class="line">
			<div class="col1">아이디</div>
			<div class="col2">
				<input type="text" name="id" id="id" value="" readonly="readonly">
			</div>
		</div>
		
		<div class="line">
			<div class="col1">등급</div>
			<div class="col2">
				<select name="type" id="type" value="">
					<option value="이코노미">이코노미</option>
					<option value="비즈니스">비즈니스</option>
					<option value="퍼스트">퍼스트</option>
				</select>
			</div>
		</div>
		
		<div class="line">
			<div class="col1">날짜</div>
			<div class="col2">
				<input type="text" name="date" id="date" value="">
			</div>	
		</div>
	
		<div class="line">
			<div class="col1">출발시간</div>
			<div class="col2">
				<select name="time" id="time" value="">
					<option value="9">09:00</option>
					<option value="21">21:00</option>
				</select>
			</div>	
		</div>
		
	    <div class="line">
			<div class="col1">나이</div>
			<div class="col2">
				<select name="age" id="age" value="">
					<option value="성인">성인</option>
					<option value="청소년">청소년</option>
					<option value="어린이">어린이</option>
					<option value="소아">소아</option>
				</select>
			</div>	
		</div>	
		
		<div class="line">
			<div class="col1">개수</div>
			<div class="col2">
				<input type="number" name="cnt" id="cnt" value="">
			</div>	
		</div>	
		
		<div class="line5">
		<!--  form 안에 있는 버튼은 submit 지정,(action에 지정된 페이지로 이동함) -->	
		 <button>변경</button>
		 <button type="button" onclick="cancel()">취소</button>	 
		</div>
	</div>
</form>

</body>
</html>




<script>

	 let tck = document.tck;
	 alert( tck);	 
	 
	 tck.id.value="<%=id%>";
	 tck.type.value="<%=ticket_type%>";
	 tck.date.value="<%=ticket_date%>";
	 tck.time.value="<%=ticket_time%>";
	 tck.age.value="<%=ticket_age%>";
	 tck.cnt.value="<%=ticket_cnt%>";
	 
</script>