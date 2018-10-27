package com.infopulse.filter;


import javax.servlet.*;
import java.io.IOException;

public class OtherFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String name = (String)request.getAttribute("param");
        name+=" filter2";
        request.setAttribute("param", name);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
