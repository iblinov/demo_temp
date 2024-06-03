package com.example.demo_temp.command;

import java.util.Arrays;

public enum CommandType {
  LOGIN(new LoginCommand()),
  LOGOUT(new LogoutCommand()),
  VIEW_ALL_USERS(new ViewAllUsersCommand()),
  EMPTY(new EmptyCommand());
  private Command command;

  CommandType(Command command) {
    this.command = command;
  }

  public Command getCommand() {
    return command;
  }

  public static Command define(String cmdStr) {
    return Arrays.stream(CommandType.values())
            .filter(e -> e.name().equals(cmdStr.toUpperCase()))
            .findFirst()
            .orElse(CommandType.EMPTY)
            .getCommand();
  }
}
