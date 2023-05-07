import java.text.DecimalFormat;
import java.util.Scanner;

public class exe14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        // entrada 

        System.out.println("Informe a distância percorrida em km");
        double distancia = teclado.nextDouble();

        System.out.println("Informe o tempo gasto na viagem em horas");
        double tempo = teclado.nextDouble();

        // processo
        double velocidadeMedia = distancia/tempo;
        double combustivel = distancia/12;

        // saida
        System.out.println("A velocidade média é de: "+df.format(velocidadeMedia));
        System.out.println("A quantidade de litros gasta foi de: "+df.format(combustivel));
        

        teclado.close();

    }
}