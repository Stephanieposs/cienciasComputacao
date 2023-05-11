import java.util.Scanner;

public class uni5exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int soma20=0;
        System.out.println("informe a quantidade de alunos");
        int n = teclado.nextInt();
        
        for(int contador = 0; contador<=n; contador++){
            System.out.println("informe o nome e a idade");
            String nome = teclado.next();
            int idade = teclado.nextInt();
            if(idade== 18){
                System.out.println(nome);
            }
            if(idade>20){
                soma20++;
            }
        }
        System.out.println("quantidade de alunos com mais de 20 anos: "+soma20);




        teclado.close();
    }
}
