import java.util.Scanner;

public class uni4exe08 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        char letra = teclado.next().charAt(0);


        // processo
        letra = Character.toLowerCase(letra);
        if((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra =='o') || (letra =='u') ){
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal"); 
        }




        teclado.close();
    }
}
