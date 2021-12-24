package HomeWorkLesson1Level2;

public class Wall implements Jump{

    @Override
    public void jump(int jump) {

        if (jump >= 2) {
            System.out.println("obstacle passed");
        }
        else {
            System.out.println("obstacle is not passed");
        }

    }
}
