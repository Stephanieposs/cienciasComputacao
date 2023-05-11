import java.util.Scanner;

public class uni5exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // leia um número inteiro n e, dados n números reais informe o maior e o menor número.

        double maiorNumero = 0;
        double menorNumero=0;
        int n = teclado.nextInt();
        for(int contador = 1; contador<=n; contador++){
            double numeroReal=teclado.nextDouble();
            
            if(contador == 1){
                maiorNumero = numeroReal;
                menorNumero = numeroReal;
            }else{
                if(numeroReal>maiorNumero){
                    maiorNumero = numeroReal;
                }
                if(numeroReal<menorNumero){
                    menorNumero = numeroReal;
                }
            }
            
        }
        System.out.println(menorNumero+" e "+maiorNumero);


        teclado.close();
    }
}
