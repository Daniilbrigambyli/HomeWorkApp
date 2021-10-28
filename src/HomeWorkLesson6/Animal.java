package HomeWorkLesson6;

public abstract class Animal {

    protected final int run;
    protected final int swim;

    private static int sum;

    public static int getSum() {
        return sum;
    }

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
        sum++;
    }

    abstract void limitedRun();
    abstract void limitedSwim();

}
