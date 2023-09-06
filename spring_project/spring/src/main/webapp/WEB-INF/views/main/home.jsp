<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language = "java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
</head>
<body>
	<h1>메인</h1>
	
	<script type="text/javascript">
	let data = {
		me_id : 'abc',
		me_pw : 'test'
	};
	//ajax는 암기로 외우는 것이 좋다. HomeController에 Map<String, Object> ajaxTest(@RequestBody MemberVO member)과 함께
	$.ajax({ /*{} - 자바스크립트에서는 중괄호가 객체*/
		async : false, /*비동기 : false=> 동기화(다음 작업이전에 ajax가 끝날 때까지 기다려줌)*/
		type : 'post', /*전송 방식 : get/post*/
		url : '<c:url value = "/ajax/test/"/>', /*데이터를 보낼 url*/
		data : JSON.stringify(data), /*보낼 데이터, 보통 객체가 json으로 보냄*/
		contentType : "application/json; charset=UTF-8", /*서버로 보낼 데이터의 타입*/
		dataType : "json", /* 서버에서 화면으로 보낸 데이터의 타입 */
		success : function(data){ /* ajax가 성공하면 실행될 메서드로 서버에서 보낸 데이터를 매개변수에 저장 */
			console.log(data);
		}
	});
	</script>
</body>
</html>
