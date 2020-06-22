public interface Fly {

    void up(int time);

    void down(int time);

    void forward(int time);

    void turnLeft(int time);

    void turnRight(int time);

    void brake();

    int altitude();

}
