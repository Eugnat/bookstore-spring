<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<nav class="side-navigation">
			<ul>
				<li><a href="<c:url value="/books/bestsellers"/>"><spring:message code="SideNavigation.bestsellers" /></a></li>
				<li><a href="<c:url value="/books/category/fiction"/>"><spring:message code="SideNavigation.fiction" /></a></li>
				<li><a href="<c:url value="/books/category/essays"/>"><spring:message code="SideNavigation.essays" /></a></li>
				<li><a href="<c:url value="/books/category/children"/>"><spring:message code="SideNavigation.children" /></a></li>
				<li><a href="<c:url value="/books/category/history"/>"><spring:message code="SideNavigation.history" /></a></li>
				<li><a href="<c:url value="/books/category/poetry"/>"><spring:message code="SideNavigation.poetry" /></a></li>
			</ul>
		</nav>	