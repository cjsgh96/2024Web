<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");

String ticket_id =request.getParameter("ticket_id");
String ticket_type =request.getParameter("ticket_type");
String ticket_time =request.getParameter("ticket_time");
String ticket_age =request.getParameter("ticket_age");
String ticket_price =request.getParameter("ticket_price");

out.println(ticket_id);
out.println(ticket_type);
out.println(ticket_time);
out.println(ticket_age);
out.println(ticket_price);




%>