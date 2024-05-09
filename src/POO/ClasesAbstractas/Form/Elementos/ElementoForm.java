package POO.ClasesAbstractas.Form.Elementos;

abstract public class ElementoForm {
    protected String valor;
    protected String nombre;
    public ElementoForm(){

    };
    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor){
        this.valor = valor;
    }
    abstract public String dibujarHTML();
}