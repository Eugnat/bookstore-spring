<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<form:form modelAttribute="card" action="${flowExecutionUrl}">
	<legend>Введите данные карты для оплаты</legend>
	<p><label for="cardNumber">Номер карты: </label><form:input id="cardNumber" path="cardNumber" type="text"/> <form:errors path="cardNumber" /></p>
	<p><label for="ccvNumber">Номер CCV: </label><form:input id="ccvNumber" path="ccvNumber" type="text"/> <form:errors path="ccvNumber" /></p>
	<p><label for="name">Имя и фамилия владельца: </label><form:input id="name" path="name" type="text"/> <form:errors path="name" /></p>
	<p><label for="validity">Срок действия (мм/гг): </label><form:input id="validity" path="validity" type="text"/> <form:errors path="validity" /></p>
	<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
	<input type="submit" name="_eventId_back" value="Назад" />
	<input type="submit" name="_eventId_submit" value="Дальше" />
	<input type="submit" name="_eventId_cancel" value="Отменить" />
</form:form>
</div>