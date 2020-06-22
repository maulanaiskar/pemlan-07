public class Helicopter implements Vehicle, Fly {

    private String nama;
    private double velocity;
    private int distance;
    private boolean engine;
    private double x, y, z;

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public void startEngine() {
        engine = true;
        System.out.println("Mesin nyala");
    }

    @Override
    public void stopEngine() {
        if (y == 0) {
            engine = false;
            System.out.println("mesin mati");
        } else {
            System.out.println("Helikopter masih terbang");
        }

    }

    @Override
    public boolean engineStatus() {
        return engine;
    }

    @Override
    public void coordinate() {
        System.out.println("Posisi x: " + x);
        System.out.println("Posisi y: " + y);
        System.out.println("Posisi z: " + z);
    }

    @Override
    public void up(int time) {
        if (engineStatus()) {
            distance = (int) (velocity * time);
            y += distance;
        } else {
            System.out.println("Mesin off");
        }

    }

    @Override
    public void down(int time) {
        if (engineStatus()) {
            distance = (int) (velocity * time);
            y -= distance;
        } else {
            System.out.println("Mesin off");
        }
    }

    @Override
    public void forward(int time) {
        if (engineStatus()) {
            z += (velocity * time);
        } else {
            System.out.println("Mesin off");
        }
    }

    @Override
    public void turnLeft(int time) {
        if (engineStatus()) {
            x -= (velocity * time);
        } else {
            System.out.println("Mesin off");
        }
    }

    @Override
    public void turnRight(int time) {
        if (engineStatus()) {
            x += (velocity * time);
        } else {
            System.out.println("Mesin off");
        }
    }

    @Override
    public void brake() {
        velocity = 0;
    }

    @Override
    public int altitude() {
        System.out.println("Altitude " + y + " feet");
        return distance;
    }

}
