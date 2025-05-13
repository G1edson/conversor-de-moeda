package dev.gledson;

import java.util.Map;

public class Moedas {
    private String resultado;
    private String codigo;
    private Map<String, Double> conversoes;

    public String getResult() {
        return resultado;
    }

    public String getBase_code() {
        return codigo;
    }

    public Map<String, Double> getConversoes() {
        return conversoes;
    }

    @Override
    public String toString() {
        return "Base: " + codigo + ", Rates: " + conversoes.toString();
    }
}
