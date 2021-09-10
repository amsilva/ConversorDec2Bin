import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Apoio apoio = new Apoio();
    Scanner teclado = new Scanner(System.in); 

    System.out.print("Valor DECIMAL: ");
    int ndec = teclado.nextInt();

    String binario = apoio.converte(ndec);

    System.out.print("BINARIO do "+ ndec +" = " + binario);

    System.out.println("\n\nfim. exec.!");
  }
}