package JavaIntroducao.Aula15e19;

public class Operadores5 {
    public static void main(String[] args) {
    //Operador de atrinuição
    double salario = 1500.0;
    salario += 500; // salario = salario + 500
    salario -= 1000; // salario = salario - 1000
    salario *= 2; // salario = salario * 2
    salario /= 2; // salario = salario / 2
    System.out.println("O salário final é: " + salario); 
    
    //++ e --
    int contador = 10; 
    contador ++;
    System.out.println("Contador após ++: " + contador);

    int contador2 = 10;
    System.out.println("Contador2: " + contador2--);
    System.out.println("Contador2: " + contador2);
}
}

