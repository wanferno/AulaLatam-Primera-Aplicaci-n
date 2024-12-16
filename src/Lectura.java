import java.util.Scanner;

public class Lectura {


  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Escriba el nombre de la pelicula favorita:");
    String nombrePelicula = teclado.nextLine();
    System.out.println("Ahora escribe la fecha de lanzamiento:");
    int fechaLanzamiento = teclado.nextInt();
    System.out.println("Por ultimo dinos que nota le das a esta pelicula");
    double nota = teclado.nextDouble();

    System.out.println(nombrePelicula);
    System.out.println(fechaLanzamiento);
    System.out.println(nota);
  }
}
