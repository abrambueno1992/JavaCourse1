import java.util.Scanner;
public class JavaLesson5 {
    static double myPI = 3.14159; // class variable

    public static void main(String[] args) {
        System.out.println(addThem(1,2));
//        System.out.println("Global " + myPI);
    }
    public static int addThem(int a, int b) {
//        double smallPI = 3.140; // local variable
//        System.out.println("Global " + myPI);
//
//        myPI = myPI + 3.0;
        int c = a + b;
        return c;
//        System.out.println("Local " + myPI);
//        return 1;
    }
}
