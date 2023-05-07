import java.text.DecimalFormat;
import java.util.Scanner;

public class exe7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        // entradas

        System.out.println("Informe a quantidade de latas de 350ml ");
        double latas = teclado.nextDouble();

        System.out.println("Informe a quantidade de garrafas de 600ml ");
        double garrafas = teclado.nextDouble();

        System.out.println("Informe a quantidade de garrfas de 2 litros ");
        double garrafa2 = teclado.nextDouble();

        // processo 

        double litro = (0.35*latas)+(0.6*garrafas)+(2*garrafa2);

        // saida

        System.out.println("Foram comprados "+df.format(litro)+" litros de refigerante");



        teclado.close();
    }
}
