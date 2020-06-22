public class Main {

    public static void main(String[] args) {
        Helicopter h = new Helicopter();
        System.out.println(h);
        h.stopEngine();
        h.startEngine();
        h.setVelocity(20);
        h.up(10);
        h.altitude();
        h.down(5);
        h.altitude();
        h.turnLeft(5);
        h.turnRight(10);
        h.coordinate();
        h.stopEngine();
        h.down(5);
        h.altitude();
        h.stopEngine();

        Car m = new Car();
        System.out.println(m);
        m.startEngine();
        m.setVelocity(10);
        m.accelerate(100);
        m.turnRight(5);
        m.turnLeft(1);
        m.brake();
        m.turnRight(6);
        m.backward(5);
        m.coordinate();
        m.stopEngine();

    }

}
