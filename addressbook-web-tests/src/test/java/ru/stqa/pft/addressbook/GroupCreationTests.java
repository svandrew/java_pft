package ru.stqa.pft.addressbook;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class GroupCreationTests {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception{
    System.setProperty("webdriver.gecko.driver","c:/temp/geckodriver.exe");
    //    WebDriver driver = new FirefoxDriver();

    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      }

  @After
  public void tearDown() {
    wd.quit();
  }

  @Test
  public void testGroupCreation() {
    wd.get("http://localhost/addressbook/group.php");
    wd.findElement(By.xpath("//input[@name='user']")).click();
 //   wd.findElement(By.name("user")).clear();
    wd.findElement(By.xpath("//input[@name='user']")).sendKeys("admin");
    wd.findElement(By.name("pass")).click();
 //   wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    wd.findElement(By.linkText("groups")).click();
    wd.findElement(By.name("new")).click();
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys("test3");
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys("test4");
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys("test6");
    wd.findElement(By.name("submit")).click();
    wd.findElement(By.xpath("//a[contains(text(),'group page')]")).click();

  }
}
