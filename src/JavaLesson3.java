public class JavaLesson3 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 50);
        /* Relational Operators:
        6 in total
        > Greater than
        < Less than
        == Equal to
        != Not Equal to
        >= Greater than or Equal to
        <= Less than or equal to

        * */

        if (randomNumber < 25) {
            System.out.println("The random number is less than 25");
        } else if (randomNumber > 40) {
            System.out.println("The random number is greater than " + randomNumber);

        } else if (randomNumber == 18) {
            System.out.println("The random number is equal to 18");
        } else if (randomNumber != 40) {
            System.out.println("The random number is not equal to 40");
        } else {
            System.out.println("Didn't match conditions " + randomNumber);
        }


        /* Logical Operators:
        6 logical operators
        ! converts boolean into opposite (true is now false)
        & checks to see if values on the left and right are equal, a boolean is returned
        && checks to see if values on the left and right are equal and with data type, a boolean is returned
        | returns true if either value on the left or right is true, else returns false
        || returns true if either value on the left or right is true, else returns false
        ^ returns true if there is 1 true and 1 false boolean value
        */
    }
}
