import java.util.Scanner;

public class uni4exe06 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe uma letra");
        char letra = teclado.next().charAt(0);

        String resposta;

        // convertendo pra maiusculo
        letra = Character.toUpperCase(letra);
        // processo 

        if(letra == 'M'){
            resposta = "Masculino";    
                 
        }else{
            if(letra == 'F'){
                resposta = "Feminino";
            }else{
                if(letra == 'I'){
                    resposta = "Não informado";
                }else{
                    resposta = "Entrada incorreta";
                    
                }
            }
            
        }
        
        System.out.println(resposta);


        teclado.close();
    }
}
