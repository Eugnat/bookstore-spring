<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="main-content">
	<table>
		<c:forEach items="${booklist}" var="book">
			<tr>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td>${book.pageNumber}</td>
				<td>${book.isbn}</td>
				<td>${book.category}</td>
				<td>${book.publishingHouse}</td>
				<td>${book.issueYear}</td>
				<td>${book.price}</td>
				<td>${book.language}</td>
				<td>${book.copyNumber}</td>
			</tr>
		</c:forEach>
	</table>
</div>