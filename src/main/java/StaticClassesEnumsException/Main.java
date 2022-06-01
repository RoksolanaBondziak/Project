package StaticClassesEnumsException;

import lesson4.ArrayExamples;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


        double res = Calculator.calculate(6, 3, Calculator.Type.DIVISION);
        System.out.println("result = " + res);
//        try {
            res = Calculator.calculate(22, 3, null);
            System.out.println("result = " + res);
//        }
//        catch(Exception err){
//            System.out.println("Something bad has happened");
//        }

        res = Calculator.calculate(244, 3, Calculator.Type.SUBTRACTION);
        System.out.println("result = " + res);

         res = Calculator.calculate(40, 5, Calculator.Type.DIVISION);
        System.out.println("result = " + res);

    }

}
