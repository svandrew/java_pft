package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(6);
 //   assert s.aria() == 24; // проверяем, но не знаем какая цифра получилась
    Assert.assertEquals(s.aria(), 36); // использую функцию Assert мы получам возможноть видить оба значения
    }
}


