<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<h3>Введите критерии для поиска</h3>
<form action="search" method="post">
	<table>
		<tr>
			<td><label for="title">Название: </label></td><td><input type="text" name="title" value="" /></td>
		</tr>
		<tr>
			<td><label for="author">Автор: </label></td><td><input type="text" name="author" value="" />
		</tr>
		<tr>
			<td><label for="isbn">ISBN: </label></td><td><input type="text" name="isbn" value=""/>
		</tr>
		<tr>
			<td><input type="reset" value="Сбросить" /></td><td><input type="submit" value="Поиск" /></td>
		</tr>
	</table>
</form>
</div>