import java.util.Scanner;

public class Exercicio15 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a coordenada x do primeiro ponto (x1): ");
    double x1 = scanner.nextDouble();

    System.out.print("Digite a coordenada y do primeiro ponto (y1): ");
    double y1 = scanner.nextDouble();

    System.out.print("Digite a coordenada x do segundo ponto (x2): ");
    double x2 = scanner.nextDouble();

    System.out.print("Digite a coordenada y do segundo ponto (y2): ");
    double y2 = scanner.nextDouble();

    double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    System.out.printf("A distância entre os pontos é: %.2f\n", distancia);

    scanner.close();
  }
}
