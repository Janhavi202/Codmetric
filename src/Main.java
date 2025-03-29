import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        boolean continueToCalculate = true;

        while (continueToCalculate){
            System.out.println("Select an operation");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            if (choice == 5){
                continueToCalculate = false;
                System.out.println("Exiting from the Calculator");
                break;
            }

            System.out.println("Enter first number");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number");
            double num2 = sc.nextDouble();

            double result = 0;
            try {
                switch (choice) {
                    case 1 :
                        result = Calculator.add(num1, num2);
                        break;

                    case 2 :
                        result = Calculator.substract(num1, num2);
                        break;

                    case 3 :
                        result = Calculator.multiplication(num1, num2);
                        break;

                    case 4 :
                        result = Calculator.division(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid choice, Please select a valid operation");
                        continue;
                }

                System.out.println("Result : " + result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}