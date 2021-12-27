package Lesson2Level2;

public class Exceptions {

    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "l", "1", "1"}
        };

        try {
            System.out.println(myArray(array));
        } catch (MyArraySizeException exception) {
            System.out.println("lenght array > 4");
        } catch (MyArrayDataException exception) {
            System.out.println("error sumbol");
        }


    }

    public static int myArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int col = 0; col < array.length; col++) {
            for (int row = 0; row < array[col].length; row++) {
                try {
                    sum = sum + Integer.parseInt(array[col][row]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(col, row);
                }
            }
        }
            return sum;
    }
}