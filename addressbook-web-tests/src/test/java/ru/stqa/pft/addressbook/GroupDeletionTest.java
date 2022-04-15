package ru.stqa.pft.addressbook;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupDeletionTest {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "c:/temp/geckodriver.exe");
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.get("http://localhost/addressbook/group.php");
    wd.findElement(By.xpath("//input[@name='user']")).click();
    wd.findElement(By.xpath("//input[@name='user']")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  @After
  public void tearDown() {
    wd.quit();
  }

  @Test
  public void testGroupDeletion() {
    wd.findElement(By.linkText("groups")).click();
    wd.findElement(By.xpath("//input[@name='selected[]']")).click();
    wd.findElement(By.xpath("//input[@name='delete']")).click();
    wd.findElement(By.xpath("//a[contains(text(),'group page')]")).click();
  }

}
