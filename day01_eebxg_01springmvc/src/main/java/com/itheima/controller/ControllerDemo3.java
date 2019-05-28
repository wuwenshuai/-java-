package com.itheima.controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
public class ControllerDemo3 implements HttpRequestHandler {

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/success3.jsp").forward(request,response);
        return;
    }
}
