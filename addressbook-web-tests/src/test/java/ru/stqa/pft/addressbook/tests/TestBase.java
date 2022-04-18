package ru.stqa.pft.addressbook.tests;

import org.junit.After;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @After
  public void tearDown() {
    app.stop();
  }

}
