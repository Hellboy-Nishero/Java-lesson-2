package myPackage;
public class SimpleCalculator {
    public int a;
    public int b;
    public SimpleCalculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a + b;
    }


    public int subtract(){
        int res = 0;
        if(a < b) {
            res = b - a;
        } else {
            res = a - b;
        }
        return res;
    }


    public int multiply(){
        return a * b;
    }


    public int divide(){
        int res = 0;
        if(a < b) {
            res = b / a;
        } else {
            res = a / b;
        }
        return res;
    }

    public void displayResults(){
        System.out.println("Сложение: " + add());
        System.out.println("Вычитание: " + subtract());
        System.out.println("Умножение: " + multiply());
        System.out.println("Деление: " + divide());
    }

}
