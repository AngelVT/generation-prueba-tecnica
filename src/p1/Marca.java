package p1;

public class Marca {
    private String nombre;
    private Integer numerodeModelos;
    private Integer anoDeLanzamiento;
    private String codigoIdentificador;

    public Marca(String nombre, Integer numerodeModelos, Integer anoDeLanzamiento, String codigoIdentificador) {
        this.nombre = nombre;
        this.numerodeModelos = numerodeModelos;
        this.anoDeLanzamiento = anoDeLanzamiento;
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumerodeModelos() {
        return numerodeModelos;
    }

    public void setNumerodeModelos(Integer numerodeModelos) {
        this.numerodeModelos = numerodeModelos;
    }

    public Integer getAnoDeLanzamiento() {
        return anoDeLanzamiento;
    }

    public void setAnoDeLanzamiento(Integer anoDeLanzamiento) {
        this.anoDeLanzamiento = anoDeLanzamiento;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
}
