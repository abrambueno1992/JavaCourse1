public class JavaLesson14 {
    public static void main(String[] args) {
        Animals genericAnimal = new Animals();

        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        Cats morris = new Cats("Moore", "Toon", "Rusty Moon");

        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);
    }
}
