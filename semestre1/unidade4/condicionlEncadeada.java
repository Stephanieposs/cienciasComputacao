public class condicionlEncadeada {
    public static void main(String [] args){

        int idade = 5;

        if (idade >= 18){
            System.out.println("Adulto");
        } else {
            if (idade >= 6){
                System.out.println("Adolescente");
            } else {
                System.out.println("Infantil");
            }
        }
        System.out.println("FIM");
    }
}
