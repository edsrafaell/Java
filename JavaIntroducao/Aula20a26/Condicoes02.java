package JavaIntroducao.Aula20a26;

public class Condicoes02 {
    public static void main(String[] args){
        //Estrutura de condições  if...else
        int idade = 16;
        if (idade >= 18){
            System.out.println("Ele é maior de idade.");
        } else {
            System.out.println("Ele é menor de idade.");
        }
    

    
        //Estrutura de condições if...else if...else
        /*idade < 15 juvenil
         * idade >= 15 e 18 adolescente
         * idade >= 18 adulto 
         */

        int idade2 = 20;
        if (idade2 < 15){
            System.out.println("Categoria juvenil.");
        } else if (idade2 >= 15 && idade2 < 18){
            System.out.println("Categoria adolescente.");
        } else {
            System.out.println("Categoria adulto.");
        
    }
}
}