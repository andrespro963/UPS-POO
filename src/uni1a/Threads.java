package uni1a;

public class Threads extends ContenidoAudiovisual {

    private String nombreCreador;
    private int tiempoPublicacion;
    private String paisOrigen;

    public Threads(String titulo, int duracionEnMinutos, String genero, String nombreCreador, int tiempoPublicacion, String paisOrigen) {
        super(titulo, duracionEnMinutos, genero);
        this.nombreCreador = nombreCreador;
        this.tiempoPublicacion = tiempoPublicacion;
        this.paisOrigen = paisOrigen;
    }


    public String getNombreCreador() {
		return nombreCreador;
	}

	public void setNombreCreador(String nombreCreador) {
		this.nombreCreador = nombreCreador;
	}

	public int getTiempoPublicacion() {
		return tiempoPublicacion;
	}

	public void setTiempoPublicacion(int tiempoPublicacion) {
		this.tiempoPublicacion = tiempoPublicacion;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
    public void mostrarDetalles() {
        System.out.println("Detalles del reel en Threads:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + nombreCreador);
        System.out.println("Publicado hace: " + tiempoPublicacion + " horas");
        System.out.println("País de origen: " + paisOrigen);
        System.out.println();
    }
}
