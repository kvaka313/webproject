package com.infopulse.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name =request.getParameter("username");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Hello, "+name);
        out.println("</body></html>");
        out.close();
    }
}
