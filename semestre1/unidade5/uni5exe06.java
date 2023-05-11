
import java.util.Scanner;

public class uni5exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double somaAltura = 0;
        double altura = 0;
        for(int contador = 1; contador <=20; contador++){
            System.out.println("Informe a altura: ");
            altura = teclado.nextInt();
            somaAltura += altura;
        }
        System.out.println(" a média das alturas é: "+somaAltura/20);
      teclado.close();
    }
}
