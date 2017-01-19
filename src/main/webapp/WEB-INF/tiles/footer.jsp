<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<footer>
			<div id="first-column">
				<ul>
					<li><a href="<c:url value="/"/>"><spring:message code="navigation.home" /></a></li>
					<li><a href="<c:url value="/info/company"/>"><spring:message code="navigation.companyInfo" /></a></li>
					<li><a href="<c:url value="/info/contacts"/>"><spring:message code="navigation.contacts" /></a></li>
				</ul>
			</div>
			<div id="second-column">
				<ul>
					<li><a href="<c:url value="/info/payment"/>"><spring:message code="navigation.payment" /></a></li>
					<li><a href="<c:url value="/info/delivery"/>"><spring:message code="navigation.delivery" /></a></li>
					<li><a href="<c:url value="/info/legal"/>"><spring:message code="navigation.legal" /></a></li>
				</ul>
			</div>
		</footer>