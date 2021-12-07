package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.AddNewData;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteContact() {
    click(By.cssSelector(".left:nth-child(8) > input"));
    assertThat(wd.switchTo().alert().getText(), is("Delete 1 addresses?"));
    wd.switchTo().alert().accept();
  }
}

