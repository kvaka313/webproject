
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri = "/WEB-INF/tld/mytag.tld" prefix = "mytag" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <form action="./servlet" method="GET">
      <input type="text" name="username" valuie=""/>
      <br>
      <input type="submit" name="ok" value="send"/>

    </form>
    <mytag:welcome name="vasya">
       ew7teuwteywtewyetwyuteuytewytew
       daywqtywtwyeteywteytewytdeydteytdey
    </mytag:welcome>
    <c:set var="myvar" value="jjjjjjjjj"/>
    <c:out value="${myvar}"/>
  </body>
</html>
