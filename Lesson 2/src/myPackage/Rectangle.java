package myPackage;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return (width * height) / 2;
    }

    public double calculatePerimeter(){
        return width+width+height;
    }

    public void displayRectangleInfo(){
        System.out.println("Периметр треугольника: " + calculatePerimeter());
        System.out.println("Площадь треугольника: " + calculateArea());
    }
}
