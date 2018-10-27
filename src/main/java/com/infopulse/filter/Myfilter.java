package com.infopulse.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.LogRecord;

public class Myfilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
         String name = request.getParameter("username");
         name+=" filter";
         request.setAttribute("param", name);
         chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
