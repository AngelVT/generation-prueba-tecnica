package com.angel.p1;

public class Propietario {
    private String nombre;
    private String fechaDeNacimiento;
    private Direccion direccion;
    

    public Propietario(String nombre, String fechaDeNacimiento, Direccion direccion) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }


    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }


    public Direccion getDireccion() {
        return direccion;
    }


    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
