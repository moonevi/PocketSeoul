<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginMain</title>
  <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
<h3>
로그인시, 북마크 기능을 이용하실 수 있습니다.
</h3>

<a href="https://kauth.kakao.com/oauth/authorize?client_id=6b5cee6e3a93d0c1da8733dc02316363&redirect_uri=http://localhost:8060/seoul/login/kakao-redirect&response_type=code"><img src="${path}/resources/img/kakao.png"></a>

</body>
</html>