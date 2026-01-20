import java.util.Scanner;

public class Main {
    //Calculator
    static double add(double a, double b) {
        return a + b;
    }
    static double sub(double a, double b) {
        return a - b;
    }
    static double mul(double a, double b) {
        return a * b;
    }
    static double div(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");

        try {
            System.out.print("Enter first number: ");
            double n1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double n2 = sc.nextDouble();

            System.out.print("Enter operator: ");
            char op = sc.next().charAt(0);

            double result;

            switch (op) {
                case '+':
                    result = add(n1, n2);
                    break;

                case '-':
                    result = sub(n1, n2);
                    break;

                case '*':
                    result = mul(n1, n2);
                    break;

                case '/':
                    result = div(n1, n2);
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operation");
            }
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Math Error: " +e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please try again.");
        }
        finally {
            //sc.close();
            System.out.println("Calculator closed.");
        }
    }
}