import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {
        double valor1 = 2;
        double valor2 = 2;
        double resultadoEsperado = 4;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.soma(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {
        double valor1 = 5;
        double valor2 = 2;
        double resultadoEsperado = 2.5;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divide(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros() {
        double valor1 = 3;
        double valor2 = 2;
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.multiplica(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        double valor1 = 7.5;
        double valor2 = 2.5;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divide(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoNumerosForemInteiros() {
        double valor1 = 10;
        double valor2 = 3;
        double esperado = 7;
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.subtrai(valor1, valor2);

        Assert.assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void deveCalcularCorretamenteRaizQuadradaDeNumeroPositivo() {
        double valor = 25;
        double resultadoEsperado = 5;
        Calculadora calculadora = new Calculadora();

        double resultadoCalculado = calculadora.raizQuadrada(valor);

        Assert.assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
    }

    @Test
    public void deveCalcularCorretamenteExponenciacaoComNumerosPositivos() {
        double base = 2;
        double expoente = 4;
        double resultadoEsperado = 16;
        Calculadora calculadora = new Calculadora();

        double resultadoCalculado = calculadora.exponenciacao(base, expoente);

        Assert.assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
    }

    @Test
    public void deveRetornarUmQuandoExpoenteForZero() {
        double base = 9;
        double expoente = 0;
        double resultadoEsperado = 1;
        Calculadora calculadora = new Calculadora();

        double resultadoCalculado = calculadora.exponenciacao(base, expoente);

        Assert.assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
    }

    @Test
    public void deveCalcularCorretamenteASomaDasRaizes() {
        double valor1 = 1;
        double valor2 = -5;
        double valor3 = 6;
        double resultadoEsperado = 5;
        Calculadora calculadora = new Calculadora();

        double resultadoCalculado = calculadora.bhaskara(valor1, valor2, valor3);

        Assert.assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
    }
}