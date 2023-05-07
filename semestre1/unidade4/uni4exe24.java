import java.util.Scanner;

public class uni4exe24 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe os 3 valores: ");
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();
        System.out.println("Informe a opção");
        System.out.println("se opção = 1, escreva os 3 valores em ordem crescente");
        System.out.println("se opção = 2, escreva os 3 valores em ordem decrescente");
        System.out.println("se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio");
        int opcao = teclado.nextInt();

        int maiorNumero = 0;
        int menornumero = 0;
        int numeroMeio = 0;
        // processo
        if(valor1>valor2 && valor1>valor3){
            maiorNumero = valor1; 
            if(valor2>valor3){
                numeroMeio=valor2;
                menornumero=valor3;
            }else{
                numeroMeio=valor3;
                menornumero=valor2;
            }
        }else{
            if(valor2>valor1 && valor2>valor3){
                maiorNumero=valor2;
                if(valor1>valor3){
                    numeroMeio=valor1;
                    menornumero=valor3;
                }else{
                    numeroMeio=valor3;
                    menornumero=valor1;
                }
            }else{
                maiorNumero=valor3;
                if(valor1>valor2){
                    numeroMeio=valor1;
                    menornumero=valor2;
                }else{
                    numeroMeio=valor2;
                    menornumero=valor1;
                }
            }
        }
        
        
        switch(opcao){
            case 1: System.out.println(menornumero);
                    System.out.println(numeroMeio);
                    System.out.println(maiorNumero);
            break;
            case 2: System.out.println(maiorNumero);
                    System.out.println(numeroMeio);
                    System.out.println(menornumero);
            break;
            case 3: System.out.println(numeroMeio);
                    System.out.println(maiorNumero);
                    System.out.println(menornumero);
            break;
        }





        teclado.close();
    }
}
