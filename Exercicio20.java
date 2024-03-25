import java.util.Scanner;

//Exer20
public class Exercicio20 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tempo da viagem em horas: ");
    double tempoViagem = scanner.nextDouble();

    System.out.print("Digite a velocidade média em km/h: ");
    double velocidadeMedia = scanner.nextDouble();

    double distancia = velocidadeMedia * tempoViagem;

    double litrosGastos = distancia / 12.0;

    System.out.println("A quantidade de litros de combustível gasta na viagem é: " + litrosGastos + " litros");

    scanner.close();
  }
}
