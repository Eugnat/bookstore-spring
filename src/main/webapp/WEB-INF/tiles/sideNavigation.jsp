<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<nav class="side-navigation">
			<ul>
				<li><a href="<c:url value="/books/bestsellers"/>">Бестселлеры</a></li>
				<li><a href="<c:url value="/books/category?cat=fiction"/>">Художественная</a></li>
				<li><a href="<c:url value="/books/category?cat=essays"/>">Публицистика</a></li>
				<li><a href="<c:url value="/books/category?cat=children"/>">Детская книга</a></li>
				<li><a href="<c:url value="/books/category?cat=history"/>">История</a></li>
				<li><a href="<c:url value="/books/category?cat=poetry"/>">Поэзия</a></li>
			</ul>
		</nav>	