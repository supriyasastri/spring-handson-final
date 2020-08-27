package org.springmvc.model;

import org.springframework.lang.NonNull;


public class BookInfo {

  @NonNull
  private String username;
  @NonNull
  private String bookName;
  @NonNull
  private String bookDescription;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getBookDescription() {
    return bookDescription;
  }

  public void setBookDescription(String bookDescription) {
    this.bookDescription = bookDescription;
  }
}
