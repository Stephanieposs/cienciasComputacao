public class uni5exe04 {
    public static void main(String[] args) {
        
        int numerador = 3;
        int denominador =2;
        double somaTermos = 0;
        int aux =4;
        for(int contador = 1; contador<=20;contador++){
            somaTermos += (double)numerador/denominador;
            numerador+=2;
            denominador+=aux;
            aux +=2;
        }
        System.out.println("A soma dos termos é: "+somaTermos);
    }
}
