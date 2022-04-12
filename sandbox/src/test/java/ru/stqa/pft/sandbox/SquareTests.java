package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class SquareTests {

  @Test
    public void testArea(){
      Square s = new Square(5);
      assert s.aria() == 24;
//    Assert.assertEquals(s.aria(), 25);
    }
}


