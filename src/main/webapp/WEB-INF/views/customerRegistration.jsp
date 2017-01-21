<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<form:form modelAttribute="customer" action="${flowExecutionUrl}">
	<legend>Введите сведения о покупателе</legend>
	<p><label for="name">Имя: </label><form:input id="name" path="name" type="text"/> <form:errors path="name" /></p>
	<p><label for="surname">Фамилия: </label><form:input id="surname" path="surname" type="text"/> <form:errors path="surname" /></p>
	<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
	<input type="submit" name="_eventId_submit" value="Дальше" />
	<input type="submit" name="_eventId_cancel" value="Отменить" />
</form:form>

</div>