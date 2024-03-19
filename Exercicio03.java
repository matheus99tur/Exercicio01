import java.util.Scanner;

public class Exercicio03 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor A");
    int a = scanner.nextInt();
    System.out.println("Digite o valor B");
    int b = scanner.nextInt();

    int maior = Math.max(1, b);

    if (a == b) {
      System.out.println("Sequencia inválida");

    } else {
      System.out.println("o número maior é:" + maior);

    }

    scanner.close();
  }
}
