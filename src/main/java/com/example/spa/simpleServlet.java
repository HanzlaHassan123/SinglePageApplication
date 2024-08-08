package com.example.spa;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "simpleServlet", urlPatterns = "/simple-servlet")
public class simpleServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
         PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Simple Servlet</h1>");
            out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
