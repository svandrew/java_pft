package ru.stqa.pft.addressbook.model;

public class AddNewData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String company;
  private final String mobile;
  private final String notes;


  public AddNewData(String firstname, String middlename, String lastname,
                    String nickname, String company, String mobile, String notes) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.mobile = mobile;
    this.notes = notes;
  }


  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getMobile() {
    return mobile;
  }

  public String getNotes() {
    return notes;
  }

}