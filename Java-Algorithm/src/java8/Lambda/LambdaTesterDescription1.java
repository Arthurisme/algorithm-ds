package java8.Lambda;

public class LambdaTesterDescription1 {

    public static void main(String args[]) {
        LambdaTesterDescription1 tester = new LambdaTesterDescription1();

        //with type declaration
        //MathOperation addition = (int a, int b) -> a + b;

        Addition addition1 = new Addition();


        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

//        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition1));


        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    interface MathOperation {
        int operation(int a, int b);
    }




    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}


 class Addition implements LambdaTesterDescription1.MathOperation {
    public int operation (int a, int b){
        return a + b;
    }

}
