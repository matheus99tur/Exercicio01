import java.util.Scanner;

public class Exercicio08 {
  public static void executar() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero:");
    int numero = scanner.nextInt();

    if (numero >= 50) {
      System.out.println("Número maior que ou igual a 50");
    } else {
      System.out.println("Número menor que 50");

      scanner.close();
    }
  }
}
