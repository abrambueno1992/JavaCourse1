import java.util.Scanner;

public class JavaLesson4 {

    static  Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i == 3) {
                i += 2;
                continue;
            }
            System.out.println(i);

            i++;

            if ((i % 2) == 0) {
                i++;
            }

            if (i > 10) {
                break;
            }
        }

        // different lesson
        double myPi = 4.0;
        double j = 3.0;
        // 4 - 4/3 + 4/5 - 4/7

        while (j < 11) {
            myPi = myPi - (4/j) + (4/(j + 2));
            j += 4;
            System.out.println(myPi);
        }
        System.out.println("Value of PI: " + Math.PI);


        String contYorN = "Y";
        int h = 1;
        while (contYorN.equalsIgnoreCase("y")) {
            System.out.println(h);
            System.out.print("Continue y or n? ");
            contYorN = userInput.nextLine();
            h++;
        }

        int k = 10;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);
    }
}
