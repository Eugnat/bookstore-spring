<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="main-content">
		<table class="bookshow">
			<tr><td><spring:message code="book.title" />: <td>${book.title}</td>
			<td rowspan="9" class="imagecolumn">
				<a href="<c:url value="/books/book/${book.id}"/>"><img src="<c:url value="/resources/images/${book.isbn}.jpg"/>" width="270" height="425"></a>
				<form action="<c:url value="/books/addToCart"/>" method="post">
						<input type="hidden" name="itemId" value="${book.id}" />
						<input type="submit" value="<spring:message code="button.addToCart"/>" />
				</form>
			</td></tr>
			<tr><td><spring:message code="book.author" />: </td><td>${book.author}</td></tr>
			<tr><td><spring:message code="book.isbn" />: </td><td>${book.isbn}</td></tr>
			<tr><td><spring:message code="book.pageNumber" />: </td><td>${book.pageNumber}</td></tr>
			<tr><td><spring:message code="book.publishingHouse" />: </td><td>${book.publishingHouse}</td></tr>
			<tr><td><spring:message code="book.language" />: </td><td>${book.language}</td></tr>
			<tr><td><spring:message code="book.issueYear" />: </td><td>${book.issueYear}</td></tr>
			<tr><td><spring:message code="book.copyNumber" />: </td><td>${book.copyNumber}</td></tr>
			<tr><td><spring:message code="book.price" />: </td><td>${book.price} <spring:message code="book.currency" /></td></tr>
		</table>
</div>