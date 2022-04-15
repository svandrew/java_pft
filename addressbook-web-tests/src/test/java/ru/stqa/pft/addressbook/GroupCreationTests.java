package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase { //класс TestBase содержит общие функции и методы для всех тестов

  @Test
  public void testGroupCreation() {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test3", "test4", "test6"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
