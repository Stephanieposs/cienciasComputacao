import java.util.Scanner;

public class exemploChar {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe uma letra");
        char letra = teclado.next().charAt(0);

        // convertendo pra maiusculo

        letra = Character.toUpperCase(letra);
        if(letra == 'A'){
            System.out.println("A letra informada é A");

        }else{
            System.out.println("A letra informada não é A");
        }
        
        
        
        
        





        teclado.close();
    }
}
