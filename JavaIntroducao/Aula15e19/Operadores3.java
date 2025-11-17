package JavaIntroducao.Aula15e19;

public class Operadores3 {
    public static void main(String[] args) {
        //Comparadores lógicos && (AND) e || (OR)
        int idade =20;
        int idade2 = 35;

        boolean maiorIdade = (idade >=18) && (idade2 < 30);
        System.out.println("Ele é Jovem: " + maiorIdade); // true
    }
}
