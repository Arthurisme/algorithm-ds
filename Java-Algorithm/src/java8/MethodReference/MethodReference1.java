package java8.MethodReference;




import java.util.List;
        import java.util.ArrayList;

public class MethodReference1 {

    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach( a ->
                System.out.println(a)
        );

//        for ( Object name : names ) {
//            System.out.println(name);
//        }


//        names.forEach(System.out::println);

    }
}
