public class Metodos07Escopo {
    //Uma variavel iniciada em um for loop, quando se encerra o laço, ela é destruida
    //ex
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(i);

        }
    }
}
