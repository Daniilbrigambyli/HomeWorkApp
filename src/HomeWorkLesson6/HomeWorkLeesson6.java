package HomeWorkLesson6;

public class HomeWorkLeesson6 {

    public static void main(String[] args) {


        Dog dog = new Dog(20,50);
        Cat cat = new Cat(100, 10);
        dog.limitedRun();
        dog.limitedSwim();
        cat.limitedRun();
        cat.limitedSwim();

        System.out.println("Всего животных: " + Animal.getSum() + ".\n"
        + "Котов: " + Cat.getSum() + ".\n" + "Собак: " + Dog.getSum() + ".");
    }
}
