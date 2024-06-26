package POO.Interfaces.Imprenta.modelo;
import static POO.Interfaces.Imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Javier", "Hernandez"),
                "Ingeniero de Software",
                "Estoy aprendiendo POO");
        cv.agregarExperiencia("Trabajo en google");
        cv.agregarExperiencia("Trabajo en facebook");
        cv.imprimir();

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de disenios: POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patrones de disenios: POO"))
                .addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Builder"))
                .addPagina(new Pagina("Patron Factory Method"))
                .addPagina(new Pagina("Patron Prototype"))
                .addPagina(new Pagina("Patron Observer"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Informe informe = new Informe( new Persona("Luciana", " Holmes"),
                new Persona("Martin", " Douglas"),
                "Estudio sobre Microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
