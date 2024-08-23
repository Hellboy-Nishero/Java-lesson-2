import myPackage.SimpleCalculator;
import myPackage.Rectangle;
public class Main {
    public static void main(String[] args) {
//    SimpleCalculator calculator1 = new SimpleCalculator(7, 10);
//    SimpleCalculator calculator2 = new SimpleCalculator(10, 7);
//    SimpleCalculator calculator3 = new SimpleCalculator(15, 10);
//    SimpleCalculator calculator4 = new SimpleCalculator(21, 19);
//
//    System.out.println("Первый калькулятор:");
//    calculator1.displayResults();
//    System.out.println("\n");
//
//    System.out.println("Второй калькулятор:");
//    calculator2.displayResults();
//    System.out.println("\n");
//
//    System.out.println("Третий калькулятор:");
//    calculator3.displayResults();
//    System.out.println("\n");
//
//    System.out.println("Четвёртый калькулятор:");
//    calculator4.displayResults();

        Rectangle rectangle1 = new Rectangle(7.5, 10);
        Rectangle rectangle2 = new Rectangle(8.25, 12);

        System.out.println("Первый треугольник:");
        rectangle1.displayRectangleInfo();
        System.out.println("\n");

        System.out.println("Второй треугольник:");
        rectangle2.displayRectangleInfo();
    }
}