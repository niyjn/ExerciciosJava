package Lista;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BombaDeCombustivel {

    private String tipoDeCombustivel;
    private BigDecimal valorLitro;
    private BigDecimal quantidadeLitrosBomba;

    public BombaDeCombustivel(String tipoDeCombustivel, BigDecimal valorLitro) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeLitrosBomba = BigDecimal.ZERO;
    }

    public void abastecerBomba(double quantidade) {
        validarPositivo(quantidade);
        this.quantidadeLitrosBomba = this.quantidadeLitrosBomba.add(BigDecimal.valueOf(quantidade));
        System.out.println("Bomba abastecida. Total em estoque: " + quantidadeLitrosBomba + " litros.");
    }

    public void abastecerVeiculoPorValor(double valorPago) {
        validarPositivo(valorPago);
        BigDecimal valor = BigDecimal.valueOf(valorPago);
        BigDecimal litrosEntregues = valor.divide(this.valorLitro, 3, RoundingMode.HALF_DOWN);

        validarEstoque(litrosEntregues);

        this.quantidadeLitrosBomba = this.quantidadeLitrosBomba.subtract(litrosEntregues);
        System.out.println("Abastecido: " + litrosEntregues + " litros. Valor: R$ " + valor);
    }

    public void abastecerVeiculoPorLitro(double litros) {
        validarPositivo(litros);
        BigDecimal litrosSolicitados = BigDecimal.valueOf(litros);
        validarEstoque(litrosSolicitados);

        BigDecimal valorTotal = litrosSolicitados.multiply(this.valorLitro);

        this.quantidadeLitrosBomba = this.quantidadeLitrosBomba.subtract(litrosSolicitados);
        System.out.println("Abastecido: " + litrosSolicitados + " litros. Total a pagar: R$ " + valorTotal);
    }

    private void validarEstoque(BigDecimal quantidade) {
        if (quantidade.compareTo(quantidadeLitrosBomba) > 0) {
            throw new IllegalArgumentException("Quantidade de litros insuficiente na bomba.");
        }
    }

    private void validarPositivo(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
    }

    public static void main(String[] args) {
        BombaDeCombustivel gasolina = new BombaDeCombustivel("Gasolina Comum", new BigDecimal("5.50"));

        try {
            gasolina.abastecerBomba(100.0);
            gasolina.abastecerVeiculoPorValor(50.0);
            gasolina.abastecerVeiculoPorLitro(10.0);
            gasolina.abastecerVeiculoPorLitro(100.0);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}