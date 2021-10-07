package company;

public class HomeWorkAppLessen2 {
    public HomeWorkAppLessen2() {
    }

    public static void main(String[] args) {
        System.out.println(comparison(6, 5));
        integer(-1);
        System.out.println(compareTheNumbers(-1));
        rowToColumn("System.out.println", 5);
    }

    public static boolean comparison(int a, int b) {
        boolean isComparison = a + b >= 10 && a + b <= 20;
        return isComparison;
    }

    public static void integer(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean compareTheNumbers(int a) {
        boolean isCompareTheNumbers = a >= 0;
        return isCompareTheNumbers;
    }

    public static void rowToColumn(String column, int a) {
        for(int i = 1; i <= a; ++i) {
            System.out.println(column);
        }

    }
}

