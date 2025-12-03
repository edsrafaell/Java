public class Metodos06 {
    static double Somar(double x, double y){
        return x + y;
    }

    static int Somar(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        int somaInt = Somar(10 ,10 );
        double somarDouble = Somar(1.3, 1.5);

        System.out.println(somaInt);
        System.out.println(somarDouble);
    }
}
