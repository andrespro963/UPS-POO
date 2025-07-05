package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", "Andres Procel");	
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8, 3, 12);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy", "Charles Darwin");
        contenidos[3] = new TikTok("Temblor en Japon", 1, "Noticias", "RTU", 50000, 200);
        contenidos[4] = new Threads("OriginRecords", 30, "Concierto","Bunbury", 10, "Ecuador");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}