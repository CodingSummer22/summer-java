package intro;

public class Car {
    protected int speed;
    private String plate;

    public Car(String plate) {
        speed = 0;
        this.plate = plate;
    }

    public void accelerate() {
        speed++;
    }

    public void decelerate() {
        speed--;
    }

    public void stop() {
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public String getPlate() {
        return plate;
    }

    public String toString() {
        return plate + " (speed: " + speed + ")";
    }

    public static void main(String[] args) {
        Taxi t = new Taxi("AAA9090");
        t.accelerate();
        System.out.println(t);
        t.printSpeed();

//        intro.Car [] cars = new intro.Car[3];
//        cars[0] = new intro.Car("ABX6734");
//        cars[1] = new intro.Car("ZBB6123");
//        cars[2] = new intro.Car("TAA9032");
//
//        for(int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//
//        for(intro.Car c : cars) {
//            System.out.println(c);
//        }

    }
}
