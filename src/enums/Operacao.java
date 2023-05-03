package enums;

import strategy.*;

public enum Operacao {
    SOMA(new SomaStrategy()),
    SUBTRACAO(new SubtracaoStrategy()),
    DIVISAO(new DivisaoStrategy()),
    MULTIPLICACAO(new MultiplicacaoStrategy());


    private final OperacaoStrategy strategy;

    private Operacao(OperacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public OperacaoStrategy getStrategy() {
        return strategy;
    }


    }
