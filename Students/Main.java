package Students;

public class Main {
    // create a method
    public double differenceNumbers(double num1, double num2 ){
        double diff = num1 - num2;
        // return value
        return diff;
    }

    public static void main(String[] args) {
        int a =2, b=3;
        // create an object of class main
        Main obj = new Main();

        // calling method differenceNumbers
        double result = obj.differenceNumbers(9.999,8.888);
        System.out.println("difference of two nos. " +result);
    }
}
