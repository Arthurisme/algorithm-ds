package Lambda;

 public class LambdaTesterDescription3 {

     private   class Addition3 implements MathOperation {
         public int operation (int a, int b){
             return a + b;
         }

     }

     private   class Dog1 {

     }

     // inner class
     private class Inner_Demo {
         public void print() {
             System.out.println("This is an inner class");
         }
     }


     // Accessing he inner class from the method within
     void display_Inner() {
         Inner_Demo inner = new Inner_Demo();
         Addition3 addition3 = new Addition3();
         inner.print();
     }


     public static void main(String args[]) {

         LambdaTesterDescription3 tester = new LambdaTesterDescription3();

         tester.runMath();
     }


    public  void runMath() {
        LambdaTesterDescription3 tester = new LambdaTesterDescription3();

        //with type declaration
        //MathOperation addition = (int a, int b) -> a + b;

        Addition3 addition3 = new Addition3();
//
       // Dog1 dog1 = new Dog1();


       tester.display_Inner();




        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

//        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition3));


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

     int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}



