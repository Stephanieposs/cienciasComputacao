public class uni5exe11 {
    public static void main(String[] args) {
        //após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior
        //calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia)

        int biscoitosQuebrados = 0;
        int biscoitosHora = 3;
        for(int contador = 1; contador<=16; contador++){
            switch(contador){
                case 1: biscoitosQuebrados++;
                break;
                case 2: biscoitosQuebrados+=3;
                        biscoitosHora+=3;
                break;
                default: 
                  biscoitosHora=biscoitosHora*3;
                  biscoitosQuebrados+=biscoitosHora;
                         

            }
            
        }

        System.out.println("biscoitos quebrados no final de cada dia: "+biscoitosQuebrados);




    }
}
