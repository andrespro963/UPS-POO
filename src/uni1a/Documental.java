/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores; // Composición con Investigador

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, String nombreInvestigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
        this.investigadores.add(new Investigador(nombreInvestigador));
    }
    public void agregarInvestigador(Investigador investigador) {
    	investigadores.add(investigador);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores:");
        for (Investigador investigador : investigadores) {
            System.out.println(" - " + investigador);
        }
        System.out.println();
    }
}