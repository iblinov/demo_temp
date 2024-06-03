package com.example.demo_temp.controller;

import java.io.*;
import java.util.List;

import com.example.demo_temp.command.Command;
import com.example.demo_temp.command.CommandType;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = {"/hello-servlet", "*.do"})
public class HelloServlet extends HttpServlet {

  public void init() {

  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    response.setContentType("text/html");
    //1
    String cmdStr = request.getParameter("command");
    //2
    String query = request.getRequestURI();
    query = query.split("/")[2];
    System.out.println(query);
    query = query.split("\\p{Punct}")[0];
    System.out.println(query);
    request.setAttribute("queryStr", query);
    // 1//Command command = CommandType.define(cmdStr);
    Command command = CommandType.define(query);
    String page = command.execute(request);
    request.getRequestDispatcher(page).forward(request, response);
  }

  public void destroy() {
  }
}