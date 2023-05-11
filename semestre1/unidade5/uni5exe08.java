import java.util.Scanner;

public class uni5exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que
        // escreva o menor valor negativo;
        //escreva a média dos números positivos.

        int menorValor = 0;
        int somaPositivos = 0;
        int quantidadePositivos = 0;

        System.out.println("Informe a quantidade de números: ");
        int n = teclado.nextInt();
        for(int contador = 0; contador <n; contador++){
            System.out.println("Informe o número: ");
            int numero = teclado.nextInt();
           
            if(contador==1){
                menorValor = numero;
            }
            if(numero>0){
                somaPositivos += numero;
                quantidadePositivos++;
            }else{
                if(numero<menorValor){
                    menorValor=numero;
                }
            }
            
        }
        System.out.println("O menor valor é: "+menorValor);
        System.out.println("A média dos números positivos é: "+somaPositivos/quantidadePositivos);

        teclado.close();
    }
}
