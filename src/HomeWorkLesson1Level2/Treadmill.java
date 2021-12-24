package HomeWorkLesson1Level2;

public class Treadmill implements Run{

    @Override
    public void run(int run) {

        if (run >= 100) {
            System.out.println("obstacle passed");
        }
        else {
            System.out.println("obstacle is not passed");
        }
    }
}
