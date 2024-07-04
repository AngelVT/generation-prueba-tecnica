package com.angel;

import com.angel.p2.Factura;

public class FacturaTest {
    public static void main(String[] args) {
        Factura factura1 = new Factura("1445",
                "A random description",
                7,
                1.5);

        Factura factura2 = new Factura("1445",
                "A random description",
                -7,
                1.5);

        Factura factura3 = new Factura("1445",
                "A random description",
                7,
                -1.5);

        System.out.println("Factura normal " + factura1.getTotalFactura());
        System.out.println("Factura que generaria un valor negativo " + factura2.getTotalFactura());
        System.out.println("Factura con precio negativo " + factura3.getTotalFactura());
    }
}
