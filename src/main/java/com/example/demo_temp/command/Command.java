package com.example.demo_temp.command;

import jakarta.servlet.http.HttpServletRequest;

public interface Command {
  String execute(HttpServletRequest request);
}
