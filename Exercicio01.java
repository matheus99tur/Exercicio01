import java.util.Scanner;

public class Exercicio01 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário para digitar um número
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    if (numero > 10) {
      System.out.println("Número maior do que 10!");
    } else {
      System.out.println("Número menor ou igual a 10!");
    }

    scanner.close();
  }
}
