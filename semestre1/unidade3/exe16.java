import java.util.Scanner;

public class exe16 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        // entradas
        System.out.println("Informe o valor da compra");
        int valor = teclado.nextInt();
        // processo
        int nota100 = valor/100;
        int nota10 = (valor%100)/10;
        int nota1 = (valor%100)%10;
        // saida
        System.out.println("A quantidade de notas de 100 é "+nota100+", notas de 10 é "+nota10+", notas de 1 é "+nota1);



        teclado.close();
    }
}
