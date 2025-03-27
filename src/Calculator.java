public class Calculator {

    //Add method
    public static double add(double a, double b){
        return a + b;
    }

    //Substract method
    public static double substract(double a, double b){
        return a - b;
    }

    //Multiplication method
    public static double multiplication(double a, double b){
        return a * b;
    }

    //Division method
    public static double division(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Divide by zero is not allowed");
        }
        return a / b;
    }
}
