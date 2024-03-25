import java.util.Scanner;

//Exercicio05
public class Exercicio05 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    int a = 10;
    int b = 30;

    System.out.println("O valor de A é: " + a);
    System.out.println("O valor de B é: " + b);

    int temporaria = a;
    a = b;
    b = temporaria;
    System.out.println("Valor trocado de A " + a);
    System.out.println("Valor trocado de B: " + b);

    scanner.close();
  }
}
