package com.gaydash;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.toString();
        System.out.println(list); // [10, 123, 30]

        list.set(1, 123);

        int a = list.get(1);
        System.out.println(a);
        System.out.println(list.size());
    }
}