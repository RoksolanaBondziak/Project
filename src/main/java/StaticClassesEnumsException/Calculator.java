package StaticClassesEnumsException;

//import org.apache.logging.log4j.Logger;
import static StaticClassesEnumsException.Calculator.Type.MULTIPLICATION;

public class Calculator {
//
//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

//    enum final constants


    public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    public static double calculate(double a, double b, Type type) {

        double result = 0;
        try {
            switch (type) {

                case MULTIPLICATION:
                    result = a * b;
                    break;
                case SUMMARY:
                    result = a + b;
                    break;
                case DIVISION:
                    result = a / b;
                    break;
                case SUBTRACTION:
                    result = a - b;
                    break;

                default:
                    result = result - 1;
            }
        } catch (Exception exception) {
            System.out.println("Something bad has happened");
            throw exception;
        }
//        finally {
//            System.out.println("Finally block");
////            result = -1;
//        }


        return result;
    }
}
