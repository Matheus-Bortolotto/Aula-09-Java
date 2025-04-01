package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VeiculoTest {

    @Test
    public void testCalculoCustoSemDesconto() {
        Veiculo carro = new Veiculo("Sedan", 100);
        assertEquals(300, carro.calcularCusto(3));
    }

    @Test
    public void testCalculoCustoComDesconto() {
        Veiculo carro = new Veiculo("Sedan", 100);
        assertEquals(630, carro.calcularCusto(7)); // 7 * 100 * 0.9
    }

    @Test
    public void testCalculoCustoComZeroDias() {
        Veiculo carro = new Veiculo("Sedan", 100);
        assertEquals(0, carro.calcularCusto(0));
    }

    @Test
    public void testCalculoCustoComDiasNegativos() {
        Veiculo carro = new Veiculo("Sedan", 100);
        assertThrows(IllegalArgumentException.class, () -> carro.calcularCusto(-1));
    }

    @Test
    public void testCalculoMultaSemAtraso() {
        Veiculo carro = new Veiculo("Sedan", 100);
        assertEquals(0, carro.calcularMulta(0));
    }

    @Test
    public void testCalculoMultaComAtraso() {
        Veiculo carro = new Veiculo("Sedan", 100);
        assertEquals(150, carro.calcularMulta(1)); // 1 dia de atraso * 150
    }

    @Test
    public void testCalculoMultaComAtrasoMultiplo() {
        Veiculo carro = new Veiculo("Sedan", 100);
        assertEquals(450, carro.calcularMulta(3)); // 3 * 150
    }

    @Test
    public void testValorDiariaNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Veiculo("SUV", -50));
    }
}



