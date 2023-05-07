import java.util.Scanner;

public class uni4uri05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int horaInicio = teclado.nextInt();
        int horaFim = teclado.nextInt();
    
        
        // processo

        if(horaFim>horaInicio){
            System.out.println("O JOGO DUROU "+(horaFim-horaInicio)+" HORA(S)");
        }else{
            System.out.println("O JOGO DUROU "+((horaFim+24)-horaInicio)+" HORA(S)");
        }







        teclado.close();
    }
}
