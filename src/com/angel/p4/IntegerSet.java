package com.angel.p4;

public class IntegerSet {
    private boolean[] setEnteros;

    //constructor
    public IntegerSet() {
        setEnteros = new boolean[101];
    }

    //funcion para insertar un valor
    public void insertElement(int value) {
        if(value >= 0 && value <= 100) {
            setEnteros[value] = true;
        }
    }

    //funcion para remover un valor
    public void deletElement(int value) {
        if(value >= 0 && value <= 100) {
            if(setEnteros[value]) {
                setEnteros[value] = false;
            }
        }
    }

    //funcion para combinar dos los valores de dos sets
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.setEnteros.length; i++) {
            result.setEnteros[i] = set1.setEnteros[i] || set2.setEnteros[i];
        }
        return result;
    }

    //funcion para mostrar los valores que se intersectan dos los valores de dos sets
    public static IntegerSet interseccion(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.setEnteros.length; i++) {
            result.setEnteros[i] = set1.setEnteros[i] && set2.setEnteros[i];
        }
        return result;
    }

    //metodo para verificar igualdad
    public boolean equalTo(IntegerSet set) {
        for (int i = 0; i < this.setEnteros.length; i++) {
            if(this.setEnteros[i] != set.setEnteros[i]) {
                return false;
            }
        }
        return true;
    }

    //metodo para representar set como string
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
