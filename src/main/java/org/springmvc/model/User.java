package org.springmvc.model;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class User  implements Serializable {
    @NotNull
  private String username;
@NotNull
  private String password;
@NotNull
  private String firstName;
 @NotNull
  private String lastName;

  private int age;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
