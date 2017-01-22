<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<div class="login-bar">
	<ul>
		<li><a href="?language=ru">Ru</a></li>
		<li><a href="?language=uk">Uk</a></li>
		<li><a href="<c:url value="/cart/overview"/>"><spring:message code="loginBar.myCart" /> 
		[<c:if test="${cart != null}"><c:out value="${cart.cartQuantity}" /></c:if><c:if test="${cart == null}"><c:out value="0" /></c:if>]</a></li>
		<c:if test="${login != 'true'}">
		<li><a href="<c:url value="/login"/>"><spring:message code="loginBar.login" /></a></li>
		</c:if>
		<security:authorize access="hasRole('ROLE_ADMIN')" >
		<li><a href="<c:url value="/books/add" />"><spring:message code="loginBar.addBook" /></a></li>
		</security:authorize>
		<c:if test="${login == 'true'}">
		<li><a class="logout-button" href="<c:url value="/j_spring_security_logout" />"><spring:message code="loginBar.logout" /></a></li>
		</c:if>
		
		</ul>
</div>