package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelationTests extends TestBase {

  @Test
  public void testGroupDelation() {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
  }

}
