package Documentação.Arrays;

public class Arrays01 {
    public static void main(String[] args){
        //Arrays 
        //Percorrer um  array usando o while
        byte contador = 0; 
        String[] cars = {"Ford", "Chevrolet", "Honda", "WolksVagen"};
        while (contador < cars.length){
            System.out.println(cars[contador]);
            contador++;
        }
        System.out.println("Acabou");

        //Percorrr um array usando o for 
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
