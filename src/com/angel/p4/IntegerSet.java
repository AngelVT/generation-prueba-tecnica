package com.angel.p4;

public class IntegerSet {
    private boolean[] setEnteros;

    public IntegerSet() {
        setEnteros = new boolean[101];
    }

    public void insertElement(int value) {
        if(value >= 0 && value <= 100) {
            setEnteros[value] = true;
        }
    }

    public void deletElement(int value) {
        if(value >= 0 && value <= 100) {
            if(setEnteros[value]) {
                setEnteros[value] = false;
            }
        }
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.setEnteros.length; i++) {
            result.setEnteros[i] = set1.setEnteros[i] || set2.setEnteros[i];
        }
        return result;
    }

    public static IntegerSet interseccion(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.setEnteros.length; i++) {
            result.setEnteros[i] = set1.setEnteros[i] && set2.setEnteros[i];
        }
        return result;
    }

    public boolean equalTo(IntegerSet set) {
        for (int i = 0; i < this.setEnteros.length; i++) {
            if(this.setEnteros[i] != set.setEnteros[i]) {
                return false;
            }
        }
        return true;
    }

    public String toSetString() {
        boolean isEmpty = true;
        String result = "";

        for (int i = 0; i < this.setEnteros.length; i++) {
            if (this.setEnteros[i]) {
                result += i + " ";
                isEmpty = false;
            }
        }

        if(isEmpty) {
            result = "-";
        }

        return result;
    }
}
