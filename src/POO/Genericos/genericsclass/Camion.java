package POO.Genericos.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable{
    private List objetos;
    private int max;

    public Camion(int max) {
        this.objetos = new ArrayList();
        this.max = max;
    }

    public void addObjeto(Object objeto) {
        if (this.objetos.size() < this.max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("Camion lleno");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
