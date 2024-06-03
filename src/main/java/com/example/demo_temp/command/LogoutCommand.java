package com.example.demo_temp.command;

import jakarta.servlet.http.HttpServletRequest;

public class LogoutCommand implements Command{
  @Override
  public String execute(HttpServletRequest request) {
    return null;
  }
}
