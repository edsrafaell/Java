package JavaIntroducao.Aula20a26;

public class Condicoes04 {
    public static void main (String[] args){
        //Estrutura de Tabelas verdade e exercício
        //&& (AND) - Tpdas as condições tem que ser verdade
        // ||(OR) - Pelo menos uma das condições tem que ser verdade
        // ! (NOT) - Nega uma condição

        int idade = 17;

        if (idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Pode votar, mais não é obrigatorio.");
        }else if(idade >= 18 && idade <= 70){
            System.out.println("Voto obrigatorio.");
        }
    }
}
