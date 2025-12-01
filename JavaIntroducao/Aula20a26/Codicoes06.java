public class Codicoes06 {
    public static void main(String[] args){
        //Switch case
        int diaSemana = 3;
        String diaNome;

        switch (diaSemana){
            case 1:
                diaNome = "Domingo";
                break;
            case 2:
                diaNome = "Segunda-feira";
                break;
            case 3:
                diaNome = "Terça-feira";
                break;
            case 4:
                diaNome = "Quarta-feira";
                break;
            case 5:
                diaNome = "Quinta-feira";
                break;
            case 6:
                diaNome = "Sexta-feira";
                break;
            case 7:
                diaNome = "Sábado";
                break;
            default:
                diaNome = "Dia inválido";
                break;
        }
        System.out.println("O dia da semana é: " + diaNome);

        char Sexo = 'M';
        switch (Sexo) {
            case 'M':
                System.out.println("Masculino");
                break; 
            case 'F':
                System.out.println("Feminino");
                break;
        }
    }
}