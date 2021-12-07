package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddNewData;

public class Add_newTests extends TestBase {

  @Test
  public void testAddNewCreation() {
    app.getNavigationHelper().gotoAddNewPage();
    app.getAddNewHelper().fillAddNewForm(new AddNewData("sfgfgfd", "gfdgs", "gsfd",
           "gfdgfdg", "SONY", "79516545464", "fdskgh gufgyiu"));
    app.getAddNewHelper().submitAddNewCreation();
    app.getAddNewHelper().returnToHomePage();

  }
}