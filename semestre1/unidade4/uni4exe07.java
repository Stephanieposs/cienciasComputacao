import java.util.Scanner;

public class uni4exe07 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o peso da carta em gramas");
        int peso = teclado.nextInt();
        double custoSelo;

        if(peso <= 50){
            custoSelo = 0.45; 
        }else{ 
            custoSelo = 0.45 + ((peso-50)/20)*0.45; 
        }

        System.out.println("O custo do selo é "+custoSelo);

        teclado.close();
    }
}
