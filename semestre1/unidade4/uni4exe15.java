import java.util.Scanner;

public class uni4exe15 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de meses que o funcionáfio foi admitido");
        int mesesAdmitido = teclado.nextInt();

        // processo

        if(mesesAdmitido<12){
            System.out.println("5% de reajuste");
        }else{
            if(mesesAdmitido>12 || mesesAdmitido<48){
                System.out.println("7% de reajuste");
            }
        }


        teclado.close();
    }
}
