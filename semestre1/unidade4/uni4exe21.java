import java.util.Scanner;

public class uni4exe21 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a sua massa em kg e a altura em metros");
        double massa = teclado.nextDouble();
        double altura = teclado.nextDouble();

        // processo
        double imc = massa / (altura*altura);

        System.out.println("IMC: "+imc);
        if(imc<18.5){
            System.out.println("Magreza");
        }else{
            if(imc>18.5 && imc<24.9){
                System.out.println("Saudável");
            }else{
                if(imc>25 && imc<29.9){
                    System.out.println("Sobrepeso");
                }else{
                    if(imc>30 && imc<34.9){
                        System.out.println("Obesidade grau I");
                    }else{
                        if(imc>35 && imc<39.9){
                            System.out.println("Obesidade grau II (severa)");
                        }else{
                            System.out.println("Obesidade grau III (mórbida)");
                        }
                    }
                }
            }
        }






        teclado.close();
    }
}
