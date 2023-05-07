import java.text.DecimalFormat;
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("0.00");

        // entradas

        System.out.println("Informe a quantidade de frangos ");
        double frangos = teclado.nextDouble();

        // processo

        double custo = 11*frangos;

        // saida

        System.out.println("O gasto total da granja para marcar seus frangos é de "+df.format(custo));


        teclado.close();
    }
}
