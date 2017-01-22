<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<form:form modelAttribute="address" action="${flowExecutionUrl}">
	<legend><spring:message code="shippingAddress.intro" /></legend>
	<p><label for="houseNumber"><spring:message code="shippingAddress.houseNumber" />: </label><form:input id="houseNumber" path="houseNumber" type="text"/> <form:errors path="houseNumber" /></p>
	<p><label for="flatNumber"><spring:message code="shippingAddress.flatNumber" />: </label><form:input id="flatNumber" path="flatNumber" type="text"/> <form:errors path="flatNumber" /></p>
	<p><label for="street"><spring:message code="shippingAddress.street" />: </label><form:input id="street" path="street" type="text"/> <form:errors path="street" /></p>
	<p><label for="city"><spring:message code="shippingAddress.city" />: </label><form:input id="city" path="city" type="text"/> <form:errors path="city" /></p>
	<p><label for="state"><spring:message code="shippingAddress.state" />: </label><form:input id="state" path="state" type="text"/> <form:errors path="state" /></p>
	<p><label for="zip"><spring:message code="shippingAddress.zip" />: </label><form:input id="zip" path="zip" type="text"/> <form:errors path="zip" /></p>
	<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
	<input type="submit" name="_eventId_back" value="<spring:message code="button.Back" />" />
	<input type="submit" name="_eventId_submit" value="<spring:message code="button.Next" />" />
	<input type="submit" name="_eventId_cancel" value="<spring:message code="button.Cancel" />" />
</form:form>
</div>