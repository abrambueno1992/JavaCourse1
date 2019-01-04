// Types of errors
// java.lang.RunTimeException needs to be taken care of
// java.lang.Exception taken care of by Java

// Common exceptions
/*
    ArithmeticException
    ClassNotFoundException
    IllegalArgumentException
    IndexOutOfBoundsExceptions
    InputMismatchException
    IOException
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class JavaLesson6 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        divideByZero(2);
        System.out.println("How old are you?");
        int age = checkValidAge();
        if (age != 0) {
            System.out.println("You are " + age + " years old");
        }

        getAFile("./someStuff.txt");
        try {
            getAFileTwo("./someStuff.txt");

        } catch (IOException e)  {
            System.out.println("An IO Error Occurred");
        }

    }
    public static void getAFileTwo(String fileName) throws IOException, FileNotFoundException{
        FileInputStream file = new FileInputStream(fileName);
    }
    public static void getAFile(String fileName) {
        try {
            FileInputStream file = new FileInputStream(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("Sorry can't find that file");
        }
        catch(IOException e) {
            System.out.println("Unknown IO Error");
        }
//        catch (ClassNotFoundException e) {
//            System.out.println("No error");
//        }
        catch(Exception e) {
            System.out.println("Some error occured.");
        }
        finally {
            System.out.println("Always called");
        }
    }
    public static int checkValidAge() {
        try {
            return userInput.nextInt();
        } catch (InputMismatchException e) {
            userInput.next();
            System.out.println("That isn't a whole number");
            return 0;
        }
    }
    public static void divideByZero(int a) {
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println("you can't do that");
            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();
        }

    }
}
