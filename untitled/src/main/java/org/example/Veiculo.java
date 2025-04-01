package org.example;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo.");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }
    public double calcularCusto(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("O número de dias não pode ser negativo.");
        }
        double custoTotal = dias * valorDiaria;
        return desconto(dias) ? custoTotal * 0.9 : custoTotal;
    }

    private boolean desconto(int dias) {
        return dias >= 7;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso <= 0) {
            return 0;
        }
        return diasAtraso * (valorDiaria * 1.5);
    }
}




