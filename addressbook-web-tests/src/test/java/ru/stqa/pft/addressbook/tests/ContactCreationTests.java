package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddNewData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoAddNewPage();
    app.getContactHelper().fillContactForm(new AddNewData("sfgfgfd", "gfdgs", "gsfd",
           "gfdgfdg", "SONY", "79516545464", "fdskgh gufgyiu"));
    app.getContactHelper().submitAddNewCreation();
    app.getContactHelper().returnToHomePage();

  }
}