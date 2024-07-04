package com.angel.p2;

public class Factura {
    private String numero;
    private String descripcion;
    private int articulosComprados;
    private double precioPorArticulo;

    public Factura(String numero, String descripcion, int articulosComprados, double precioPorArticulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.articulosComprados = articulosComprados;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getArticulosComprados() {
        return articulosComprados;
    }

    public void setArticulosComprados(int articulosComprados) {
        this.articulosComprados = articulosComprados;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    public Double  getTotalFactura() {
        if(precioPorArticulo < 0) {
            precioPorArticulo = 0.0;
        }

        double total = precioPorArticulo * articulosComprados;

        if (total < 0) {
            return 0.0;
        }

        return total;
    }
}
