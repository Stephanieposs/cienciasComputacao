import java.text.DecimalFormat;
import java.util.Scanner;

public class exe10 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in); 
        DecimalFormat df = new DecimalFormat("0.00");
        

        // entradas 

        System.out.println("Informe o comprimento do cateto 1 ");
        double cateto1 = teclado.nextDouble();

        System.out.println("Informe o comprimento do cateto 2 ");
        double cateto2 = teclado.nextDouble();

        // processo
        
        double hipotenusa2 = (cateto1*cateto1)+(cateto2*cateto2);
        double hipotenusa = Math.sqrt(hipotenusa2);


        Math.pow(cateto1, cateto2);
        
        // saida

        System.out.println("A hipotenusa é = "+df.format(hipotenusa));


        teclado.close();



    }
}
