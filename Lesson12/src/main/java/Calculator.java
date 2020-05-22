public class Calculator {

    public static int summ(int firstNumber, int secondNumber) {return firstNumber + secondNumber; }

    public static int subtract(int firstNumber, int secondNumber) {return  firstNumber - secondNumber; }

    public static int multiply(int firstNumber, int secondNumber) {return  firstNumber * secondNumber; }

    public static double divide(int firstNumber, int secondNumber) {
        try{
            return firstNumber / secondNumber;
        } catch (ArithmeticException e){
            return 0.0;
        }
    }
}