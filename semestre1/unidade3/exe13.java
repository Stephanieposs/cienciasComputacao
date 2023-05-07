import java.text.DecimalFormat;
import java.util.Scanner;

public class exe13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        // entrada
        System.out.println("Informe a altura da parede em metros");
        double altura = teclado.nextDouble();

        System.out.println("Informe o comprimento da perede em metros");
        double comprimento = teclado.nextDouble();

        // processo 

        double valorAzulejos = (altura*comprimento*9)*12.5;

        // saida

        System.out.println("O valor dos azulejos é de: "+df.format(valorAzulejos));

        teclado.close(); 
    }
}