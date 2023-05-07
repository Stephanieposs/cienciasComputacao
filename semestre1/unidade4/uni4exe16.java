import java.util.Scanner;

public class uni4exe16 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade dos homens");
        int homem1 = teclado.nextInt();
        int homem2 = teclado.nextInt();

        System.out.println("Informe a idade das mulheres");
        int mulher1 = teclado.nextInt();
        int mulher2 = teclado.nextInt();

        int homemMaisVelho = 0; 
        int homemMaisNovo = 0; 

        int mulherMaisNova = 0;
        int mulherMaisVelha = 0;


        // processo

        if(homem1>homem2){
            homemMaisVelho = homem1; 
            homemMaisNovo= homem2;
        }else{
            homemMaisNovo = homem1;
            homemMaisVelho = homem2;
        }

        if(mulher1>mulher2){
            mulherMaisVelha = mulher1;
            mulherMaisNova = mulher2;
        }else{
            mulherMaisNova = mulher1;
            mulherMaisVelha = mulher2;
        }

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("A soma do homem mais velho com a mulher mais nova é: "+soma);
        System.out.println("O produto do homem mais novo com a mulher mais velha é: "+produto);

        teclado.close();
    }
}
