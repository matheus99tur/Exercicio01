public class Exercicio14 {

  // Exerc14
  public static int calcularTermoPA(int a1, int n, int r) {

    int an = a1 + (n - 1) * r;
    return an;
  }

  public static void executar() {
    int a1 = 10;
    int n = 7;
    int r = 3;

    int resultado = calcularTermoPA(a1, n, r);
    System.out.println("O " + n + "-ésimo termo da Progressão Aritmética é: " + resultado);

  }
}