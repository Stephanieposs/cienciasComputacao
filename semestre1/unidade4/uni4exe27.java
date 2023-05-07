import java.util.Scanner;

public class uni4exe27 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o horario de chegada");
        int horaChegada = teclado.nextInt();
        int minChegada = teclado.nextInt();

        System.out.println("Informe o horario de partida");
        int horaPartida = teclado.nextInt();
        int minPartida = teclado.nextInt();

        int horasEstacionado = horaPartida-horaChegada;
        int minutosEstacionado = minPartida-minChegada;

        System.out.println("Tempo estacionado: "+horasEstacionado+"h "+minutosEstacionado+"min ");

        if(minutosEstacionado>=30){
            horasEstacionado++;
        }
        
        
        switch(horasEstacionado){
            case 0: System.out.println("O valor a ser pago é de: R$ "+5);
            break;
            case 1: System.out.println("O valor a ser pago é de: R$ "+horasEstacionado*5);
            break;
            case 2: System.out.println("O valor a ser pago é de: R$ "+horasEstacionado*5);
            break;
            case 3: System.out.println("O valor a ser pago é de: R$ "+17.5);
            break;
            case 4: System.out.println("O valor a ser pago é de: R$ "+25);
            break;
            default: System.out.println("O valor a ser pago é de: R$ "+(25+(horasEstacionado-4)*10));
            break;
        }

        teclado.close();
    }
}
