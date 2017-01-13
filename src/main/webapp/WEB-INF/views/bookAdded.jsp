<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="main-content">
	<p>Книга добавлена успешно.</p>
	<br>
	<p><a href="<c:url value="/"/>">Вернуться на стартовую страницу</a></p>
	<br>
	<p><a href="<c:url value="/books/add"/>">Добавить еще одну книгу</a></p>
</div>