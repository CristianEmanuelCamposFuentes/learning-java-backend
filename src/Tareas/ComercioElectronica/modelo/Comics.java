package Tareas.ComercioElectronica.modelo;

import java.util.Date;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return this.precio * 1.08; // Ejemplo de cálculo de precio de venta
    }
}
