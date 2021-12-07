package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.AddNewData;

public class AddNewHelper extends HelperBase {

  public AddNewHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void fillAddNewForm(AddNewData addNewData) {
    type(By.name("firstname"), addNewData.getFirstname());
    type(By.name("middlename"), addNewData.getMiddlename());
    type(By.name("lastname"), addNewData.getLastname());
    type(By.name("nickname"), addNewData.getNickname());
    type(By.name("company"), addNewData.getCompany());
    type(By.name("mobile"), addNewData.getMobile());
    type(By.name("notes"), addNewData.getNotes());
  }
  public void submitAddNewCreation() {
    click(By.name("submit"));
  }
}
