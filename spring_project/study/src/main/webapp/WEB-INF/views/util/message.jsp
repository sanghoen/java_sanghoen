<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language = "java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<title>메세지</title>
</head>
<body>
	<script type="text/javascript">
		alert('${msg}');
		location.href= '<c:url value="${url}"/>';
	</script>
</body>
</html>
