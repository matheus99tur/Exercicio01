import java.util.Scanner;

public class Exercicio06 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    double C, F;

    System.out.println("Temperatura em Graus Celsius ");
    C = scanner.nextDouble();

    F = (9 * C + 160) / 5;

    System.out.println("Temperatura convertida em graus Fahrenheit " + F);

    scanner.close();
  }
}
