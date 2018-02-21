package com.sahil;

public class InsertionSort {
    public int[] sort(int[] arr) {
        int length = arr.length;
        for(int i=0; i<length; i++) {
            int temp = i;
            while(temp > 0 && arr[temp] < arr[temp-1]) {
                int swap = arr[temp];
                arr[temp] = arr[temp-1];
                arr[temp-1] = swap;
                temp--;
            }
        }
        return arr;
    }
}
