import java.util.Scanner;

public class Exercicio12 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    String[] meses = {
        "Janeiro", "Fevereiro", "Março", "Abril",
        "Maio", "Junho", "Julho", "Agosto",
        "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    System.out.print("Digite o número do mês (1 a 12): ");
    int numeroMes = scanner.nextInt();

    if (numeroMes >= 1 && numeroMes <= 12) {
      String nomeMes = meses[numeroMes - 1];
      System.out.println("O mês correspondente é: " + nomeMes);
    } else {
      System.out.println("Mês inválido. Digite um número de 1 a 12.");
    }
    scanner.close();
  }
}
