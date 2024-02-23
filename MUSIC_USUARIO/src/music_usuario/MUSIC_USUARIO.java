import java.util.Scanner;
import javafx.scene.media.Media;
import java.io.File;
import javafx.scene.media.MediaPlayer;


public class MUSIC_USUARIO {

  
    public static void main(String[] args) {
        com.sun.javafx.application.PlatformImpl.startup(() -> {});

        Scanner scanner = new Scanner(System.in);
     
        final String NOMBRE_ARCHIVO = "C:\\Fabian\\musica\\snap\\Aaaaaaa canción.mp3";
        File archivo = new File(NOMBRE_ARCHIVO);
        
        if (archivo.exists()) {
            
            Media audio = new Media(archivo.toURI().toString());
            MediaPlayer reproductor = new MediaPlayer(audio);
            reproductor.play();
             
            System.out.println("¡Bienvenido a nuestra aplicación de música!");
            System.out.println("¿Como te llamas?");
            String nombre = scanner.nextLine();
            System.out.println("¿Te gusta la música?");
            String gustaMusica = scanner.nextLine();
            System.out.println("¿Qué tipo de música te gusta?");
            String tipoMusica = scanner.nextLine();
            System.out.println("¿Qué edad tienes?");
            String edad = scanner.nextLine();
            System.out.println("Disfruta de la canción?" + nombre);
            System.out.println("¿Quieres detener la canción? (si/no)");
            String respuesta = scanner.nextLine();
            
            if (respuesta.equalsIgnoreCase("si")) {
                reproductor.stop();
                System.out.println("¡Canción detenida!");
            }
        } else {
            System.out.println("El archivo no existe en la ubicación especificada.");
        }
        
        scanner.close();
    }
}
