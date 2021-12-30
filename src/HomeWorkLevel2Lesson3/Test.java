package HomeWorkLevel2Lesson3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    private static final String[] array = new String[] {
            "cat",
            "dog",
            "robot",
            "robot",
            "orange",
            "red",
            "red",
            "black",
            "java",
            "car",
            "car",
            "exit"
    };


    public static void main(String[] args) {
        arr();
        phoneBook();
    }

    private static void phoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "1234");
        phoneBook.add("Иванов", "1234");
        phoneBook.add("Иванов", "1222");
        phoneBook.add("Кузьма", "9874");
        phoneBook.add("Сидоров", "4567");

        System.out.println("номер Иванова " + phoneBook.get("Иванов"));
        System.out.println("номер Кузьмы " + phoneBook.get("Кузьма"));
        System.out.println("номер Сидорова " + phoneBook.get("Сидоров"));
    }

    private static void arr() {
        Map<String, Integer> uniqueWord = new LinkedHashMap<>();
        for (String word : array) {
            Integer unique = uniqueWord.get(word);
            if (unique == null) {
                unique = 0;
            }
            uniqueWord.put(word, unique + 1);
        }
        for(Map.Entry<String, Integer> entry : uniqueWord.entrySet()) {
            System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз");
        }
    }
}
