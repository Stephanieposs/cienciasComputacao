import java.text.DecimalFormat;
import java.util.Scanner;

public class exe6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("0.00");

        // entradas

        System.out.println("Informe o peso do prato em gramas ");
        double peso = teclado.nextDouble();

        // processo

        double preco = peso*0.025;

        // saida

        System.out.println("O preço a pagar é: "+df.format(preco));


        teclado.close();
    }
}
