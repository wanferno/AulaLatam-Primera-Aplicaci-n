public class Temperatura {

  public static void main(String[] args) {

    System.out.println("Conversor de grados Celsius a Fahrenheit");

    int temperatura = 30;

    int resultado = (int) (temperatura * 1.8) + 32;

    System.out.println(
            String.format("La temperatura de %d en grados farenheit a Celsius es %d", temperatura, resultado));

    System.out.println("""
            La temperatura de %d
            Conversor de grados Fahrenheit a Celsius
            El resultado es %d
            """.formatted(temperatura, resultado));

}
}
