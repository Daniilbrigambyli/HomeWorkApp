package Employees;

public class Employees {

    private String name;
    private String sureName;
    private String patronymic;
    private String post;
    private String email;
    private String numberPhone;
    private String salary;
    private int age;

    public Employees(String name, String sureName, String patronymic, String post,String email, String numberPhone,
                     String salary, int age) {
        this.name = name;
        this.sureName = sureName;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public void infoEmployses() {
        System.out.println("ФИО: " + name + " " + sureName + " " + patronymic + ".\n" +
                "Занимаемая должность: " + post + ".\n" + "Email: " + email + ".\n" + "Номер телефона: " + numberPhone +
                ".\n" + "Зарплата: " + salary + ".\n" + "Возвраст: " + age + "." + "\n");
    }

    public int getAge() {
        return age;
    }
}
