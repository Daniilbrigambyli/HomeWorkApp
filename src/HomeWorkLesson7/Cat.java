package HomeWorkLesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean isHunger;

    public Cat(String name, int appetite, boolean isHunger) {
        this.name = name;
        this.appetite = appetite;
        this.isHunger = isHunger;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public boolean hunger() {
        if (!this.isHunger) {
            return true;
        } else {
            System.out.println("Кот не голоден.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Имя = '" + name + '\'' +
                ", аппетит = " + appetite +
                ", сытость = " + hunger() +
                '}';
    }

    public void eat(Plate plate, Cat cat) {
        if (hunger() == true) {
            while (true) {
                if (plate.getFood() >= getAppetite()) {
                    System.out.println(getName() + " поел.");
                    plate.resetFood(appetite);
                    break;
                } else {
                    plate.setFood(plate.getFood(), cat);
                }
            }
        }
    }
}