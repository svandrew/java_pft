package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddNewData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification (){
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new AddNewData("ФИНН", "gfdgs", "gsfd",
            "gfdgfdg", "SONY", "79516545464", "fdskgh gufgyiu"));
    app.getContactHelper().updateContactModication();
    app.getContactHelper().returnToHomePage();
  }
}
