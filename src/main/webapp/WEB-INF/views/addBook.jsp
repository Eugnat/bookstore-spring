<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="main-content">
<c:set var="labelSelect"><spring:message code="option.selectCategory" /></c:set>
<c:set var="labelYes"><spring:message code="option.yes" /></c:set>
<c:set var="labelNo"><spring:message code="option.no" /></c:set>
<form:form cssClass="addbook" modelAttribute="newBook" enctype="multipart/form-data">

<legend><spring:message code="addBook.intro" />:</legend>
<form:errors path="*" cssClass="errormessage" element="div"/>
<br>
<p><label for="title"><spring:message code="book.title" />: </label><form:input id="title" path="title" type="text"/></p><p><form:errors path="title" cssClass="errormessage"/></p>
<p><label for="author"><spring:message code="book.author" />: </label><form:input id="author" path="author" type="text"/></p><p><form:errors path="author" cssClass="errormessage"/></p>
<p><label for="pageNumber"><spring:message code="book.pageNumber" />: </label><form:input id="pageNumber" path="pageNumber" type="text"/></p><p><form:errors path="pageNumber" cssClass="errormessage"/></p>
<p><label for="isbn"><spring:message code="book.isbn" />: </label><form:input id="isbn" path="isbn" type="text"/></p><p><form:errors path="isbn" cssClass="errormessage"/></p>
<p><label for="category"><spring:message code="book.category" />: </label>
<form:select id="category" path="category">
<form:option value="" label="${labelSelect}" />
<form:options items="${categoryList}" itemLabel="categoryName" />
</form:select>
<form:errors path="category" cssClass="errormessage"/>
</p>
<p><label for="publishingHouse"><spring:message code="book.publishingHouse" />: </label><form:input id="publishingHouse" path="publishingHouse" type="text"/></p><p><form:errors path="publishingHouse" cssClass="errormessage"/></p>
<p><label for="issueYear"><spring:message code="book.issueYear" />: </label><form:input id="issueYear" path="issueYear" type="text"/></p><p><form:errors path="issueYear" cssClass="errormessage"/></p>
<p><label for="price"><spring:message code="book.price" />: </label><form:input id="price" path="price" type="text"/></p><p><form:errors path="price" cssClass="errormessage"/></p>
<p><label for="bestseller"><spring:message code="book.bestseller" />: </label>
<form:select id="bestseller" path="bestseller">
<form:option value="true" label="${labelYes}" />
<form:option value="false" label="${labelNo}" />
</form:select>
<form:errors path="bestseller" cssClass="errormessage"/>
</p>
<p><label for="language"><spring:message code="book.language" />: </label><form:input id="language" path="language" type="text"/></p><p><form:errors path="language" cssClass="errormessage"/></p>
<p><label for="copyNumber"><spring:message code="book.copyNumber" />: </label><form:input id="copyNumber" path="copyNumber" type="text"/></p><p><form:errors path="copyNumber" cssClass="errormessage"/></p>
<p><label for="imageFile"><spring:message code="book.imageFile" />: </label><form:input id="imageFile" path="imageFile" type="file" accept="image/jpeg" /></p>
<p>	
	<label><input type="reset" value="<spring:message code="button.Reset" />" /></label>
	<label><input type="submit" value="<spring:message code="button.Save" />" /></label>
</p>
</form:form>
	
</div>