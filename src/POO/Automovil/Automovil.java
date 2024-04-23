package POO.Automovil;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Blanco";
    private double cilindrada;
    private int capacidadTanque;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String verDetalles() {
        return fabricante + " " + modelo + " " + color + " " + cilindrada + " " + capacidadTanque;
    }

    public String arrancar() {
        return "El auto " + this.fabricante + " " + this.modelo + " ha arrancado";
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " " + this.modelo + " ha acelerado a " + rpm + " rpm";
    }

    public String frenar() {
        return "El auto " + this.fabricante + " " + this.modelo + " ha frenado";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadTanque * porcentajeBencina);
    }

    // Sobrecarga de metodos
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadTanque * (porcentajeBencina / 100f));
    }

    @Override
    public boolean equals(Object obj) {
        // Si es el mismo objeto retorna true
        if (this == obj) {
            return true;
        }

        // Se valida que sean del mismo tipo de Objeto
        if (!(obj instanceof Automovil)) {
            return false;
        }

        // Se compara con el mismo tipo de objeto
        Automovil auto = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(auto.getFabricante())
                && this.modelo.equals(auto.getModelo()));
    }
}
