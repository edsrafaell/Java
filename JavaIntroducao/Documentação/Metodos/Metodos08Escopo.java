public class Metodos08Escopo {
    public class Main(String[] args){
        int x = 10;
    
    public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x); // Accessible here
  }
}
}