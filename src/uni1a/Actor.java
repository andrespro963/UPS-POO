package uni1a;

public class Actor {
	private String nombre;

	public Actor(String nombre) {
	this.nombre = nombre;
	}

	// Getters y setters	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
@Override
	 public String toString() {
	     return nombre;  // Imprimir el nombre del actor
	}
	
}