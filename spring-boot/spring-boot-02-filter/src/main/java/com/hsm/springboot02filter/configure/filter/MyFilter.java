package com.hsm.springboot02filter.configure.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Auther: huangsenming
 * @Date: 2019/12/23 16:53
 * @Description:
 */
public class MyFilter implements Filter {
    /*@Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }*/

    /*@Override
    public void destroy() {

    }*/

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println("this is MyFilter,url :"+request.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
