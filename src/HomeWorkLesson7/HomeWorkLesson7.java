package HomeWorkLesson7;

import java.util.Arrays;

public class HomeWorkLesson7 {

    public static void main(String[] args) {

        Cat[] cat = {
                new Cat("Барсик", 20, false),
                new Cat("Персик", 15, false),
                new Cat("Черныш", 40, false)
        };

        Plate plate = new Plate(10);

        plate.info();
        for (Cat cats : cat) {
            cats.eat(plate, cats);
            plate.info();
            System.out.println(String.valueOf(cats));

        }


    }
}
