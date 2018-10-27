package com.infopulse.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
//        Cookie[]  cookies = request.getCookies();
//        String name = null;
//        for(Cookie cookie:cookies){
//            if("name".equals(cookie.getName())){
//                name=cookie.getValue();
//                break;
//            }
//        }
//        if(name == null){
//            name =request.getParameter("username");
//            Cookie cookie = new Cookie("name", name);
//            cookie.setMaxAge(1000);
//            response.addCookie(cookie);
//        }
        HttpSession httpSession = request.getSession(true);
        String name = null;
        if(httpSession.getAttribute("name")!=null){
            name = (String)httpSession.getAttribute("name");
        }else{
            name =(String)request.getAttribute("param");
            httpSession.setAttribute("name", name);
            httpSession.setMaxInactiveInterval(2000);
        }

        httpSession.setAttribute("internalName", name);
        RequestDispatcher rd = request.getRequestDispatcher("/outputservlet");
        //RequestDispatcher rd1 = getServletContext().getRequestDispatcher("/outputservlet");
        rd.forward(request, response);

    }
}
