public class Metodos08Escopo {
    public class Main {
    int x = 5; // Class variable

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x); // Accessible here
    }
    }
}