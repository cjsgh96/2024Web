<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
    var id = document.getElementById('id').value;
    var date = document.getElementById('date').value;
    var cnt = document.getElementById('cnt').value;

    if (id == "") {	/*id체크*/
        alert("아이디를 입력해주세요.");
        return false;
    }
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
	var confirmCancel = confirm("구매를 취소하시겠습니까?");
    if (confirmCancel) {       
    	window.history.go(-1);
    }
}
</script>
</head>
<body>

<form name="tck" action="buyAction.jsp"  method="post" onsubmit="return check()">
	<div  class="wrap">
		 <div class="line1">
			   <h2> 티켓구매 </h2>
		</div>
	
		<div class="line">
			<div class="col1">아이디</div>
			<div class="col2">
				<input type="text" name="id" id="id">
			</div>
		</div>
			
		<div class="line">
			<div class="col1">등급</div>
			<div class="col2">
				<select name="type" id="type">
					<option value="이코노미">이코노미</option>
					<option value="비즈니스">비즈니스</option>
					<option value="퍼스트">퍼스트</option>
				</select>
			</div>
		</div>
		
		<div class="line">
			<div class="col1">날짜</div>
			<div class="col2">
				<input type="text" name="date" id="date">
			</div>	
		</div>
	
		<div class="line">
			<div class="col1">출발시간</div>
			<div class="col2">
				<select name="time" id="time">
					<option value="9">09:00</option>
					<option value="21">21:00</option>
				</select>
			</div>	
		</div>
		
	    <div class="line">
			<div class="col1">나이</div>
			<div class="col2">
				<select name="age" id="age">
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
				<input type="number" name="cnt" id="cnt">
			</div>	
		</div>
		
		<div class="line5">
		<!--  form 안에 있는 버튼은 submit 지정,(action에 지정된 페이지로 이동함) -->	
		 <button>구매</button>
		 <button type="button" onclick="cancel()">취소</button>
		</div>
	</div>
</form>

</body>
</html>