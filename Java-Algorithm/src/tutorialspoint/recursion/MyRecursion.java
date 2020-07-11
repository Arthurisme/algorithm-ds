package tutorialspoint.recursion;

public class MyRecursion {
    public static void main(String[] args) {
        int result = sum(2);
        System.out.println(result);
    }
    public static int sum(int k) {
        System.out.println("K"+ k);

        if (k > 0) {
            System.out.println("K2"+ k);

            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
