package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

  @Test
  public void test0(){
    Equatuon e = new Equatuon(1,1,1);
    Assert.assertEquals(e.rootNumber(), 0);
  }

  @Test
  public void test1(){
    Equatuon e = new Equatuon(1,2,1);
    Assert.assertEquals(e.rootNumber(), 1);
  }

  @Test
  public void test2(){
    Equatuon e = new Equatuon(1,5,6);
    Assert.assertEquals(e.rootNumber(), 2);
  }
}
