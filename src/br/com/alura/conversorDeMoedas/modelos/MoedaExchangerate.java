package br.com.alura.conversorDeMoedas.modelos;

import java.util.Map;

public record MoedaExchangerate(String base_code, Map<String, Double> conversion_rates) {

}
