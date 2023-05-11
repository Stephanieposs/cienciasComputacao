import java.util.Scanner;

public class uni5exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero =8;
        int n = teclado.nextInt();
        System.out.println(numero);
        for(int contador=0;contador<=n;contador++){
            if(contador%2==0){
                
                System.out.println(numero+2);
            }else{
                numero = numero*2;
                System.out.println(numero);
            }
            
        }



        teclado.close();
    }
}
