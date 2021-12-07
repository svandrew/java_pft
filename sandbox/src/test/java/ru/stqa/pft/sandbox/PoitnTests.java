package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PoitnTests {

  @Test
  public void testPoint() {
    Point p1 = new Point(1,6);
    Point p2 = new Point(1,2);

    Assert.assertEquals(Point.distance(p1,p2), 4);

  }
}

