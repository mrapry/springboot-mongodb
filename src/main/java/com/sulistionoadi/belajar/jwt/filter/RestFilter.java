/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulistionoadi.belajar.jwt.filter;

import com.sulistionoadi.belajar.jwt.handler.CustomRequestHandler;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author adi
 */
public class RestFilter implements Filter {
    
    @Override
    public void init(FilterConfig fc) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        CustomRequestHandler requestHandler = new CustomRequestHandler((HttpServletRequest) sr);
        fc.doFilter(requestHandler, sr1);
    }

    @Override
    public void destroy() {
    }
    
}
