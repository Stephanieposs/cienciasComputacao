import java.util.Scanner;

public class exe1 {
    public static void main(String[] args){
        // entradas
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a largura: ");
        double largura = teclado.nextDouble(); 

        System.out.println("Informe o comprimento: ");
        double comprimento = teclado.nextDouble();

        // processo
        double area = largura*comprimento;

        // saída
        System.out.println("A área é: "+area);

        teclado.close();
    }
}
