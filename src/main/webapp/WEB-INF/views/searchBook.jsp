<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<h3><spring:message code="searchPage.enterCriteria" /></h3>
<form action="search" method="post">
	<table>
		<tr>
			<td><label for="title"><spring:message code="book.title"/>: </label></td><td><input type="text" name="title" value="" /></td>
		</tr>
		<tr>
			<td><label for="author"><spring:message code="book.author"/>: </label></td><td><input type="text" name="author" value="" />
		</tr>
		<tr>
			<td><label for="isbn"><spring:message code="book.isbn"/>: </label></td><td><input type="text" name="isbn" value=""/>
		</tr>
		<tr>
			<td><input type="reset" value="<spring:message code="button.Reset"/>" /></td><td><input type="submit" value="<spring:message code="button.Search"/>" /></td>
		</tr>
	</table>
</form>
</div>