package JavaIntroducao.Aula20a26;

import javax.sound.sampled.SourceDataLine;

public class Condicoes03 {
    public static void main(String[] args) {
    //Operador Ternário
    double salario = 6000.00;
    String mensagemDoar = "Eu vou doar 500 reais para caridade.";
    String mensagemNaoDoar = "Ainda não tenho condições de doar.";
    System.out.println((salario >= 5000) ? mensagemDoar : mensagemNaoDoar);
    }1
}
