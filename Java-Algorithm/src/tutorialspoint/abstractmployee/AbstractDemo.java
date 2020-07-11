package tutorialspoint.abstractmployee;

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.List;

/* File name : AbstractDemo.java */
public class AbstractDemo {

    public static void main(String [] args) {
        /* 1 Following is not allowed and would raise error */
//        Employee e = new Employee("George W.", "Houston, TX", 43);


        // This is ok:
        List<Employee> list = new ArrayList<>();

        /* 2 Following is  allowed and would raise error */
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();




        // Test both:
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}