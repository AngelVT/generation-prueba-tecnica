import p1.Auto;
import p1.Direccion;
import p1.Marca;
import p1.Propietario;

public class App {

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
    }
}
