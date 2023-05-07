import java.util.Scanner;

public class uni4exe11 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade do 1 filho");
        int filho1 = teclado.nextInt();

        System.out.println("Informe a idade do 2 filho");
        int filho2 = teclado.nextInt();

        System.out.println("Informe a idade do 3 filho");
        int filho3 = teclado.nextInt();

        // processo

        if((filho1 == filho2) && (filho1 == filho3)&& (filho2==filho3)){
            System.out.println("Eles são trigêmeos");
        }else{
            if((filho1 == filho2) || (filho1 == filho3) || (filho2==filho3)){
                System.out.println("Eles são gêmeos");
            }else{
                System.out.println("Eles são apenas irmãos");
            }
        }









        teclado.close();
    }
}
