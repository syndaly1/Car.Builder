public class Main {
    public static void main(String[] args) {
        Car car= new Car.Builder()
                .setColor("black")
                .setWheels(4)
                .setEngine("electric")
                .setLeatherSeats(true)
                .setStyle("sport")
                .build();

        System.out.println(car);
    }
}
