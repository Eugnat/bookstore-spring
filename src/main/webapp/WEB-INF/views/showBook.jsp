<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="main-content">
		<table class="bookshow">
			<tr><td>Название: <td>${book.title}</td><td rowspan="9" class="imagecolumn">
			<a href="<c:url value="/books/book?id=${book.id}"/>"><img src="<c:url value="/resources/images/${book.isbn}.jpg"/>" width="270" height="425"></a></td></tr>
			<tr><td>Автор: </td><td>${book.author}</td></tr>
			<tr><td>ISBN: </td><td>${book.isbn}</td></tr>
			<tr><td>Количество страниц: </td><td>${book.pageNumber}</td></tr>
			<tr><td>Издательство: </td><td>${book.publishingHouse}</td></tr>
			<tr><td>Язык: </td><td>${book.language}</td></tr>
			<tr><td>Год издания: </td><td>${book.issueYear}</td></tr>
			<tr><td>Тираж: </td><td>${book.copyNumber}</td></tr>
			<tr><td>Цена: </td><td>${book.price} грн.</td></tr>
		</table>
</div>