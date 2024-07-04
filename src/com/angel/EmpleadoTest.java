package com.angel;

import com.angel.p3.Empleado;

public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Nelson", "Vazquez", 15000);
        Empleado empleado2 = new Empleado("Cristina", "alvarado", 20800);

        //consulta valores iniciales
        System.out.printf("Salario de %s antes del aumento: %.2f\n", empleado1.getNombre(), empleado1.getSalarioMensual());
        System.out.printf("Salario de %s antes del aumento: %.2f\n", empleado2.getNombre(), empleado2.getSalarioMensual());

        //se aplica el aumento del 10% al salario mensual
        empleado1.setSalarioMensual(empleado1.getSalarioMensual() + (empleado1.getSalarioMensual() * 0.10));
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() + (empleado2.getSalarioMensual() * 0.10));

        //consulta valores despues del aumento
        System.out.printf("Salario de %s despues del aumento: %.2f\n", empleado1.getNombre(), empleado1.getSalarioMensual());
        System.out.printf("Salario de %s despues del aumento: %.2f\n", empleado2.getNombre(), empleado2.getSalarioMensual());
    }
}
