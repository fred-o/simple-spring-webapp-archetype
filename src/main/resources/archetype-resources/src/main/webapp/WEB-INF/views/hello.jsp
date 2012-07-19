#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <title>Hello</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/static/css/style.css"/>"/>
  </head>
  <body>
    Message: <%= request.getAttribute("message") %>
  </body>
</html>