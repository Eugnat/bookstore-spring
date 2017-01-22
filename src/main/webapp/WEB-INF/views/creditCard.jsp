<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<form:form modelAttribute="card" action="${flowExecutionUrl}">
	<legend><spring:message code="creditCard.intro" /></legend>
	<p><label for="cardNumber"><spring:message code="creditCard.cardNumber" />: </label><form:input id="cardNumber" path="cardNumber" type="text"/> <form:errors path="cardNumber" /></p>
	<p><label for="ccvNumber"><spring:message code="creditCard.ccvNumber" />: </label><form:input id="ccvNumber" path="ccvNumber" type="text"/> <form:errors path="ccvNumber" /></p>
	<p><label for="name"><spring:message code="creditCard.name" />: </label><form:input id="name" path="name" type="text"/> <form:errors path="name" /></p>
	<p><label for="validity"><spring:message code="creditCard.validity" />: </label><form:input id="validity" path="validity" type="text"/> <form:errors path="validity" /></p>
	<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
	<input type="submit" name="_eventId_back" value="<spring:message code="button.Back" />" />
	<input type="submit" name="_eventId_submit" value="<spring:message code="button.Next" />" />
	<input type="submit" name="_eventId_cancel" value="<spring:message code="button.Cancel" />" />
</form:form>
</div>