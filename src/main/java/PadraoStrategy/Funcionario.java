package PadraoStrategy;

public class Funcionario {

    private float desempenho;

    public float getDesempenho() {
        return desempenho;
    }

    public void calcularEficiencia(float metrica1, float metrica2) {
        CalculadoraDesempenho calculadora = new CalculadoraDesempenho(metrica1, metrica2);
        this.desempenho = calculadora.calcular(new OperacaoSomar());
    }

    public void calcularPrecisao(float metrica1, float metrica2) {
        CalculadoraDesempenho calculadora = new CalculadoraDesempenho(metrica1, metrica2);
        this.desempenho = calculadora.calcular(new OperacaoSubtrair());
    }

    public void calcularPontualidade(float metrica1, float metrica2) {
        CalculadoraDesempenho calculadora = new CalculadoraDesempenho(metrica1, metrica2);
        this.desempenho = calculadora.calcular(new OperacaoDividir());
    }

    public void calcularProdutividade(float metrica1, float metrica2) {
        CalculadoraDesempenho calculadora = new CalculadoraDesempenho(metrica1, metrica2);
        this.desempenho = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaDesempenho(float metrica1, float metrica2) {
        CalculadoraDesempenho calculadora = new CalculadoraDesempenho(metrica1, metrica2);
        this.desempenho = calculadora.calcular(new OperacaoMedia());
    }

}
