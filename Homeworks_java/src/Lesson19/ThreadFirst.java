package Lesson19;

import java.util.Arrays;

public class ThreadFirst extends Thread {
    //сортировка вставками
    private final int[] arr;

    public ThreadFirst(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int current = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = current;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
