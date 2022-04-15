package ru.stqa.pft.addressbook;

import org.junit.After;
import org.testng.annotations.BeforeMethod;

public class TestBase extends ApplicationManager {

  @BeforeMethod
  public void setUp() throws Exception {
    init();
  }

  @After
  public void tearDown() {
    stop();
  }

}
