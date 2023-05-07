import java.text.DecimalFormat;
import java.util.Scanner;

public class exe11 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        // entradas

        System.out.println("Informe a temperatura em °C ");
        double graus = teclado.nextDouble();

        // processo

        double fahrenheit = ((graus*9)/5)+ 32;

        // saida

        System.out.println("A temperatura em Fahrenheit é de "+df.format(fahrenheit));


        teclado.close();
    }
}
