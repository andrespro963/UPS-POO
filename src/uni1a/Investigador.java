package uni1a;

public class Investigador {
	private String nombre;

	public Investigador(String nombre) {
		this.nombre = nombre;
	}
 // Getters y setters

	public String getNombreInves() {
		return nombre;
	}
	public void setNombreInves(String nombre) {
		this.nombre = nombre;
	}

    @Override
    public String toString() {
        return nombre;
    }
}