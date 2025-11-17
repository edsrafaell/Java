package JavaIntroducao.Aula15e19;
public class Operadores2 {
    public static void main(String[]args){
        // % ++ --
        int numero1 = 10;
        int numero2 = 15;

        int resto = numero2 % numero1;
        System.out.println("Resto da divisão: " + resto); //Resto da divisão: 5

        //Operadores logicos < , > e == ou >= e <=, !=
        boolean resultado = numero1 < numero2;
        System.out.println("Resultado de 10 < 15: " + resultado); // true
        boolean diferente = numero1 != numero2;
        System.out.println("Resultado de 10 != 15: " + diferente); // true
        boolean igual = numero1 == numero2;
        System.out.println("Resultado de 10 é a 15: " + igual); // false
        
    }
}
