package com.example.demo_temp.service.impl;

import com.example.demo_temp.service.UserService;

public class UserServiceImpl implements UserService {
  @Override
  public boolean autenticate(String login, String pass) {
    return login.equals(pass);// TODO
  }
}
