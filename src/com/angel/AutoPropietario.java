package com.angel;

import com.angel.p1.Auto;
import com.angel.p1.Direccion;
import com.angel.p1.Marca;
import com.angel.p1.Propietario;

public class AutoPropietario {

    public static void main(String[] args) throws Exception {
        
        Direccion direccion = new Direccion(
                10,
                "Monrroy solis",
                "DonCarlos",
                "Tizayuca");

        Propietario propietario = new Propietario(
                "Angel",
                "25-10-1999",
                direccion);

        Marca marca = new Marca(
                "Nissan",
                200,
                2020,
                "s0m3num33r5andl3773r5");

        Auto auto = new Auto(
                "Modelito",
                "negro",
                2020,
                marca,
                "theCahsis",
                propietario,
                45.8,
                150.0,
                4,
                false,
                5,
                true);

        auto.acelerar();

        auto.cambioDeMarcha(-1);
        auto.cambioDeMarcha(0);
        auto.cambioDeMarcha(5);
        auto.cambioDeMarcha(6);
        auto.reduceLaMarcha();

        auto.acelerar();

        auto.setCombustibleDisponible(11.5);
        auto.getNivelDeCombustible();

        auto.acelerar();

        System.out.println("El auto se mueve a " + auto.getVelocidadActual() + "km/h");
        auto.setVelocidadActual(150.0);
        System.out.println("El auto se mueve a " + auto.getVelocidadActual() + "km/h");
        auto.acelerar();
        System.out.println("El auto se mueve a " + auto.getVelocidadActual() + "km/h");
        auto.cambioDeMarcha(-1);
        auto.frenar();
        System.out.println("El auto se mueve a " + auto.getVelocidadActual() + "km/h");
        auto.cambioDeMarcha(-1);

        System.out.println("El auto rendira por " + auto.getAutonomia(1.5) + "km");
    }
}
