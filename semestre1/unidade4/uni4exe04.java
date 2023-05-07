import java.util.Scanner;

public class uni4exe04 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número maior que 0");
        float numero = teclado.nextFloat();

        // processo
        if((numero - Math.floor(numero)!= 0)){
            System.out.println("Foram digitadas casas decimais");
        }else{
            System.out.println("Não foram digitadas casas decimais");
        }


        teclado.close();

    }
}
