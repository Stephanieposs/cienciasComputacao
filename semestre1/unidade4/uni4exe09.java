import java.util.Scanner;

public class uni4exe09 {
    public static void main(String [] args){
        // ENUNCIADO: Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.

        Scanner teclado = new Scanner(System.in);


        System.out.println("informe o primeiro valor inteiro");
        int valor1 = teclado.nextInt();

        System.out.println("informe o segundo valor inteiro");
        int valor2 = teclado.nextInt();


        // processo 
        
        
        if((valor1%valor2 == 0 )||(valor2%valor1 == 0)){
            System.out.println("Os valores são múltiplos");
        }else{
            System.out.println("Os valores não são múltiplos");
        }

        teclado.close();



    }
}
// (numero - Math.floor(numero)== 0)