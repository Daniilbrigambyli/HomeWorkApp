package HomeWorkLesson7;

import java.util.Scanner;

public class Plate {

    private int food;

    Scanner scanner = new Scanner(System.in);

    public Plate(int food) {
        this.food = food;
    }

    public void resetFood(int foodCount) {
        this.food = food - foodCount;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food, Cat cat) {
        System.out.println(cat.getName() + "у нужно " + cat.getAppetite() + " еды. Добавьте её.");
        info();
        System.out.println("Сколько еды хотите добавить?");
        this.food = food + scanner.nextInt();
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды.");
    }
}
