public class Metodos08Escopo {
    //Variaveis criada na classe principal, pode ser ultilizado por outras classes
int x = 5; // Class variable

    public static void main(String[] args) {
        Metodos08Escopo myObj = new Metodos08Escopo();
        System.out.println(myObj.x); // Accessible here
    }
}
