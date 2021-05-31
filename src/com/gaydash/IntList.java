package com.gaydash;

import java.util.Arrays;

public class IntList {
    private int[] arr = new int[2];
    int s = arr.length;

    int index = 0;

    public void add(int value) {
        if (index == arr.length)
            resize(arr.length + 1);
        arr[index++] = value;
    }

    private void resize(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(arr, 0, newArray, 0, index);
        arr = newArray;
    }

    public int get(int index) {
        int o = arr[index];
        return o;
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}