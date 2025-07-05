package uni1a;

public class Temporada {
	private int numero;
	private int episodios;

	public Temporada(int numero, int episodios) {
		this.numero = numero;
		this.episodios = episodios;
}
	// Getters y setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
 @Override
    public String toString() { // Imprimir el numero y episodio
        return "Temporada " + numero + " - Episodios: " + episodios;
    }
}