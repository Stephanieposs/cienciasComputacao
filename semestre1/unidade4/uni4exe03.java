import java.util.Scanner;

public class uni4exe03 {
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número 1: ");
        int numero1 = teclado.nextInt();

        System.out.println("Informe o número 2: ");
        int numero2 = teclado.nextInt();

        // processo 

        if(numero1 == numero2){
            System.out.println("Números iguais");
        }else {
            if(numero1>numero2){
                System.out.println(numero1+" é o maior");
            } else {
                System.out.println(numero2+" é o maior");
            }
    
        }
       

        teclado.close();
    }



}
