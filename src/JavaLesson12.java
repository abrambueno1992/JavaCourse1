import java.util.Arrays;
import java.util.LinkedList;
public class JavaLesson12 {
    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>(); // restricted to String

        names.add("Ahmed Banana");
        names.add("Ali Said");

        names.addLast("Nathy Martian"); //last
        names.addFirst("Josh Smash"); // first

        names.add(0, "Noah Pete"); // 0 index

        names.set(2, "Paul Newname"); // replace value at index 2

        names.remove(4); // removes element at index 4
        names.remove("Noah Pete"); // removes name


        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("\nFirst Index: " + names.get(0));
        System.out.println("\nLast Index: " + names.getLast());

    }
}
