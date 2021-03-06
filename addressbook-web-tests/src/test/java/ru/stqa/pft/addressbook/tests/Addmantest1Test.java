package ru.stqa.pft.addressbook.tests;
// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Addmantest1Test {
  FirefoxDriver driver;
  @BeforeMethod
  public void setUp() {
    System.setProperty("webdriver.gecko.driver","c:/temp/geckodriver.exe");
    driver = new FirefoxDriver();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void addmantest1() {
    // Test name: add_man_test1
    // Step # | name | target | value
    // 1 | open | /addressbook/ | 
    driver.get("http://localhost/addressbook/");
    // 2 | setWindowSize | 846x695 | 
    driver.manage().window().setSize(new Dimension(846, 695));
    // 3 | type | name=user | admin
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).sendKeys("secret");
    // 4 | click | css=input:nth-child(7) | 
    driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    // 5 | click | linkText=add new | 
    driver.findElement(By.linkText("add new")).click();
    // 6 | click | name=firstname | 
    driver.findElement(By.name("firstname")).click();
    // 7 | type | name=firstname | 324325325
    driver.findElement(By.name("firstname")).sendKeys("324325325");
    // 8 | click | name=middlename | 
    driver.findElement(By.name("middlename")).click();
    // 9 | type | name=middlename | 423435
    driver.findElement(By.name("middlename")).sendKeys("423435");
    // 10 | click | name=lastname | 
    driver.findElement(By.name("lastname")).click();
    // 11 | type | name=lastname | 4324325
    driver.findElement(By.name("lastname")).sendKeys("4324325");
    // 12 | click | name=nickname | 
    driver.findElement(By.name("nickname")).click();
    // 13 | type | name=nickname | gtrtr
    driver.findElement(By.name("nickname")).sendKeys("gtrtr");
    // 14 | click | name=title | 
    driver.findElement(By.name("title")).click();
    // 15 | type | name=title | erere
    driver.findElement(By.name("title")).sendKeys("erere");
    // 16 | click | name=company | 
    driver.findElement(By.name("company")).click();
    // 17 | type | name=company | fdsfds
    driver.findElement(By.name("company")).sendKeys("fdsfds");
    // 18 | click | name=address | 
    driver.findElement(By.name("address")).click();
    // 19 | type | name=address | dfdsfsd
    driver.findElement(By.name("address")).sendKeys("dfdsfsd");
    // 20 | click | css=input:nth-child(87) | 
    driver.findElement(By.cssSelector("input:nth-child(87)")).click();
  }
}
