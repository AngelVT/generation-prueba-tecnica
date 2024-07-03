package p1;

public class Direccion {
    private Integer numero;
    private String calle;
    private String barrio;
    private String ciudad;

    public Direccion(Integer numero, String calle, String barrio, String ciudad) {
        this.numero = numero;
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
