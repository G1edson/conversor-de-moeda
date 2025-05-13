package dev.gledson;

public class Conversor {

    private double valor;
    private double valorConvertido;

    public Conversor(double valor, double valorConvertido) {
        this.valor = valor;
        this.valorConvertido = valorConvertido;
    }

    public Conversor() {}


    public Double converter(String moeda, Double valor){
        return valor;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }


}
