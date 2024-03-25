import java.util.Scanner;

//Exerc17
public class Exercicio17 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    System.out.print("Digite o peso da primeira nota: ");
    double peso1 = scanner.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    System.out.print("Digite o peso da segunda nota: ");
    double peso2 = scanner.nextDouble();

    System.out.print("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();
    System.out.print("Digite o peso da terceira nota: ");
    double peso3 = scanner.nextDouble();

    double somaPesos = peso1 + peso2 + peso3;
    double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;

    System.out.printf("A média ponderada das notas é: %.2f\n", mediaPonderada);

    scanner.close();
  }
}
