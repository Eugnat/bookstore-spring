<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<nav class="top-navigation">
			<ul>
				<li><a href="<c:url value="/"/>"><spring:message code="navigation.home" /></a></li>
				<li><a href="<c:url value="/info/company"/>"><spring:message code="navigation.companyInfo" /></a></li>
				<li><a href="<c:url value="/info/payment"/>"><spring:message code="navigation.payment" /></a></li>
				<li><a href="<c:url value="/info/delivery"/>"><spring:message code="navigation.delivery" /></a></li>
				<li><a href="<c:url value="/info/contacts"/>"><spring:message code="navigation.contacts" /></a></li>
				<li><a href="<c:url value="/info/search"/>"><spring:message code="navigation.search" /></a></li>
			</ul>
		</nav>