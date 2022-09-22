package codingTest.algorithm.classs;

import org.w3c.dom.css.CSSImportRule;

public class CircleTest {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.radius = 100;
        circle.color = "blue";
        double area = circle.calcArea();
        System.out.println("원의 넓이 = " + area);

    }




    static class Circle{
        int radius;
        String color;

        double calcArea() {
            return 3.14 * radius * radius;
        }
    }
}


