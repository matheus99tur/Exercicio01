import java.util.Scanner;

//Exerc07
public class Exercicio07 {

  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número: ");
    int numero = scanner.nextInt();

    if (numero >= 100 && numero <= 200) {
      System.out.println("O número digitado está entre o intervalo de 100 a 200");
    } else {
      System.out.println("O número está fora do intervalo");

    }

    scanner.close();
  }
}
