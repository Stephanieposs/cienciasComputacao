import java.util.Scanner;

public class exe2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
         // entradas
 
         double desconto = 0.12;
 
         System.out.println("Informe o preço o sapato: ");
         double preco = teclado.nextDouble();
 
         // processo
 
         double valorDesconto = preco * desconto;
 
         double valorTotal = preco - valorDesconto; 
 
         // saida
         System.out.println("O valor do desconto é "+valorDesconto);
         
         System.out.println("O valor total é "+valorTotal);
 
         teclado.close();
     }
 
}
