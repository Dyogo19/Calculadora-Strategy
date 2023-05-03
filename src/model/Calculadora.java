package model;

import enums.Operacao;
import enums.OperacaoRaiz;
import strategy.OperacaoRaizStrategy;
import strategy.OperacaoStrategy;

public class Calculadora {

    public double calcular(Operacao operacao, int a , int b){
        OperacaoStrategy estrategiaCalculo = operacao.getStrategy();
        return estrategiaCalculo.calcular(a , b);
    }

    public double calcularRaiz(OperacaoRaiz operacaoRaiz , int a){
        OperacaoRaizStrategy estrategiaDeRaiz = operacaoRaiz.getRaizStrategy();
        return estrategiaDeRaiz.calcularRaiz(a);
    }




}
