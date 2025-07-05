package uni1a;

public class TikTok extends ContenidoAudiovisual {
	
    private String creador;
    private int likes;
    private int comentarios;

    public TikTok(String titulo, int duracionEnMinutos, String genero, String creador, int likes, int comentarios) {
        super(titulo, duracionEnMinutos, genero);
        this.creador = creador;
        this.likes = likes; 
        this.comentarios = comentarios;
    }

    public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getComentarios() {
		return comentarios;
	}

	public void setComentarios(int comentarios) {
		this.comentarios = comentarios;
	}

	@Override
    public void mostrarDetalles() {
        System.out.println("Detalles del TikTok:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Creador: " + creador);
        System.out.println("Numero de Like: " + likes);
        System.out.println("Comentarios realizados: " + comentarios);
        System.out.println();
    }
}

