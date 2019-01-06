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
        System.out.println(letters.toUpperCase());
        System.out.println(letters.toLowerCase());

        String randString = "     abfgfhfj    ";
        System.out.println(randomString.trim());

        StringBuilder randSB = new StringBuilder("A random value");

        System.out.println(randSB.append(" again"));
        System.out.println(randSB);
        System.out.println(randSB.delete(15, 21));
        System.out.println(randSB.capacity());
        randSB.ensureCapacity(60);
        System.out.println(randSB.capacity());
        System.out.println(randSB.length());
        randSB.trimToSize();
        System.out.println(randSB.capacity());
    }
}
