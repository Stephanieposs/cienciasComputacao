import java.util.Scanner;

public class uni5exe02 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int somaPar =0; int somaImpar = 0;

        for(int contador = 1; contador <=100; contador++){
            if(contador % 2 == 0){
                somaPar += contador;
            }else{
                somaImpar +=contador;
            }
        }

        System.out.println("A soma dos números pares é: "+somaPar);
        System.out.println("A soma dos números impares é: "+somaImpar);

        teclado.close();
    }
}
