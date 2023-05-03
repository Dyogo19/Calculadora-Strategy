package strategy;

public class RaizCubicaStrategy implements OperacaoRaizStrategy {


    @Override
    public double calcularRaiz(int a) {
        return Math.cbrt(a);
    }
}
