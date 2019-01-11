import java.nio.file.LinkOption;
import java.util.regex.*;
public class JavaLesson19 {
    public static void main(String[] args) {

        String longString = " Aaab Band CA AK 13577 AA (555)555-555 checking";
        String strangeString = " 1Z bbb *** *** {{{ {{ { ";

        /*
        [A-Z], [0-9]
        \\s white space
        \\S no white space
        {n, m}
         */
        // Word that is 2 to 20 characters in length
        //[A-Za-z]{2,20} or \\w{2,20}
        regexChecker("\\s[A-Za-z]{2,20}\\s", longString);

        // \\d digits, \\D not digits, {5} 5 elements
        // zip codes
        regexChecker("\\s\\d{5}\\s", longString);

        // starts with C or A
        // A[KLRZ] | C[AOT]
        regexChecker("A[KLRZ]|C[AOT]", longString);

        // {n,} to find the minimum, + one or more, .^*+?{}[]\|() characters that always need backlash
        regexChecker("(\\{{1,})", strangeString);
        // . find anything not a space
        regexChecker(".{3}", strangeString);

    }

    public static void regexChecker(String theRegex, String str2Check) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(str2Check);

        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                System.out.println(regexMatcher.group().trim());
            }
            System.out.println("Start index: " + regexMatcher.start());
            System.out.println("End Index: " + regexMatcher.end());
        }
    }
}
