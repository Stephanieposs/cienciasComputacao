import java.util.Scanner;

public class uni4exe26 {
    public static void main(String [] args){
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Escolha uma opção:");
      System.out.println("T: calcular a área de um triângulo de base b e altura h");
      System.out.println("Q: calcular a área de um quadrado de lado l");
      System.out.println("R: calcular a área de um retângulo de base b e altura h");
      System.out.println("C: calcular a área de um círculo de raio r");
      char opcao = teclado.next().charAt(0);

      
     
     
       switch(Character.toUpperCase(opcao)){
          case 'T': System.out.println("Digite a base e a altura do triângulo: ");
                    double baseTri = teclado.nextDouble();
                    double alturaTri = teclado.nextDouble();
                    System.out.println("Área do triângulo = "+(baseTri*alturaTri)/2);
          break;
          case 'Q': System.out.println("Digite o lado do quadrado: ");
                    double lado = teclado.nextDouble();
                    System.out.println("Área do quadrado = "+lado*lado);
          break;
          case 'R': System.out.println("Digite a base e a altura do retângulo: ");
                    double baseRet = teclado.nextDouble();
                    double alturaRet = teclado.nextDouble();
                    System.out.println("Área do retângulo = "+baseRet*alturaRet);
          break;
          case 'C': System.out.println("Digite o raio do círculo: ");
                    double raio = teclado.nextDouble();
                    System.out.println("Área do círculo = "+raio*raio*Math.PI);
          break;
          default:  System.out.println("Opção inválida");
          break;
      }



      teclado.close();
    }



}
