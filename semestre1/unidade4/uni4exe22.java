import java.util.Scanner;

public class uni4exe22 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe opção: ");
        System.out.println("1 - Ciência da Computação");
        System.out.println("2 - Licenciatura da Computação");
        System.out.println("3 - Sistemas da Informação");

        int opcao = teclado.nextInt();


        switch(opcao){
            case 1: System.out.println("Bacharel em ciência da computação");
            break;
            case 2: System.out.println("Licenciado em computação");
            break;
            case 3: System.out.println("Bacharel em sistemas de informação");
            break;
        }







        teclado.close();
    }
}
