import java.util.Scanner;

public class exe15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // entrada
        System.out.println("Informe um número inteiro de até 3 digitos");
        int numero = teclado.nextInt(); 

        // processo
        int centena = numero/100;
        int dezena = (numero%100)/10;
        int unidade = (numero%100)%10; 
        
        // saida
        System.out.println(centena+" centena(s) "+dezena+" dezena(s) "+unidade+" unidade(s)");

        teclado.close();
    }
}
