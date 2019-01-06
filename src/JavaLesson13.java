import java.util.Arrays;
public class JavaLesson13 {
    public static void main(String[] args) {
        String randomString = "I'm just a randomstring";

        String goToQuote = "He said, \"I'm here\""; //escape keys
        /*
        \n
        \b
        */
        int numTwo = 2;

        System.out.println(randomString + " " + goToQuote + numTwo); //concatenate

        String upperCaseStr = "BIG";
        String lowerCaseStr = "big";

        if (upperCaseStr.equals(lowerCaseStr)) { // false
            System.out.println("They're equal");
        }
        if (upperCaseStr.equalsIgnoreCase(lowerCaseStr)) { // true
            System.out.println("They're equal");
        }

        String letters = "abcde";
        String moreLetters = "fghijk";

        System.out.println("2nd char: " + letters.charAt(1));
    }
}
