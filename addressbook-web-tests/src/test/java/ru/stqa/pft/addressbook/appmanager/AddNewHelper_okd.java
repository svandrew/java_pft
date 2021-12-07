package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.AddNewData;

public class AddNewHelper_okd extends HelperBase {

  public AddNewHelper_okd(FirefoxDriver wd) {
    super(wd);
  }
  public void returnToAddNewPage() {
    click(By.linkText("add new"));
  }
  public void initAddNewCreation() {
    click(By.name("new"));
  }
  public void fillGroupForm(AddNewData addNewData) {
    type(By.name("firstname"), addNewData.getFirstname());
    type(By.name("middlename"), addNewData.getMiddlename());
    type(By.name("lastname"), addNewData.getLastname());
    type(By.name("nickname"), addNewData.getNickname());
    type(By.name("company"), addNewData.getCompany());
    type(By.name("mobile"), addNewData.getMobile());
    type(By.name("notes"), addNewData.getNotes());
  }

}

