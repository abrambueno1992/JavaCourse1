public class JavaLesson4 {
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
    }
}
