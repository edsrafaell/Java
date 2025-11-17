package JavaIntroducao.Aula15e19;

public class Operadores4 {
    public static void main(String[] args){
        //Operador logico OU (//)
        double iphone = 5000.00;
        double saldo = 3500.00;
        double credito = 3000.00;
        boolean compra = iphone < saldo || iphone < credito || (saldo + credito) > iphone;
        System.out.println("Compra aprovada com sucesso!"+ compra);

    }
}
