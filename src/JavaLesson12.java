import java.util.Arrays;
import java.util.LinkedList;
public class JavaLesson12 {
    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>(); // restricted to String

        names.add("Ahmed Banana");
        names.add("Ali Said");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
