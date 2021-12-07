package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModificftion (){
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModificftion();
    app.getGroupHelper().fillGroupForm(new GroupData("test55", "test44", "test77"));
    app.getGroupHelper().submitGroupModication();
    app.getGroupHelper().returnToGroupPage();

  }
}
