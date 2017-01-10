<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="<c:url value="resources/css/styles.css" />">
</head>
<body>
<h2>Hello World!</h2>
<p>${tagline}</p>
<p><c:out value="Just a test line" /></p>
</body>
</html>
