package JavaIntroducao.Aula10a14;

public class TiposPrimitivos2 {
    public static void main(String[] args){
    int idade = 18; // 4 bits
    long salarioLong = 10000; // 8 bytes
    double salarioDoubel = 2000; //8 bytes
    float salarioFloat = 2500; //4 bytes
    byte idadeByte = 18; // 1 byte
    short idadeShort = 18;  // 2 bytes
    boolean verdadeiro = true; // 1 bit
    boolean falso = false; // 1 bit
    char caractere = 'A'; // 2 bytes

    System.out.println(idade);
    System.out.println(salarioLong);
    System.out.println(salarioDoubel);
    System.out.println(salarioFloat);
    System.out.println(idadeByte);
    System.out.println(idadeShort);
    System.out.println(verdadeiro);
    System.out.println(falso);
    System.out.println("O caractere é: " + caractere);
    }
}
