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

    Point p1 = new Point(5,4);
    Point p2 = new Point(1,1);

    System.out.println();
    System.out.println("Расстояние между точками = " + Point.distance(p1,p2));
  }



  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }




//  public static double distance(Point p1, Point p2) {
//  return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y -p2.y));
//     }
//

}
