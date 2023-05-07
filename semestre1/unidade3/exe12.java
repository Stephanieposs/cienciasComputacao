import java.text.DecimalFormat;
import java.util.Scanner;

public class exe12 {
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        // entrada 
        System.out.println("Nome do funcionário: ");
        String nome = teclado.next();
        
        System.out.println("Número de horas trabalhadas: ");
        double horas = teclado.nextDouble();

        System.out.println("Número de dependentes: ");
        double dependentes = teclado.nextDouble();

        // processo

    
        double salarioTrabalho = horas*10;
        double salarioFamilia = dependentes*60;
        
        double salarioBruto = salarioFamilia+salarioTrabalho; 

        // descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda

        double salarioLiquido = salarioBruto - (salarioTrabalho-(salarioTrabalho*0.135));

        // saida 
        System.out.println("O nome do funcionário é: "+nome);
        System.out.println("O salário bruto é: "+df.format(salarioBruto));
        System.out.println("O salário liquido é: "+df.format(salarioLiquido));

        teclado.close();

    }
}

