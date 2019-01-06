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

        LinkedList<String> nameCopy = new LinkedList<String>(names);
        System.out.println("\nnameCopy: " + nameCopy);

        if (names.contains("Noah Pete")){
            System.out.println("\nNoah is here");
        }

        if (names.containsAll(nameCopy)) {
            System.out.println("\nCollections are the same");
        }

        System.out.println("\nAli index at: " + names.indexOf("Ali Said"));

        System.out.println("\nList Empty: " + names.isEmpty());
        System.out.println("\nHow Many: " + names.size());
        System.out.println("\nLook without Error: " + names.peek());

        System.out.println("\nremove first element: " + nameCopy.poll());
        System.out.println("\nremove last element: " + nameCopy.pollLast());

        nameCopy.push("Noah Peee");
        nameCopy.pop();
        for (String name : nameCopy) {
            System.out.println(name);
        }



    }
}
