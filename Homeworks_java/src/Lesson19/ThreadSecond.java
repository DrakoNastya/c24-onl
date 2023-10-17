package Lesson19;

import java.util.Arrays;

//сортировка выбором
public class ThreadSecond extends Thread {
    private final int[] arr;

    public ThreadSecond(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void run() {

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    int current = arr[j];
                    min = arr[j];
                    minId = j;
                }
            }
            int num = arr[i];
            arr[i] = min;
            arr[minId] = num;
        }
        System.out.println(Arrays.toString(arr));
    }
}



