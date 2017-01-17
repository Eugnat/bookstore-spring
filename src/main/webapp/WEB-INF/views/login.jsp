<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<div class="main-content">
<h3>Введите имя и пароль для входа:</h3>
<c:if test="${not empty error}">					
	<p>
		<spring:message code="LoginPage.badCredentials"/><br />
	</p>
</c:if>
<p>
	<form action="<c:url value= "/j_spring_security_check"></c:url>" method="post">
		<fieldset>
								
		<p><input class="login-field" placeholder= "Имя пользователя" name='j_username' type="text"></p>
		<p><input class="login-field" placeholder= "Пароль" name='j_password'  type= "password" value=""></p>
		<p><input class="login-button" type="submit" value="Вход"></p>
		</fieldset>
	</form>
</p>
</div>