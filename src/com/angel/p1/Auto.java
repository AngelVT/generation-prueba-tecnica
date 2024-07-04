package com.angel.p1;

public class Auto {
    private String modelo;
    private String color;
    private Integer ano;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private Double capacidadDelTanque;
    private Double combustibleDisponible;
    private Double velocidadMaxima;
    private Double velocidadActual;
    private Integer numeroDePuertas;
    private Boolean tieneTechoSolar;
    private Integer numeroDeMarchas;
    private Integer marchaActual;
    private Boolean tieneTransmisionAutomatica;

    public Auto(String modelo, String color, Integer ano, Marca marca, String chasis, Propietario propietario, Double capacidadDelTanque, Double velocidadMaxima, Integer numeroDePuertas, Boolean tieneTechoSolar, Integer numeroDeMarchas, Boolean tieneTransmisionAutomatica) {
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.capacidadDelTanque = capacidadDelTanque;
        this.combustibleDisponible = 0.0;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0.0;
        this.numeroDePuertas = numeroDePuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroDeMarchas = numeroDeMarchas;
        this.marchaActual = 0;
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAño() {
        return ano;
    }

    public void setAño(Integer año) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Double getCapacidadDelTanque() {
        return capacidadDelTanque;
    }

    public void setCapacidadDelTanque(Double capacidadDelTanque) {
        this.capacidadDelTanque = capacidadDelTanque;
    }

    public Double getCombustibleDisponible() {
        return combustibleDisponible;
    }

    public void setCombustibleDisponible(Double combustibleDisponible) {
        this.combustibleDisponible = combustibleDisponible;
    }

    public Double getVelocidadMáxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMáxima(Double velocidadMáxima) {
        this.velocidadMaxima = velocidadMáxima;
    }

    public Double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(Double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Integer getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(Integer numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public Boolean getTieneTechoSolar() {
        return tieneTechoSolar;
    }

    public void setTieneTechoSolar(Boolean tieneTechoSolar) {
        this.tieneTechoSolar = tieneTechoSolar;
    }

    public Integer getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(Integer numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public Boolean getTieneTransmisionAutomatica() {
        return tieneTransmisionAutomatica;
    }

    public void setTieneTransmisionAutomatica(Boolean tieneTransmisionAutomatica) {
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    public void marchaStatus() {
        System.out.println(marchaActual == -1 ? "La marcha se encuentra en reversa" : marchaActual == 0 ? "La marcha se encuentra en neutral" : "La marcha se encuentra en " + marchaActual);
    }

    public void acelerar() {
        if(marchaActual == 0) {
            System.out.println("No puedes acelerar el vehiculo si estas en neutral");
            return;
        }

        if(combustibleDisponible == 0.0) {
            System.out.println("No puedes acelerar el vehiculo si no tiene combustible");
            return;
        }

        if(velocidadActual < velocidadMaxima) {
            velocidadActual += 1.0;
        }
    }

    public void frenar() {
        velocidadActual = 0.0;
    }

    public double getAutonomia(Double consumo) {
        if (consumo <= 0) {
            return 0.0;
        }
        return combustibleDisponible / consumo;
    }

    public void cambioDeMarcha(Integer marcha) {
        if (marcha < -1 || marcha > numeroDeMarchas) {
            System.out.println("Marcha no valida");
            return;
        }

        if (marcha == -1 && velocidadActual > 0.0) {
            System.out.println("No se puede dar marcha atras miesntras estas en movimiento");
            return;
        }

        marchaActual = marcha;

        marchaStatus();
    }

    public void reduceLaMarcha() {
        if (marchaActual == -1) {
            System.out.println("No se puede reducir la marcha");
            return;
        }

        if (marchaActual == 0 && velocidadActual > 0.0) {
            System.out.println("No se puede dar marcha atras mientras estas en movimiento");
            return;
        }

        marchaActual--;

        marchaStatus();
    }

    public void getNivelDeCombustible() {
        System.out.println("Volumen de combustible: " + combustibleDisponible + "/" + capacidadDelTanque + " litros");
    }
}
