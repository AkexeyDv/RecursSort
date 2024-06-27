package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayListShort arrayListShort = new ArrayListShort();
        //arrayListShort.add(6);
        //arrayListShort.add(4);
        arrayListShort.add(5);
        arrayListShort.add(1);
        arrayListShort.add(3);
        arrayListShort.add(2);
        arrayListShort.add(8);
        arrayListShort.add(2);
        arrayListShort.add(-2);
        arrayListShort.add(14);
        //arrayListShort.add(3);
        //arrayListShort.add(2);
        arrayListShort.sort();
        System.out.println(arrayListShort.toString());
        //arrayListShort.sort();
        //System.out.println(arrayListShort.toString());

    }

}