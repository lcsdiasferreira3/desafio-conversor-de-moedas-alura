package br.com.alura.conversorDeMoedas.modelos;

import java.util.Map;

public class Moeda {
    private String simbolo;
    private Map<String, Double> conversoes;


    public Moeda(String simbolo){
        this.simbolo = simbolo;
    }

    public Moeda(MoedaExchangerate meuMoedaExchangerate){
        this.simbolo = meuMoedaExchangerate.base_code();
        this.conversoes = meuMoedaExchangerate.conversion_rates();
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Map<String, Double> getConversoes() {
        return conversoes;
    }

    public void setConversoes(Map<String, Double> conversoes) {
        this.conversoes = conversoes;
    }

    @Override
    public String toString() {
        return "Moeda base: " + simbolo + " Valor de cada moeda: " + conversoes;
    }

}


