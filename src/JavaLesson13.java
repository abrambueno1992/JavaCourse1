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
        System.out.println(letters.compareTo(moreLetters)); // if equal === 0
        System.out.println(letters.contains("abc"));
        System.out.println(letters.endsWith("de"));
        // startsWith, indexOf
        System.out.println(letters.indexOf("cd"));

        System.out.println("Length : " + letters.length());
        System.out.println(letters.replace("abc", "xy"));

        String[] letterArray = letters.split("");
        System.out.println(Arrays.toString(letterArray));

        char[] charArray = letters.toCharArray();
        System.out.println(Arrays.toString(charArray));

        System.out.println(letters.substring(1, 4));
    }
}
