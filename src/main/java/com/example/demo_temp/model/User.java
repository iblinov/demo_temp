package com.example.demo_temp.model;

public class User {
  private int id;
  private String lastname;
  private int phone;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("User{");
    sb.append("id=").append(id);
    sb.append(", lastname='").append(lastname).append('\'');
    sb.append(", phone=").append(phone);
    sb.append('}');
    return sb.toString();
  }
}
