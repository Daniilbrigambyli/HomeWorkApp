import java.util.Arrays;

public class HomeWorkLessen3 {

    public static void main(String[] args) {

        int[] replacing = new int[]{1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1,};
        replacingNumbers(replacing);
        System.out.println();

        int[] numbers100 = new int[100];
        create100Numbers(numbers100);
        System.out.println();

        int[] multiplication = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationNumbers(multiplication);
        System.out.println();

        int[][] diagonal = new int[7][7];
        diagonalNumbers(diagonal);

        int[] array = lenInitialValue(5, 10);
        System.out.println(Arrays.toString(array));

        maxMinMeaning();
        System.out.println();

        int[] trueFalse = {1, 2, 3, 4, 5, 5};
        System.out.println(trueOrFalse(trueFalse));

    }

    public static void replacingNumbers(int[] replacing) {
        for (int i = 0; i < replacing.length; i++) {
            if (replacing[i] > 0) {
                replacing[i] = 0;
            } else replacing[i] = 1;
            System.out.print(replacing[i] + " ");
        }
    }

    public static void create100Numbers(int[] numbers100) {
        for (int i = 0; i < numbers100.length; i++) {
            numbers100[i] = i + 1;
            System.out.print(numbers100[i] + " ");
        }
    }

    public static void multiplicationNumbers(int[] multiplication) {
        for (int j : multiplication) {
            if (j < 6) {
                int a = j * 2;
                System.out.print(a + " ");
            }
        }
    }

    public static void diagonalNumbers(int[][] diagonal) {
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i == j || i + j == diagonal[i].length - 1) {
                    diagonal[i][j] = 1;
                }
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] lenInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void maxMinMeaning() {
        int[] maxMin = {1, 5, 3, 4, 5, 0, 7, 16};
        int max = maxMin[0];
        int min = maxMin[0];
        for (int i = 1;  i < maxMin.length; i++) {
            int k = maxMin[i];
            if (k > max) {
                max = k;
            } if (min > k) {
                min = k;
            }
        }
        System.out.print(max + " " + min);
    }

    public static boolean trueOrFalse(int[] trueFalse) {
        int sumLeft = 0;
        int sumRight = 0;
        int sum = 0;
        for (int k : trueFalse) {
            sum = sum + k;
        }
        for (int j : trueFalse) {
            if ((sumLeft = sumLeft + j) == (sumRight = sum - j)) {
                return true;
            }
        }
        return false;
    }
}

