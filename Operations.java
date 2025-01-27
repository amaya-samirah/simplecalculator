/**
 * This is where all the functions to implement operations will be
 * @author Amaya Shabazz
 */

 public class Operations {

    private String[] operationList = {"^", "*", "/", "+", "-"};  // mathematic operations

    public Operations() {

    }

    protected double getAnswer(String operation, double num1, double num2) {
        double ans = 0;
        switch (operation) {
            case "+":
                ans = Add(num1, num2);
                break;
            case "-":
                ans = Subtract(num1, num2);
                break;
            case "*":
                ans = Multiply(num1, num2);
                break;
            case "/":
                ans = Divide(num1, num2);
                break;
            case "^":
                ans = Exponent(num1, num2);
                break;
            default:
                break;
        }

        return ans;
    }

    /**
     * Addition
     * @param num1
     * @param num2
     * @return Sum of num1 & num2
     */
    private double Add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtraction
     * @param num1
     * @param num2
     * @return Difference between num1 & num2
     */
    private double Subtract(double num1, double num2){
        return num1 - num2;
    }

    /**
     * Multiplication
     * @param num1
     * @param num2
     * @return Product of num1 & num2
     */
    private double Multiply(double num1, double num2) {
        return num1*num2;
    }

    /**
     * Division
     * @param num1
     * @param num2
     * @return Quotient of num1 & num2
     */
    private double Divide(double num1, double num2) {
        return num1/num2;
    }

    /**
     * Exponentiate
     * @param num1
     * @param num2
     * @return Num1 to the power of num2
     */
    private double Exponent(double num1, double num2) {
        return Math.pow(num1, num2);
    }

 }
