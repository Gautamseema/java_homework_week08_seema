package java_programme_week08;

/**
 * Write a class with the name SimpleCalculator.
 * The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods): Method named getFirst Number any parameters,
 * it need to return  the value of the firstNumber field.
 * Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field. Method named setFirstNumber with one parameter of type double,
 * it needs to set the value of the firstNumber field. Method named setSecondNumber
 * with one parameter of type double, it needs to set the value of the firstNumber field
 * Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 *
 */

public class Programme_18_SimpleCalculator {
    double firstNumber;
    double secondNumber;

    // instance Method to get first number
    public double getFirstNumber() {
        return firstNumber;
    }

    // instance method to get second number
    public double getSecondNumber() {
        return secondNumber;
    }

    // set the value of the firstNumber
    public void setFirstNumber(double value) {
        this.firstNumber = value;
    }

    // set the value of the secondNumber
    public void setSecondNumber(double value) {
        this.secondNumber = value;

    }
    // method to get addition
    public double getAdditionResult(){
        return firstNumber + secondNumber ;
    }
    // method to get substraction
    public double getSubtractionResult(){
        return firstNumber - secondNumber ;
    }
    // method to get multipication
    public double getMultiplicationResult(){
        return firstNumber * secondNumber ;
    }
    // method to get division
      public double getDivisionResult(){
        return firstNumber / secondNumber ;
      }
      // main method
      public static void main(String[] args) {
          Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();
          calculator .setFirstNumber(5.0) ;
          calculator .setSecondNumber(4) ;

          System.out.println("add =" + calculator.getAdditionResult() );
          System.out.println("subtract =" + calculator.getSubtractionResult() );
          calculator .setFirstNumber(5.25) ;
          calculator .setSecondNumber(0) ;
          System.out.println("multiple = " + calculator .getMultiplicationResult() );
          System.out.println("divide = " + calculator .getDivisionResult() );
      }
}