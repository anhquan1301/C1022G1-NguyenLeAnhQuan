public class Calculator {
    public static double calculate(double fisrtOperand, double secondOperand, char operator){
        switch (operator){
            case '+':
                return fisrtOperand + secondOperand;
            case '-':
                return fisrtOperand - secondOperand;
            case '*':
                return fisrtOperand * secondOperand;
            case '/':
                try{
                    return fisrtOperand / secondOperand;
                }catch (ArithmeticException e){
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
