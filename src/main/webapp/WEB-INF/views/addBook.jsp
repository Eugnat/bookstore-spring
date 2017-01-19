<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<form:form cssClass="addbook" modelAttribute="newBook" enctype="multipart/form-data">

<legend>Чтобы добавить новую книгу, заполните все поля и загрузите файл изображения (не более 1МБ):</legend>
<form:errors path="*" cssClass="errormessage" element="div"/>
<br>
<p><label for="title">Название: </label><form:input id="title" path="title" type="text"/></p><p><form:errors path="title" cssClass="errormessage"/></p>
<p><label for="author">Автор: </label><form:input id="author" path="author" type="text"/></p><p><form:errors path="author" cssClass="errormessage"/></p>
<p><label for="pageNumber">Количество страниц: </label><form:input id="pageNumber" path="pageNumber" type="text"/></p><p><form:errors path="pageNumber" cssClass="errormessage"/></p>
<p><label for="isbn">ISBN: </label><form:input id="isbn" path="isbn" type="text"/></p><p><form:errors path="isbn" cssClass="errormessage"/></p>
<p><label for="category">Категория: </label>
<form:select id="category" path="category">
<form:option value="" label="Выберите категорию" />
<form:options items="${categoryList}" itemLabel="categoryName" />
</form:select>
<form:errors path="category" cssClass="errormessage"/>
</p>
<p><label for="publishingHouse">Издательство: </label><form:input id="publishingHouse" path="publishingHouse" type="text"/></p><p><form:errors path="publishingHouse" cssClass="errormessage"/></p>
<p><label for="issueYear">Год издания: </label><form:input id="issueYear" path="issueYear" type="text"/></p><p><form:errors path="issueYear" cssClass="errormessage"/></p>
<p><label for="price">Цена: </label><form:input id="price" path="price" type="text"/></p><p><form:errors path="price" cssClass="errormessage"/></p>
<p><label for="bestseller">Бестселлер (да/нет): </label>
<form:select id="bestseller" path="bestseller">
<form:option value="true" label="да" />
<form:option value="false" label="нет" />
</form:select>
<form:errors path="bestseller" cssClass="errormessage"/>
</p>
<p><label for="language">Язык: </label><form:input id="language" path="language" type="text"/></p><p><form:errors path="language" cssClass="errormessage"/></p>
<p><label for="copyNumber">Тираж: </label><form:input id="copyNumber" path="copyNumber" type="text"/></p><p><form:errors path="copyNumber" cssClass="errormessage"/></p>
<p><label for="imageFile">Загрузить файл изображения: </label><form:input id="imageFile" path="imageFile" type="file" accept="image/jpeg" /></p>
<p>	
	<label><input type="reset" value="Сбросить" /></label>
	<label><input type="submit" value="Сохранить" /></label>
</p>
</form:form>
	
</div>