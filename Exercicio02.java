import java.util.Scanner;

public class Exercicio02 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número:");
    int a = scanner.nextInt();
    System.out.println("Digite o segundo número:");
    int b = scanner.nextInt();
    var resultado = (a + b);

    System.out.println("O resultado é:" + resultado);

    scanner.close();
  }
}
