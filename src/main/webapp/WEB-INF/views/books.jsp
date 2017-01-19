<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="main-content">
		<c:if test="${empty booklist}">
			<c:out value="По данным критериям ничего не найдено. Уточните поиск." />
		</c:if>
		<c:forEach items="${booklist}" var="book">
		<table class="bookshow">
			<tr><td>Название: <td>${book.title}</td>
				<td rowspan="6" class="imagecolumn">
					<a href="<c:url value="/books/book/${book.id}"/>"><img src="<c:url value="/resources/images/${book.isbn}.jpg"/>" width="270" height="425"></a>
					<form action="<c:url value="/books/addToCart"/>" method="post">
						<input type="hidden" name="itemId" value="${book.id}" />
						<input type="submit" value="<spring:message code="button.addToCart"/>" />
					</form>
				</td>
			</tr>
			<tr><td>Автор: </td><td>${book.author}</td></tr>
			<tr><td>ISBN: </td><td>${book.isbn}</td></tr>
			<tr><td>Издательство: </td><td>${book.publishingHouse}</td></tr>
			<tr><td>Год издания: </td><td>${book.issueYear}</td></tr>
			<tr><td>Цена: </td><td>${book.price} грн.</td></tr>
		</table>
		<br />
		</c:forEach>
		<br />
		<p><a href="<c:url value="/info/search" />">Вернуться на страницу поиска</a></p>
		</div>