<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<form:form  modelAttribute="newBook">
<legend>Чтобы добавить новую книгу, заполните все поля:</legend>
<p><label for="title">Название: </label><form:input id="title" path="title" type="text"/></p>
<p><label for="author">Автор: </label><form:input id="author" path="author" type="text"/></p>
<p><label for="pageNumber">Количество страниц: </label><form:input id="pageNumber" path="pageNumber" type="text"/></p>
<p><label for="isbn">ISBN: </label><form:input id="isbn" path="isbn" type="text"/></p>
<p><label for="category">Категория: </label></p>
<p><form:select id="category" path="category">
<form:option value="" label="Выберите категорию" />
<form:options items="${categoryList}" itemLabel="categoryName" />
</form:select></p>
<p><label for="publishingHouse">Издательство: </label><form:input id="publishingHouse" path="publishingHouse" type="text"/></p>
<p><label for="issueYear">Год издания: </label><form:input id="issueYear" path="issueYear" type="text"/></p>
<p><label for="price">Цена: </label><form:input id="price" path="price" type="text"/></p>
<p><label for="bestseller">Бестселлер (да/нет): </label></p>
<p>
<form:select id="bestseller" path="bestseller">
<form:option value="true" label="yes" />
<form:option value="false" label="no" />
</form:select>
</p>
<p><label for="language">Язык: </label><form:input id="language" path="language" type="text"/></p>
<p><label for="copyNumber">Тираж: </label><form:input id="copyNumber" path="copyNumber" type="text"/></p>
<!-- 			<input type="reset" value="Сбросить" /> -->
<!-- 			<input type="submit" value="Отправить" /> -->
<%-- 	</form:form> --%>
	<input type="reset" value="Reset" />
	<input type="submit" value="Send" />
</form:form>
	
</div>