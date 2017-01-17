<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="login-bar">
	<ul>
		<li><a href="<c:url value="/cart/overview"/>">Моя корзина 
		[<c:if test="${cart != null}"><c:out value="${cart.cartQuantity}" /></c:if><c:if test="${cart == null}"><c:out value="0" /></c:if>]</a></li>
		<c:if test="${login != 'true'}">
		<li><a href="<c:url value="/login"/>">Войти</a></li>
		</c:if>
		<li><a href="<c:url value="/books/add" />">Добавить книгу</a></li>
		<c:if test="${login == 'true'}">
		<li><a class="logout-button" href="<c:url value="/j_spring_security_logout" />">Выйти</a></li>
		</c:if>
		
		</ul>
</div>