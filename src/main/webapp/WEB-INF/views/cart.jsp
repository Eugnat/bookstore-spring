<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="main-content">
	<table class="cart">
		<c:forEach items="${cart.itemList}" var="item">
			<c:if test="${item.itemQuantity != 0}">
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
				<td>
					<form action="<c:url value="/cart/update"/>" method="post">
						<p><input type="text" name = "itemQuantity" value="${item.itemQuantity}" size="2" /></p>
						<p><input type="hidden" name = "itemId" value = "${item.itemId}" /></p>
						<p><input type="submit" value="Пересчитать" />
					</form>
				</td>
			</tr>
			</c:if>
		</c:forEach>
		<tr>
			<c:if test="${cart.total != 0}">
				<td>Итого:</td>
				<td>${cart.total} грн.</td>
				<td>
					<form class="checkout" action="<c:url value="/cart/checkout" />" method="post">
						<input type="submit" value="Оформить заказ" />
					</form>
				</td>
			</c:if>
		</tr>
	</table>
	<c:if test="${cart.total == 0}">
				<p>В корзине нет товаров</p>
			</c:if>
</div>