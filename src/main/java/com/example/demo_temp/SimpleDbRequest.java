package com.example.demo_temp;

import com.example.demo_temp.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SimpleDbRequest {
  public static List<User> findAll() {
    try {
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    } catch (SQLException e) {
      e.printStackTrace();
    }
    String url = "jdbc:mysql://localhost:3306/testphones";
    Properties prop = new Properties();
    prop.put("user", "root");
    prop.put("password", "Root_123");
    prop.put("autoReconnect", "true");
    prop.put("characterEncoding", "UTF-8");
    prop.put("useUnicode", "true");
    prop.put("useSSL", "true");
    prop.put("useJDBCCompliantTimezoneShift", "true");
    prop.put("useLegacyDatetimeCode", "false");
    prop.put("serverTimezone", "UTC");
    prop.put("serverSslCert", "classpath:server.crt");
    List<User> list = new ArrayList<>();
    try (Connection connection = DriverManager.getConnection(url, prop);
         Statement statement = connection.createStatement()) {
      String sql = "SELECT id_user, lastname, phone_number FROM phones";

      try (ResultSet resultSet = statement.executeQuery(sql)) {
        while (resultSet.next()) {
          int id = resultSet.getInt(1);
          String name = resultSet.getString(2);
          int number = resultSet.getInt("phone_number");
          User user = new User();
          user.setId(id);
          user.setLastname(name);
          user.setPhone(number);
          list.add(user);
          System.out.println("id ="+ id + "  lastname="+ name +"  phone=" +number);
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }
}

