<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language = "java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
</head>
<body>
	<h1>게시판</h1>
	<div class="container">
	  <h2>테이블</h2>
	  <br></br>            
	  <table class="table">
	    <thead>
	      <tr>
	        <th>Firstname</th>
	        <th>Lastname</th>
	        <th>Email</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>John</td>
	        <td>Doe</td>
	        <td>john@example.com</td>
	      </tr>
	      <tr>
	        <td>Mary</td>
	        <td>Moe</td>
	        <td>mary@example.com</td>
	      </tr>
	      <tr>
	        <td>July</td>
	        <td>Dooley</td>
	        <td>july@example.com</td>
	      </tr>
    </tbody>
  </table>
  </div>
    <ul class="pagination justify-content-center">
	  <li class="page-item"><a class="page-link" href="javascript:void(0);">이전</a></li>
	  <li class="page-item"><a class="page-link" href="javascript:void(0);">1</a></li>
	  <li class="page-item"><a class="page-link" href="javascript:void(0);">2</a></li>
	  <li class="page-item"><a class="page-link" href="javascript:void(0);">3</a></li>
	  <li class="page-item"><a class="page-link" href="javascript:void(0);">다음</a></li>
	</ul>
  <a class="btn btn-outline-dark" href="<c:url value='/board/insert'/>">글쓰기</a>
</body>
</html>
