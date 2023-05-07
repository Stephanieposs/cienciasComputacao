import java.text.DecimalFormat;
import java.util.Scanner;

public class exe {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        // entradas

        System.out.println("Informe a altura da lata de óleo ");
        double altura = teclado.nextDouble();

        System.out.println("Informe o raio da lata de óleo ");
        double raio = teclado.nextDouble();

        // processo

        double volume = 3.14*altura*(raio*raio);

        // saida

        System.out.println("O volume da lata de óleo é de "+df.format(volume));

        teclado.close();

    }
}