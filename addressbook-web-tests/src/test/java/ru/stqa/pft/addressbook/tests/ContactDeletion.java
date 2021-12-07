package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddNewData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactDeletion extends TestBase{

    @Test
    public void testContactDeletion (){
      app.getNavigationHelper().gotoHomePage();
      app.getContactHelper().selectContact();
      app.getContactHelper().deleteContact();
      app.getNavigationHelper().gotoHomePage();
  }
}
