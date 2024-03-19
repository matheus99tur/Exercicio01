import java.util.Scanner;

public class Exercicio09 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu número");
    int A = scanner.nextInt();
    System.out.println("Digite seu número");
    int B = scanner.nextInt();

    if (A == B) {
      System.out.println("Os números são iguais");
    } else if (A != B) {
      System.out.println("Os números são diferentes");
    }

    scanner.close();
  }
}
