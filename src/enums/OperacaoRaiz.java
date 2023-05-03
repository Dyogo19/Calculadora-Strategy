package enums;

import strategy.OperacaoRaizStrategy;
import strategy.RaizCubicaStrategy;
import strategy.RaizQuadradaStrategy;

public enum OperacaoRaiz {

    RAIZQUADRADA(new RaizQuadradaStrategy()),
    RAIZCUBICA(new RaizCubicaStrategy());
    private final OperacaoRaizStrategy raizStrategy;

    private OperacaoRaiz(OperacaoRaizStrategy raizStrategy) {
        this.raizStrategy = raizStrategy;
    }

    public OperacaoRaizStrategy getRaizStrategy() {
        return raizStrategy;
    }

}

