import java.util.Scanner;

public class uni4exe05 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("a cor é azul?");
        boolean azul = teclado.nextBoolean();


        if(azul){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }


        teclado.close();

    }
}
