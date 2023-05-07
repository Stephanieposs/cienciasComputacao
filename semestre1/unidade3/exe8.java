import java.text.DecimalFormat;
import java.util.Scanner;

public class exe8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        // entradas

        System.out.println("Informe quantos dólares foram entregues ");
        double dolares = teclado.nextDouble();

        // processo

        double reais = dolares*5.3;

        // saida

        System.out.println("O cliente receberá "+df.format(reais)+" reais"); 
        
        
        teclado.close();

    }

}
