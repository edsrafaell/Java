package JavaIntroducao.Aula10a14;

public class TiposPrimitivos3 {
    public static void main(String[] args){
    double salarioDouble = 2000.0; //8 bytes
    float salarioFloat = 2500.0f; //4 bytes / Especificar o f no final do valor

    System.out.println("Salário Double: " + salarioDouble);
    System.out.println("Salário Float: " + salarioFloat);

        
    //Força cast
    float salarioFloat2 = (float) 3000.0; // Força o cast de double para float
    int salarioInt = (int) 100000000.0; // Força o cast de double para int (perde a parte decimal)
    System.out.println("Salário Float 2: " + salarioFloat2);
    System.out.println("Salário Int: " + salarioInt);

    long numeroLong = (long) 100000.00;     // Força o cast de double para long
    System.out.println("Número Long: " + numeroLong);
    }
}
