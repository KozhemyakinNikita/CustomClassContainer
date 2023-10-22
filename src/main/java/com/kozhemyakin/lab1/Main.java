package com.kozhemyakin.lab1;

public class Main {
    public static void main(String[] args) {
        CustomClassContainer<Integer> container = new CustomClassContainer<>();

        container.add(1);
        container.add(3);
        container.add(4);

        System.out.println("Size of container: " + container.size());

        System.out.println("Element at index 1: " + container.get(1));

        container.remove(0);

        System.out.println("Size of container after removal: " + container.size());

        System.out.print("Container: ");
        container.print();
    }
}