<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="main-content">
	<table class="cart">
		<c:forEach items="${cart.itemList}" var="item">
			<tr>
				<td>
					<p>Название:</p>
					<p>Автор:</p>
					<p>Стоимость:</p>
					<p>Количество:</p>
				</td>
				<td>
					<p>${item.itemName}</p>
					<p>${item.authorName}</p>
					<p>${item.itemPrice} грн.</p>
					<p>${item.itemQuantity}</p>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<c:if test="${cart.total != 0}">
				<td>Итого:</td>
				<td>${cart.total} грн.</td>
			</c:if>
			<c:if test="${cart.total == 0}">
				<td>В корзине нет товаров</td>
				<td></td>
			</c:if>
		</tr>
	</table>
</div>