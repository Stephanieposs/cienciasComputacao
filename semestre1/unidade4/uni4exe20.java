import java.util.Scanner;

public class uni4exe20 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota das 3 provas e a média dos exercícios");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double notaExe = teclado.nextDouble();

        double media = (nota1+nota2*2+nota3*3+notaExe)/7;

        if(media>=9){
            System.out.println("Conceito A");
            System.out.println("Aprovado");
        }else{
            if(media>=7.5 && media<9){
                System.out.println("Conceito B");
                System.out.println("Aprovado");
            }else{
                if(media>=6 && media<7.5){
                    System.out.println("Conceito C");
                    System.out.println("Aprovado");
                }else{
                    if(media>= 4 && media<6){
                        System.out.println("Conceito D");
                        System.out.println("Reprovado");
                    }else{
                        System.out.println("Conceito E");
                        System.out.println("Reprovado");
                    }
                }
            }
        }





        teclado.close();
    }
}
