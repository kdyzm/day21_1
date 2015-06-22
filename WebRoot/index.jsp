<%@page import="com.kdyzm.domain.Person"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
	contentType="text/html; charset=utf-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>Insert title here!</title>
  </head>
  
  <body>
  	<%
  		if(session.getAttribute("p")==null)
  		{
  			Integer a=new Random().nextInt(100);
  			session.setAttribute("p", new Person(a.toString()));
  		}
  	%>
  	${p}<br/>
  	<%
  		System.err.println(session.getId());
  	%>
  </body>
</html>
