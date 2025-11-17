package JavaIntroducao.Aula20a26;

public class Condicoes01 {
    public static void main(String[] args){
        //Estrutura de condiçoes if
        int idade = 18;
        if (idade >= 18){
            System.out.println("Ele é maior de idade.");
        }
        if (idade < 18){
            System.out.println("Ele é menor de idade.");
        }

        //Versão mais expecifica
        int idade2 = 14;
        boolean isAutorizadoComprarBebida = idade2 >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("Ele pode comprar bebida alcoólica.");
        }
        
        if (!isAutorizadoComprarBebida){
            System.out.println("Ele não pode comprar bebida alcoólica.");
        }
    }
}
