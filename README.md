# pemlan-07
Praktikum Pemrograman Lanjut Bab 7. Interface

Terdapat sebuah kendaraan yang berada pada sebuah bangun geometri pada sumbu x, y, dan z yang dimulai dari 0,0,0

1. Buatlah sebuah interface vehicle yang memiliki beberapa method abstract diantaranya
String getName();//mengembalikan nama kendaraan
void setVelocity(double velocity);//menyimpan kecepatan kendaraan ketika sudah on
void startEngine();//mengganti engine status menjadi on
void stopEngine();// mengganti engine status menjadi off
boolean engineStatus();//mengembalikan engine status
void coordinate(); //menampilkan posisi x,y,z

2. Buatlah juga sebuah interface Drive yang berisikan
void accelerate(int time); //menambahkan posisi sebanyak distance pada sumbu z
void brake(); //mengembalikan posisi menjadi nol
void turnLeft(int time); // mengurangi posisi sebanyak distance pada sumbu x
void turnRight(int time); //menambahkan posisi sebanyak distance pada sumbu x
void backward(int time); //mundur sebanyak distance pada sumbu z

3. Buatlah juga sebuah interface Fly yang berisikan
void up(int time); // menambahkan posisi sebanyak distance
void down(int time); //mengurangi posisi y(maksimal 0, tidak bisa negatif)
void forward(int time); //menambahkan posisi z sebanyak distance
void turnLeft(int time); //mengurangi posisi sebanyak distance pada sumbu x
void turnRight(int time); //menambahkan posisii sebanyak distance pada sumbu x
void brake(); // mengembalikan velocity menjadi 0
int attitude(); //mengembalikan ketinggian kendaraan(posisi y)

4. Buatlah kelas Car yang implement Vehicle dan Drive dengan ketentuan perintah accelerate hanya dapat dijalankan jika engine sudah on,

5. Buatlah kelas Helicopter yang implements Vehicle dan Fly dengan ketentuan semua perintah Fly hanya dapat dijalankan jika engine sudah on dan stopEngine() hanya dapat dijalankan jika posisi y=0;

Catatan:
1. Velocity = Distance/Time
2. Distance = Velocity*Time
