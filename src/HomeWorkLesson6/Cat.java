package HomeWorkLesson6;

public class Cat extends Animal {

    final static int maxRun = 300;

    private static int sum;

    public static int getSum() {
        return sum;
    }

    public Cat(int run, int swim) {
        super(run, swim);
        sum++;
    }

    @Override
    public void limitedRun() {
        if (run < maxRun) {
            System.out.println("Кот пробежал " + run + " метров.");
        } else System.out.println("Кот не может пробежать больше " + maxRun + " метров.");
    }

    @Override
    public void limitedSwim() {
            System.out.println("Коты не умеют плавать!");
    }
}
