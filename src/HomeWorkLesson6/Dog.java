package HomeWorkLesson6;

public class Dog extends Animal {

    final static int maxRun = 600;
    final static int maxSwim = 100;

    private static int sum;

    public static int getSum() {
        return sum;
    }

    public Dog(int run, int swim) {
        super(run, swim);
        sum++;
    }

    @Override
    public void limitedRun() {
        if (run < maxRun) {
            System.out.println("Собака пробежала " + run + " метров.");
        } else System.out.println("Собака не может пробежать больше " + maxRun + " метров.");
    }

    @Override
    public void limitedSwim() {
        if (swim < maxSwim) {
            System.out.println("Собака проплыла " + swim + " метров.");
        } else System.out.println("Собака не может проплыть больше " + maxSwim + " метров.");
    }
}
