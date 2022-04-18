package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {

  private final GroupHelper groupHelper = new GroupHelper();

  public void init() {
    System.setProperty("webdriver.gecko.driver", "c:/temp/geckodriver.exe");
    groupHelper.wd = new FirefoxDriver();
  }

  private void login(String username, String password) {
    groupHelper.wd.get("http://localhost/addressbook/group.php");
    groupHelper.wd.findElement(By.xpath("//input[@name='user']")).click();
    groupHelper.wd.findElement(By.xpath("//input[@name='user']")).sendKeys(username);
    groupHelper.wd.findElement(By.name("pass")).click();
    groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
    groupHelper.wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  public void stop() {
    groupHelper.wd.quit();
  }

  public void gotoGroupPage() {
    groupHelper.wd.findElement(By.linkText("groups")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }
}
