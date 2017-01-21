<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<form:form modelAttribute="address" action="${flowExecutionUrl}">
	<legend>Введите адрес для доставки</legend>
	<p><label for="houseNumber">Номер дома: </label><form:input id="houseNumber" path="houseNumber" type="text"/> <form:errors path="houseNumber" /></p>
	<p><label for="flatNumber">Номер квартиры: </label><form:input id="flatNumber" path="flatNumber" type="text"/> <form:errors path="flatNumber" /></p>
	<p><label for="street">Улица: </label><form:input id="street" path="street" type="text"/> <form:errors path="street" /></p>
	<p><label for="city">Город: </label><form:input id="city" path="city" type="text"/> <form:errors path="city" /></p>
	<p><label for="state">Область: </label><form:input id="state" path="state" type="text"/> <form:errors path="state" /></p>
	<p><label for="zip">Индекс: </label><form:input id="zip" path="zip" type="text"/> <form:errors path="zip" /></p>
	<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
	<input type="submit" name="_eventId_back" value="Назад" />
	<input type="submit" name="_eventId_submit" value="Дальше" />
	<input type="submit" name="_eventId_cancel" value="Отменить" />
</form:form>
</div>