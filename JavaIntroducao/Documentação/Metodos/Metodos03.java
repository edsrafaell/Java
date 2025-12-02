public class Metodos03 {
    public static void Chekout(int idade){
        if (idade >= 18) {
            System.out.println("Individuo maior de idade");
        }else{
            System.out.println("Individuo menor de idade");
        }
    }

    public static void main(String[] argsz){
        Chekout(10);
    }
}
