public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a Screem Matrix!");
        System.out.println("Pelicula: Matrix");

        int fechaLanzamiento = 1999;

        boolean incluidoEnElPlan = true;

        double notaDeLaPelicula = 8.2;

        double media = 8.2 + 6.0 + 9.0 / 3;

        System.out.println("Media: " + media);

        String sipnosis = """
        Matrix es una paradoja
        La mejor pelicula del fin del milenio
        Fue lanzada en:
        """ + fechaLanzamiento;

        System.out.println(sipnosis);

        int clasificacion = (int) (media / 2);

        System.out.println("Clasificacion: " + clasificacion);

    }
}