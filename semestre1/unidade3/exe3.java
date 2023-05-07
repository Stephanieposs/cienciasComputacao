import java.util.Scanner;

public class exe3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        
        // entradas

        System.out.println("Informe o preço da gasolina ");
        double precoGasolina = teclado.nextDouble();

        System.out.println("Informe o valor do pagamento ");
        double pagamento = teclado.nextDouble();

        // processo
        double litros = pagamento / precoGasolina;

        // saída
        System.out.println("Litros de gasolina no tanque: "+litros);


        teclado.close();
     }
}
