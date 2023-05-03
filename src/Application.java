import enums.Operacao;
import enums.OperacaoRaiz;
import model.Calculadora;
import strategy.SomaStrategy;

public class Application {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("SOMA = " + calculadora.calcular(Operacao.SOMA , 5 , 5));
        System.out.println("SUBTRACAO = " + calculadora.calcular(Operacao.SUBTRACAO, 10 , 5));
        System.out.println("MULTIPLICACAO = " + calculadora.calcular(Operacao.MULTIPLICACAO , 4 ,6));
        System.out.println("DIVISAO = " + calculadora.calcular(Operacao.DIVISAO , 10 , 2));
        System.out.println("RAIZ QUADRADA = " + calculadora.calcularRaiz(OperacaoRaiz.RAIZQUADRADA , 144));
        System.out.println("RAIZ CUBICA = " + calculadora.calcularRaiz(OperacaoRaiz.RAIZCUBICA , 25));
    }

}