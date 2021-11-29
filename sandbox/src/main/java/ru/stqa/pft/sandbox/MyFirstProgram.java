package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] arg) {
    hello("world");
    hello("user");
    hello("Andy");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.aria());

    Rectangle r = new Rectangle(2, 5);
    System.out.println("Площадь прямоугольника с сторонами " + r.a + " и " + r.b + " = " + r.aria());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}
