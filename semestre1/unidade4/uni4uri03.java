import java.util.Scanner;

public class uni4uri03 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        double x = teclado.nextDouble();
        double y = teclado.nextDouble();


        // processo
        if(x==0 && y==0){
            System.out.println("Origem");
        }else{
            if(x==0 && y!=0){
                System.out.println("Eixo Y");
            }else{
                if(x!=0 && y==0){
                    System.out.println("Eixo X");
                }else{
                    if(x>0 && y>0){
                        System.out.println("Q1");
                    }else{
                        if(x<0 && y>0){
                            System.out.println("Q2");
                        }else{
                            if(x<0 && y<0){
                                System.out.println("Q3");
                            }else{
                                System.out.println("Q4");
                            }
                        }
                    }
                }
            }
        }


        teclado.close();
    }
}
