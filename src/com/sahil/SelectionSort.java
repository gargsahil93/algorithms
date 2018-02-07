package com.sahil;

public class SelectionSort {
    public int[] sort(int[] arr) {
        int length = arr.length;
        for (int i =0; i < length-1; i++) {
            int temp = i;
            for (int j = i+1;j< length; j++) {
                if(arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            int swapTemp = arr[temp];
            arr[temp] = arr[i];
            arr[i] = swapTemp;
        }
        return arr;
    }
}
