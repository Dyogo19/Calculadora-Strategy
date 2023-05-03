package strategy;

public class DivisaoStrategy  implements  OperacaoStrategy{

    @Override
    public double calcular(int a, int b) {
        return a / b;
    }
}
