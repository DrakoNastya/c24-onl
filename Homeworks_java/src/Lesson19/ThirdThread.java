package Lesson19;

import java.util.Arrays;

public class ThirdThread extends Thread {
    private final int[] arr;
    public ThirdThread(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void run() {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}