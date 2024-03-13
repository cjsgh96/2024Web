<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
document.getElementById('myForm').onsubmit = function(e) {
  e.preventDefault(); // 기본 폼 제출 방지

  // 첫 번째 액션 URL로 폼 데이터 보내기
  fetch('action1.php', {
    method: 'POST',
    body: new FormData(document.getElementById('myForm'))
  });

  // 두 번째 액션 URL로 동일한 폼 데이터 보내기
  fetch('action2.php', {
    method: 'POST',
    body: new FormData(document.getElementById('myForm'))
  });
};
</script>
</head>
<body>

<form id="myForm">
  <!-- 폼 필드들 -->
  <input type="submit" value="Submit">
</form>

</body>
</html>