import java.util.Scanner;

public class uni4exe03outro {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número 1: ");
        int numero1 = teclado.nextInt();
    
        System.out.println("Informe o número 2: ");
        int numero2 = teclado.nextInt();
    
        int maiorNumero; 
        
        // processo 
    
        if(numero1 == numero2){
            System.out.println("Números iguais");
        }else {
            if(numero1>numero2){
                maiorNumero = numero1;
            } else {
                maiorNumero = numero2;
            }
    
            System.out.println(maiorNumero+" é o maior");
        }
       
       
        teclado.close();


    }
    
    
   
}

