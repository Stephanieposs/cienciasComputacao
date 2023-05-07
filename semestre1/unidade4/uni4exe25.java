import java.util.Scanner;

public class uni4exe25 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Informe dois números: ");
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();

        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");

        int opcao = teclado.nextInt();

        // processo

        switch(opcao){
            case 1:  System.out.println(numero1+numero2);
            break;
            case 2:  System.out.println(numero1-numero2);
            break; 
            case 3:  System.out.println(numero1*numero2);
            break;
            case 4:  System.out.println(numero1/numero2);
            break;
            default: System.out.println("Opção inválida");
            break;

        }


        teclado.close();
    }
}
