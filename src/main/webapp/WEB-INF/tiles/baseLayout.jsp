<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 	<link rel="stylesheet" href="<c:url value="/resources/css/styles.css" />">
		<title><spring:message code="baseLayout.pageTitle" /></title>
	</head>
	
	<body>
		<tiles:insertAttribute name="header"/>
		<tiles:insertAttribute name="loginBar" />
		<tiles:insertAttribute name="topNavigation" />
		<tiles:insertAttribute name="sideNavigation" />
		<tiles:insertAttribute name="mainContent" />
		<tiles:insertAttribute name="footer" />
	</body>
</html>