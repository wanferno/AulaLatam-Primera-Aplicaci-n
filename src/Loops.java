import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double nota = 0;
    double mediaEvaluaciones = 0;

    for (int i = 0; i < 3; i++) {
      System.out.println("Escriba la nota que le darias a la pelicula de Matrix");
      nota = teclado.nextDouble();
      mediaEvaluaciones = mediaEvaluaciones + nota;
    }

    System.out.println("La media de evaluaciones es " + mediaEvaluaciones / 3);

  }

}
