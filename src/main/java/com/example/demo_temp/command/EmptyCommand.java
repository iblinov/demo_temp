package com.example.demo_temp.command;

import jakarta.servlet.http.HttpServletRequest;

public class EmptyCommand implements Command{
  @Override
  public String execute(HttpServletRequest request) {
    return "pages/empty.jsp";
  }
}
