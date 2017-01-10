<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<nav class="top-navigation">
			<ul>
				<li><a href="<c:url value="/"/>">Домашняя</a></li>
				<li><a href="<c:url value="/info/company"/>">Сведения о компании</a></li>
				<li><a href="<c:url value="/info/payment"/>">Оплата</a></li>
				<li><a href="<c:url value="/info/delivery"/>">Доставка</a></li>
				<li><a href="<c:url value="/info/contacts"/>">Контакты</a></li>
			</ul>
		</nav>