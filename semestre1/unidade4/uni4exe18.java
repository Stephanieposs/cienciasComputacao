import java.util.Scanner;

public class uni4exe18 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o dia do vencimento");
        int diaVencimento = teclado.nextInt();
        System.out.println("Informe o dia do pagamento");
        int diaPagamento = teclado.nextInt();
        System.out.println("Informe o valor da prestação");
        double valorPrestação = teclado.nextDouble();

        // processo
        if(diaPagamento<diaVencimento){
            System.out.println("O valor a ser pago é de: "+(valorPrestação*0.9));
            System.out.println("O pagamento esta em dia");
        }else{
            if(diaPagamento>=10 && diaPagamento<=15){
                System.out.println("O valor a ser pago é de: "+valorPrestação);
            }else{
                System.out.println("O valor a ser pago é de: "+(valorPrestação+(0.02*valorPrestação*(diaPagamento-10))));
            }
        }





        teclado.close();
    }
}
