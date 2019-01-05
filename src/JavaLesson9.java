import java.util.Arrays;
public class JavaLesson9 {
    public static void main(String[] args) {
        int[] randomArray;
        int[] numberArray = new int[10];
        randomArray = new int[20];
        randomArray[1] = 2;

        String[] stringArray = {"just", "random", "words"};

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        int k = 1;
        while (k <= 41) {
            System.out.println('-');
            k++;
        }
        System.out.println();

        for (int j = 0; j < numberArray.length; j++) {
            System.out.print("| " + j + " ");
        }
        System.out.println("|");
    }
}
