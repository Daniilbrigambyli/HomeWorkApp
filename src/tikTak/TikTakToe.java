package tikTak;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TikTakToe {

    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = '•';
    private static final int SIZE = 5;

    private static char[][] map;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        map = new char[SIZE][SIZE];

        printMap();
        outMap();
        endGame();

    }

    private static void printMap() {
        for (int row = 0; row < map.length; row++) {
            Arrays.fill(map[row], DOT_EMPTY);
        }
    }

    private static void outMap() {
        outMapHeader();
        outMapBody();
        System.out.println();
    }

    private static void outMapHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void outMapBody() {
        for (int row = 0; row < map.length; row++) {
            System.out.print((row + 1) + " "); // Столбцы
            for (int col = 0; col < map[row].length; col++) {
                System.out.print(map[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void personMotion() {

        checkNumbers();

    }

    private static void checkNumbers() {
        while (true) {
            System.out.println("Ваш ход, выберете строку:");
            int row = checkSymbol();
            System.out.println("Выберете столбец:");
            int col = checkSymbol();
            if (!(row >= 1 && row <= SIZE && col >= 1 && col <= SIZE)) {
                System.out.println("Координаты должны быть в диапазоне от 1 до " + SIZE + "!");
            } else if (!(isEmpty(row - 1, col - 1))) {
                System.out.println("Клетка занята!");
            } else {
                map[row - 1][col - 1] = DOT_X; // Присвоение пустой клетке хода игрока
                break;
            }
        }
    }

    private static int checkSymbol() {
        while (!scanner.hasNextInt()) {
            System.out.println("Значение должно быть целочисленным числом!");
            scanner.next();
        }
        return scanner.nextInt();

    }

    private static boolean isEmpty(int row, int col) {
        return map[row][col] == DOT_EMPTY;
    }

    private static void bot() {
        int row, col;
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        }
        while (!(isEmpty(row, col)));
        map[row][col] = DOT_0;
    }

    private static void endGame() {
        while (true) {
            personMotion();
            outMap();

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            if (isWin(DOT_X)) {
                System.out.println("Вы выиграли!");
                break;
            }

            bot();
            outMap();

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            if (isWin(DOT_0)) {
                System.out.println("Победил компьютер!");
                break;
            }
        }
    }

    private static boolean isMapFull() {
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map.length; col++) {
                if (map[row][col] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isWin(char symbol) {
        if (SIZE == 3) {
            for (int row = 0; row < SIZE; row++) {
                int aRow = 0;
                int aCol = 0;
                for (int col = 0; col < SIZE; col++) {
                    aRow = (map[row][col] == symbol) ? aRow + 1 : 0;
                    aCol = (map[col][row] == symbol) ? aCol + 1 : 0;
                    if (aRow == SIZE || aCol == SIZE) {
                        return true;
                    }
                }
            }
            int diagonalLeft = 0;
            int diagonalRight = 0;
            for (int i = 0; i < SIZE; i++) {
                diagonalLeft = (map[i][i] == symbol) ? diagonalLeft + 1 : 0;
                diagonalRight = (map[i][SIZE - 1 - i] == symbol) ? diagonalRight + 1 : 0;
                if (diagonalRight == SIZE || diagonalLeft == SIZE) {
                    return true;
                }
            }
        } if (SIZE == 5) {
            for (int row = 0; row < SIZE; row++) {
                int aRow = 0;
                int aCol = 0;
                for (int col = 0; col < SIZE; col++) {
                    aRow = (map[row][col] == symbol) ? aRow + 1 : 0;
                    aCol = (map[col][row] == symbol) ? aCol + 1 : 0;
                    if (aRow == SIZE - 1 || aCol == SIZE - 1) {
                        return true;
                    }
                }
            }
            int diagonalLeft = 0;
            int diagonalRight = 0;
            for (int i = 0; i < SIZE; i++) {
                diagonalLeft = (map[i][i] == symbol) ? diagonalLeft + 1 : 0;
                diagonalRight = (map[i][SIZE - 1 - i] == symbol) ? diagonalRight + 1 : 0;
                if (diagonalRight == SIZE - 1 || diagonalLeft == SIZE - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

