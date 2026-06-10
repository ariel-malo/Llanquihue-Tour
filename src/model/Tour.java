package model;

public class Reserva {
    private String nombre;
    private String alojamiento;
    private String transporte;
    private double precio;
    private int personas;

    public Reserva() {
    }

    public Reserva(String nombre, String alojamiento, String transporte, double precio, int personas) {
        this.nombre = nombre;
        this.alojamiento = alojamiento;
        this.transporte = transporte;
        this.precio = precio;
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(String alojamiento) {
        this.alojamiento = alojamiento;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombre='" + nombre + '\'' +
                ", alojamiento='" + alojamiento + '\'' +
                ", transporte='" + transporte + '\'' +
                ", precio=" + precio +
                ", personas=" + personas +
                '}';
    }
}
