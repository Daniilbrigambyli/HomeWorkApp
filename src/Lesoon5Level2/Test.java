package Lesoon5Level2;

public class Test {

    static final int SIZE = 10000000;
    static float[] array = new float[SIZE];

    public static void main(String[] args) {
        arrayStandart();
        long time = System.currentTimeMillis();
        arrayThreaded();
        System.out.println("Время пересчета значений массива с использованием многопоточности = " +
                (System.currentTimeMillis() - time) + " ms");
    }

    private static void arrayThreaded() {
        fullArray();
        float[] array1 = new float[array.length/2];
        float[] array2 = new float[array.length/2];

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(array, 0, array1, 0, array.length/2);
                for (int i = 0; i <= array1.length - 1; i++) {
                        array1[i] = (float)(array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    }
                }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(array, array.length/2, array2, 0, array.length/2);
                for (int i = 0; i <= array2.length - 1; i++) {
                    array2[i] = (float)(array2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        thread1.start();
        thread2.start();

        float[] arrayCenter = new float[SIZE];
        System.arraycopy(array1, 0, arrayCenter, 0, array1.length);
        System.arraycopy(array2, 0, arrayCenter, SIZE/2 , array2.length);
    }


    private static void fullArray() {
         for (int i = 0; i <= array.length - 1; i++) {
            array[i] = 1;
        }
    }

    private static void formulaArray() {
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private static void arrayStandart() {
        fullArray();
        long time = System.currentTimeMillis();
        formulaArray();
        System.out.println("Время пересчета значений массива без многопоточности = " +
                (System.currentTimeMillis() - time) + " ms");
    }
}
