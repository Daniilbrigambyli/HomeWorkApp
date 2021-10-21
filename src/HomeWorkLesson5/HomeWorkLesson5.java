package HomeWorkLesson5;

import Employees.Employees;

import java.util.Random;

public class HomeWorkLesson5 {

    private static Random random = new Random();
    private static Employees[] array = new Employees[5];

    public static void main(String[] args) {

        Employees people = new Employees("Василий", "Мицкевич", "Андреевич",
                "Заместитель директора", "vasily@mail.ru", "+375-(29)-313-13-31",
                "500$", 35);
        people.infoEmployses();
        emloyeesArray();

    }

    public static void emloyeesArray() {

        array[0] = new Employees("Генадий", "Рышкевич", "Васильевич",
                "Разнорабочий", "genady@mail.ru", "+375-(29)-111-11-11",
                "350$", (random.nextInt(19) + 40));
        array[1] = new Employees("Олег", "Пышкевич", "Андреевич",
                "Водитель", "oleg@mail.ru", "+375-(29)-111-21-21",
                "500$", (random.nextInt(19) + 40));
        array[2] = new Employees("Анна", "Тышкевич", "Олеговна",
                "Продавец", "anna@mail.ru", "+375-(29)-111-31-21",
                "700$", (random.nextInt(19) + 40));
        array[3] = new Employees("Василий", "Нышкевич", "Генадьевич",
                "Водитель", "vasily@mail.ru", "+375-(29)-111-41-81",
                "800$", (random.nextInt(19) + 40));
        array[4] = new Employees("Николай", "Сышкевич", "Николаевич",
                "Электрик", "nikolay@mail.ru", "+375-(29)-111-51-51",
                "400$", (random.nextInt(19) + 40));

        ageSensitiveInformation();
    }

    public static void ageSensitiveInformation() {

        for (int i = 0; i < array.length; i++) {
            Employees employees = array[i];
            if (employees.getAge() > 40) {
                employees.infoEmployses();
            }
        }
    }
}
