package java8.MethodReference;




import java.util.List;
        import java.util.ArrayList;
import java.util.function.Consumer;

public class MethodReference1 {

    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        // type 1:
//        names.forEach( a ->
//                System.out.println(a)
//        );

        // type 2:
//        for ( Object name : names ) {
//            System.out.println(name);
//        }


        // type 3:
//        names.forEach(System.out::println);

        //Type 4:
        names.forEach(new Consumer<String>() {       // anonymous class
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

    }
}
