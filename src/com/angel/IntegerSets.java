package com.angel;

import com.angel.p4.IntegerSet;

public class IntegerSets {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set2.insertElement(21);
        set2.insertElement(45);
        set2.insertElement(16);
        set2.insertElement(34);

        System.out.println("set 1: " + set1.toSetString());
        System.out.println("set 2: " + set2.toSetString());

        set1.insertElement(66);
        set1.insertElement(55);
        set1.insertElement(18);
        set1.insertElement(100);
        set1.insertElement(101);
        set1.insertElement(45);

        System.out.println(set1.equalTo(set1) ? "Los sets son iguales" : "Los sets son diferentes");
        System.out.println("set 1: " + set1.toSetString());
        System.out.println("set 2: " + set2.toSetString());

        System.out.println(set1.equalTo(set2) ? "Los sets son iguales" : "Los sets son diferentes");
        System.out.println("set 1: " + set1.toSetString());
        System.out.println("set 2: " + set2.toSetString());

        IntegerSet union = IntegerSet.union(set1, set2);
        IntegerSet intersection = IntegerSet.interseccion(set1, set2);

        System.out.println("Union: " + union.toSetString());
        System.out.println("Interseccion: " + intersection.toSetString());
    }
}
