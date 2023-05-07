import java.util.Scanner;

public class uni4uri04 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3 = teclado.nextInt();
        

        int maiorNumero = 0;
        int meioNumero = 0;
        int menorNumero = 0;

        if(numero1>numero2 && numero1>numero3){
            maiorNumero = numero1;
            if(numero2>numero3){
              meioNumero=numero2;
              menorNumero=numero3;
            }else{
                menorNumero=numero2;
                meioNumero=numero3;
            }
        }else{
            if(numero2>numero1 && numero2>numero3){
                maiorNumero = numero2;
                if(numero1>numero3){
                    meioNumero=numero1;
                    menorNumero=numero3;
                }else{
                    meioNumero=numero3;
                    menorNumero=numero1;
                }
            }else{
                maiorNumero=numero3;
                if(numero1>numero2){
                    meioNumero=numero1;
                    menorNumero=numero2;
                }else{
                    meioNumero=numero2;
                    menorNumero=numero1;
                }
            }
            
        }

        System.out.println(menorNumero);
        System.out.println(meioNumero);
        System.out.println(maiorNumero);
        

        System.out.println();
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);

        
        
        teclado.close();
    }
}
