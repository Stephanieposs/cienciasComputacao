import java.util.Scanner;

public class uni4exe10 {
    public static void main(String[] args){
        //** filhos: Marquinhos, Zezinho e Luluzinha. ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates. */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade do Marquinhos");
        int marquinhos = teclado.nextInt();

        System.out.println("Informe a idade do Zezinho");
        int zezinho = teclado.nextInt();

        System.out.println("Informe a idade da Luluzinha");
        int luluzinha = teclado.nextInt();

        // processo
        if((marquinhos>zezinho)&&(luluzinha>zezinho)){
            System.out.println("Zezinho é o caçula");
        }else{
            if((zezinho>marquinhos)&&(luluzinha>marquinhos)){
                System.out.println("Marquinhos é o caçula");
            }else{
                System.out.println("Luluzinha é a caçula");
            }
        }


        teclado.close();

        }


        
    }

