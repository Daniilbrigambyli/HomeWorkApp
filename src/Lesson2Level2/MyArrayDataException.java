package Lesson2Level2;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(int col, int row) {
        System.out.println("look col: " + (col + 1) + " and row: " + (row + 1));
    }
}
