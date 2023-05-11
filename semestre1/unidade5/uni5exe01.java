import java.util.Scanner;

public class uni5exe01 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        for(int contador = 1; contador <=20; contador++){
            System.out.println("Informe o "+contador+" número:");
            numero = teclado.nextInt();

            if(numero %2 == 0){
                System.out.println("É par");
            }else{
                System.out.println("É impar");
            }

        }





        teclado.close();
    }
}
