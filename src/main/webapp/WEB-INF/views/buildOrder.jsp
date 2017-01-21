<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<p>Проверьте правильность данных:</p>
<br />
<p>Получатель: ${customer.name} ${customer.surname}</p>
<p>Адрес доставки:</p>
<p>${address.street} ${address.houseNumber}/${address.flatNumber}</p>
<p>${address.city}</p>
<p>${address.state}, ${address.zip}</p>
<form:form action="${flowExecutionUrl}">
<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
	<input type="submit" name="_eventId_back" value="Назад" />
	<input type="submit" name="_eventId_submit" value="Перейти к оплате" />
	<input type="submit" name="_eventId_cancel" value="Отменить" />
</form:form>
</div>