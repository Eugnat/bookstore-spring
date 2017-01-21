<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="main-content">
	<table class="cart">
		<c:forEach items="${cart.itemList}" var="item">
			<c:if test="${item.itemQuantity != 0}">
			<tr>
				<td>
					<p><spring:message code="book.title" />:</p>
					<p><spring:message code="book.author" />:</p>
					<p><spring:message code="book.value" />:</p>
					<p><spring:message code="book.quantity" />:</p>
				</td>
				<td>
					<p>${item.itemName}</p>
					<p>${item.authorName}</p>
					<p>${item.itemPrice} грн.</p>
					<p>${item.itemQuantity}</p>
				</td>
				<td>
					<form action="<c:url value="/cart/update"/>" method="post">
						<p><input type="text" name = "itemQuantity" value="${item.itemQuantity}" size="2" /></p>
						<p><input type="hidden" name = "itemId" value = "${item.itemId}" /></p>
						<p><input type="submit" value="<spring:message code="cart.update" />" />
					</form>
					<form action="<c:url value="/cart/delete"/>" method="post">
						<p><input type="hidden" name = "itemId" value = "${item.itemId}" /></p>
						<p><input type="submit" value="<spring:message code="button.Delete" />" />
					</form>
				</td>
			</tr>
			</c:if>
		</c:forEach>
		<tr>
			<c:if test="${cart.total != 0}">
				<td><spring:message code="cart.total" />:</td>
				<td>${cart.total} <spring:message code="book.currency" /></td>
				<td>
<%-- 					<form class="checkout" action="<c:url value="/cart/checkout" />" method="post"> --%>
						<form class="checkout" action="<c:url value="/order" />" method="post">
						<input type="submit" value="<spring:message code="cart.orderNow" />" />
					</form>
				</td>
			</c:if>
		</tr>
	</table>
	<c:if test="${cart.total == 0}">
				<p><spring:message code="cart.noItems" /></p>
			</c:if>
</div>