
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "/WEB-INF/tld/mytag.tld" prefix = "mytag" %>
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
   <mytag:welcome/>
  </body>
</html>
