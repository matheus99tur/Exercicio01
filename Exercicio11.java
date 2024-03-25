
import java.util.Scanner;

//Exerc11
public class Exercicio11 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite três valores inteiros distintos:");

    System.out.print("Digite o primeiro valor: ");
    int a = scanner.nextInt();

    System.out.print("Digite o segundo valor (diferente do primeiro): ");
    int b = scanner.nextInt();

    System.out.print("Digite o terceiro valor (diferente dos anteriores): ");
    int c = scanner.nextInt();

    if (a == b || a == c || b == c) {
      System.out.println("Os valores não são distintos. Reinicie o programa e digite valores diferentes.");
    } else {
      // Ordenação dos valores
      int menor = Math.min(a, Math.min(b, c));
      int maior = Math.max(a, Math.max(b, c));
      int meio = (a + b + c) - menor - maior;

      // Exibição dos valores em ordem crescente
      System.out.println("\nValores em ordem crescente:");
      System.out.println(menor + ", " + meio + ", " + maior);
    }
    scanner.close();
  }
}
