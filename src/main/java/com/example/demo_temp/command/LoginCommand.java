package com.example.demo_temp.command;

import com.example.demo_temp.service.UserService;
import com.example.demo_temp.service.impl.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;

public class LoginCommand implements Command{
  @Override
  public String execute(HttpServletRequest request) {
    String loginUser = request.getParameter("login");
    String passUser = request.getParameter("pass");
    UserService service = new UserServiceImpl();
    String pageResult;
    if(service.autenticate(loginUser, passUser)) {
      pageResult = "pages/main.jsp";
    } else {
      pageResult = "index.jsp";
    }
    return pageResult;
  }
}
