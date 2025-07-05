/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private ArrayList<Temporada> listaTemporadas; // Agregación con Temporada

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, int numeros, int episodios) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
        this.listaTemporadas.add(new Temporada(numeros, episodios));
    }
    public void agregarTemporada(Temporada temporada) {
    	listaTemporadas.add(temporada);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la SerieDeTv:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Temporadas Detalle:");
        for (Temporada temporada : listaTemporadas) {
            System.out.println(" - " + temporada);
        }
        System.out.println();
    }
}