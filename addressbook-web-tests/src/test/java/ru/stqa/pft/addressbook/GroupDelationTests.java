package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDelationTests extends TestBase {

  @Test
  public void testGroupDelation() {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
