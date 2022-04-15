package ru.stqa.pft.addressbook;

import org.junit.After;
import org.testng.annotations.BeforeMethod;

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
