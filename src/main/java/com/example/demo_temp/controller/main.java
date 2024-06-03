package com.example.demo_temp.controller;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    String query =
            "/demo_temp_war_exploded/login.do";
    query = query.split("/")[2];
    System.out.println(query);
    query = query.split("\\p{Punct}")[0];
    System.out.println(query);
  }
}
