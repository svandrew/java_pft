package ru.stqa.pft.addressbook;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class GroupCreationTests extends TestBase { //класс TestBase содержит общие функции и методы для всех тестов

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test3", "test4", "test6"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
