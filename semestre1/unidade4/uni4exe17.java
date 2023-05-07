import java.util.Scanner;

public class uni4exe17 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a renda anual");
        double rendaAnual = teclado.nextDouble();

        System.out.println("Informe o número de dependentes do contribuinte");
        int dependentes = teclado.nextInt();

        // processo

        double rendaLiquida = rendaAnual - (0.02*rendaAnual*dependentes);

        if(rendaLiquida<2000){
            System.out.println("Não paga imposto");
        }else{
            if(rendaLiquida>2000 && rendaLiquida<5000){
                System.out.println("o imposto é de: "+(rendaLiquida*1.05));
            }else{
                if(rendaLiquida>5000 && rendaLiquida<10000){
                    System.out.println("O imposto é de: "+(rendaLiquida*1.1));
                }else{
                    System.out.println("O imposto é de: "+ (rendaLiquida*1.15));
                }
            }
        }



        teclado.close();
    }
}
