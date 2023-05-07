import java.util.Scanner;

public class uni4exe12 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o lado 1");
        double lado1 = teclado.nextDouble();

        System.out.println("Informe o lado 2");
        double lado2 = teclado.nextDouble();

        System.out.println("Informe o lado 3");
        double lado3 = teclado.nextDouble();

        // processo
        if((lado1>(lado2+lado3))||(lado2>(lado1+lado3))||(lado3>(lado1+lado2))){
            System.out.println("Não podem ser comprimentos dos lados de um triânglo");
        }else{
            if((lado1==lado2)&&(lado1==lado3)){
                System.out.println("É um triângulo equilátero");
            }else{
                if((lado1==lado2)||(lado1==lado3)||(lado2==lado3)){
                    System.out.println("É um triângulo isósceles");
                }else{
                    System.out.println("É um triângulo escaleno");
                }
            }
        }




        teclado.close();
    }
}
