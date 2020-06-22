public class Car implements Vehicle, Drive {

    private String nama;
    private double velocity;
    private int time;
    private boolean engine;
    private double x, y, z;

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setVelocity(double velocity) {
        if (engine) {
            this.velocity = velocity;
        } else {
            System.out.println("Engine off");
        }
    }

    @Override
    public void startEngine() {
        engine = true;
        System.out.println("Engine sudah on");
    }

    @Override
    public void stopEngine() {
        engine = false;
        System.out.println("Engine off");
    }

    @Override
    public boolean engineStatus() {
        return engine;
    }

    @Override
    public void coordinate() {
        System.out.println("posisi x: " + x);
        System.out.println("posisi y: " + y);
        System.out.println("posisi z: " + z);

    }

    @Override
    public void accelerate(int time) {
        if (engineStatus()) {
            z += (velocity / time);
        } else {
            System.out.println("Engine mati");
        }
    }

    @Override
    public void brake() {
        x = 0;
        y = 0;
    }

    @Override
    public void turnLeft(int time) {
        if (engineStatus()) {
            x -= (velocity / time);
        } else {
            System.out.println("Engine mati");
        }
    }

    @Override
    public void turnRight(int time) {
        if (engineStatus()) {
            x += (velocity / time);
        } else {
            System.out.println("Engine mati");
        }
    }

    @Override
    public void backward(int time) {
        if (engineStatus()) {
            z -= (velocity / time);
        } else {
            System.out.println("Engine mati");
        }
    }

}
