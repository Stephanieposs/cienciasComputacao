import java.util.Scanner;

public class uni4exe01 {
    
    
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Informe as horas trabalhadas no mês: ");
        int horasMes = teclado.nextInt();

        System.out.println("Informe o valor da hora R$: ");
        double valorHora = teclado.nextDouble();


        // processo 

        double salario = horasMes*valorHora;

        if (horasMes > 160) {
            double extra = (horasMes - 160) * (valorHora/2);
            
            // salario total
            salario = salario + extra; 
        }

        // saida

        System.out.println("O salário total é R$:"+salario);


        teclado.close();

    }
    
    
    







   

}
