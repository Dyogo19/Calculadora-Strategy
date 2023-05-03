package strategy;

public class RaizQuadradaStrategy implements OperacaoRaizStrategy{
    @Override
    public double calcularRaiz(int a) {
        return Math.sqrt(a);
    }
}
