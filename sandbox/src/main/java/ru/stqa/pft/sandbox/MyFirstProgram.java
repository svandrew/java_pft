package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] arg) {
        hello("wolrd");
        hello("user");
        hello ("Andy");

        double l = 6;
        System.out.println("Площадь кварата со стороной " +l + "=" +aria(l));

        double q = 3;
        double k = 6;
        System.out.println("Площадь прямоуголника с сторонами " + q +" и " + k + " = " +aria(q,k));
    }
    public static void hello(String somebody){
        System.out.println("Hello, " + somebody +"!");
    }

    public static double aria(double len){
        return len * len;
    }

    public static double aria(double a, double b){
        return  a * b;
    }
}
