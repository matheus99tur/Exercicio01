import java.util.Scanner;

public class Exercicio04 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor a");
    int a = scanner.nextInt();
    System.out.println("Digite o valor b");
    int b = scanner.nextInt();

    System.out.println("O resultado é" + (a + b));
    System.out.println("O resultado é" + (a - b));
    System.out.println("O resultado é" + (a * b));
    System.out.println("O resultado é" + (a / b));

    scanner.close();
  }
}
