

public class uni5exe03 {
    public static void main(String[] args) {
        
        double somaTermos = 0;
        for(int contador =1; contador<=100;contador++){
            somaTermos += 1.0/contador;
        }
        System.out.println("A soma dos termos é: "+somaTermos);
    }
}
