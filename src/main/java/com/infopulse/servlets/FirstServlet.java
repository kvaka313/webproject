package com.infopulse.servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        Cookie[]  cookies = request.getCookies();
        String name = null;
        for(Cookie cookie:cookies){
            if("name".equals(cookie.getName())){
                name=cookie.getValue();
                break;
            }
        }
        if(name == null){
            name =request.getParameter("username");
            Cookie cookie = new Cookie("name", name);
            cookie.setMaxAge(1000);
            response.addCookie(cookie);
        }
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Hello, "+name);
        out.println("</body></html>");
        out.close();
    }
}
