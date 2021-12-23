package HomeWorkLesson1Level2;

public class Test {
    public static void main(String[] args) {

        People people = new People();
        Treadmill peopleRun = new Treadmill();
        Wall peopleJump = new Wall();
        people.run();
        peopleRun.run(100);
        people.jump();
        peopleJump.jump(2);

        System.out.println("--------");

        Cat cat = new Cat();
        Treadmill catRun = new Treadmill();
        Wall catJump = new Wall();
        cat.run();
        catRun.run(150);
        cat.jump();
        catJump.jump(4);

        System.out.println("--------");

        Robot robot = new Robot();
        Treadmill robotRun = new Treadmill();
        Wall robotJump = new Wall();
        robot.run();
        robotRun.run(25);
        robot.jump();
        robotJump.jump(1);

        System.out.println("--------");




    }

}
