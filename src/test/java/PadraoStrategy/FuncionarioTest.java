package PadraoStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTest {

    private Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    @Test
    public void testCalcularEficiencia() {
        funcionario.calcularEficiencia(10, 5);
        assertEquals(15, funcionario.getDesempenho(), 0.001);
    }

    @Test
    public void testCalcularPrecisao() {
        funcionario.calcularPrecisao(10, 5);
        assertEquals(5, funcionario.getDesempenho(), 0.001);
    }

    @Test
    public void testCalcularPontualidade() {
        funcionario.calcularPontualidade(10, 2);
        assertEquals(5, funcionario.getDesempenho(), 0.001);
    }

    @Test
    public void testCalcularProdutividade() {
        funcionario.calcularProdutividade(10, 5);
        assertEquals(50, funcionario.getDesempenho(), 0.001);
    }

    @Test
    public void testCalcularMediaDesempenho() {
        funcionario.calcularMediaDesempenho(10, 5);
        assertEquals(7.5, funcionario.getDesempenho(), 0.001);
    }

    @Test
    public void testCalcularPontualidadeDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.calcularPontualidade(10, 0);
        });
    }
}
