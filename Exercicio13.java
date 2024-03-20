import java.util.Scanner;

public class Exercicio13 {

  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário que digite os valores e o operador
    System.out.print("Digite o valor de A: ");
    double a = scanner.nextDouble();

    System.out.print("Digite o valor de B: ");
    double b = scanner.nextDouble();

    System.out.print("Digite o operador (+, -, *, /): ");
    char operador = scanner.next().charAt(0);

    double resultado = 0.0;
    boolean operacaoValida = true;

    // Realiza a operação de acordo com o operador fornecido
    switch (operador) {
      case '+':
        resultado = a + b;
        break;
      case '-':
        resultado = a - b;
        break;
      case '*':
        resultado = a * b;
        break;
      case '/':
        // Verifica se B é diferente de zero para evitar divisão por zero
        if (b != 0) {
          resultado = a / b;
        } else {
          System.out.println("Erro: Divisão por zero!");
          operacaoValida = false;
        }
        break;
      default:
        System.out.println("Operador não definido!");
        operacaoValida = false;
    }

    // Se a operação foi válida, imprime o resultado
    if (operacaoValida) {
      System.out.println("Resultado da operação: " + resultado);
    }

    scanner.close();
  }
}
