<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<td>Итого:</td>
				<td>
					<p>${cart.total} грн.</p>
				</td>
			</tr>
	</table>
	<form action="<c:url value="/cart/payment" />" method="post">
		<input type="submit" value="Оплатить" />
	</form>
	<form action="<c:url value="/cart/overview" />" method="get">
		<input type="submit" value="Вернуться" />
	</form>
</div>