import java.util.Scanner;

public class uni4exe19 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("x= ");
        int x = teclado.nextInt();

        System.out.println("y= ");
        int y = teclado.nextInt();


        // processo
        if(x==0 && y==0){
            System.out.println("Quadrante 0");
        }else{
            if(x>0 && y>0){
                System.out.println("Quadrante 1");
            }else{
                if(x>0 && y<0){
                    System.out.println("Quadrante 2");
                }else{
                    if(x<0 && y<0){
                        System.out.println("Quadrante 3");
                    }else{
                        System.out.println("Quadrante 4");
                    }
                }
            }
        }




        teclado.close();
    }
}
