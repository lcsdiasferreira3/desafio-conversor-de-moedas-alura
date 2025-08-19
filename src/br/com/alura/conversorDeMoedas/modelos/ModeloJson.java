package br.com.alura.conversorDeMoedas.modelos;

import java.util.Map;

public class ModeloJson {
    private String moeda_base;
    private Map<String, Double> moeda_a_ser_convertida;
    private Double valor_a_ser_convertido;
    private Double resultado;
    private String data_hora;


    public ModeloJson(Map<String, Double> moeda_a_ser_convertida, String moeda_base, Double valor_a_ser_convertido, String data_hora, Double resultado) {
        this.moeda_a_ser_convertida = moeda_a_ser_convertida;
        this.moeda_base = moeda_base;
        this.valor_a_ser_convertido = valor_a_ser_convertido;
        this.data_hora = data_hora;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "{ Moeda_base: " + this.moeda_base + " Moeda_a_ser_convertida: " + this.moeda_a_ser_convertida + " Valor_a_ser_convertido: " + this.valor_a_ser_convertido + " Resultado: " + this.resultado + " Data_hora: " + this.data_hora + " } ";
    }
}
