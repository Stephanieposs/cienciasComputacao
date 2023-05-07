import java.util.Scanner;

public class exe4 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        // entradas

        System.out.println("Informe a nota 1 ");
        double nota1 = teclado.nextDouble();

        System.out.println("Informe a nota 2 ");
        double nota2 = teclado.nextDouble();

        System.out.println("Informe a nota 3 ");
        double nota3 = teclado.nextDouble();

        // processo

        double mediaPonderada = (nota1*5 + nota2*3 + nota3*2) / 10;

        // saida

        System.out.println("A média ponderada é: "+mediaPonderada);


        teclado.close();



    }
}   

        
        