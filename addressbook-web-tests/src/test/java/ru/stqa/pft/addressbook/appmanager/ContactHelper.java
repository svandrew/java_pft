package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.AddNewData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void fillContactForm(AddNewData addNewData) {
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

  public void initContactModification() {
    click(By.cssSelector("tr:nth-child(4) > .center:nth-child(8) img"));
  }

  public void updateContactModication() {
    click(By.name("update"));
  }
}

//  public void fillGroupForm(GroupData groupData) {
 //   type(By.name("group_name"), groupData.getName());
//    type(By.name("group_header"), groupData.getHeader());
 //   type(By.name("group_footer"), groupData.getFooter());
//  }