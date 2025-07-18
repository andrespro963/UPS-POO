/**
 * Class Pelicula
 */

package uni1a;

import java.util.ArrayList;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores; // Asociación con Actor

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, String nombreActor) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); // lista de actores vacía
        this.actores.add(new Actor(nombreActor));
    }
    public void agregarActor(Actor actor) {
    	actores.add(actor);
    }

	public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

	@Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Actores:");
        for (Actor actor : actores) {
            System.out.println(" - " + actor);
        }
        System.out.println();
    }
}