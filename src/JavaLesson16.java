public class JavaLesson16 {
    public static void main(String[] args) {
        Object superCar = new Vehicle();
        System.out.println(((Vehicle) superCar).getSpeed());
        Vehicle superTruck = new Vehicle();

        System.out.println(superCar.equals(superTruck));

        System.out.println(superCar.hashCode());
    }
}
