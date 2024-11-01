package PadraoStrategy;

public class CalculadoraDesempenho {

    private float metrica1;
    private float metrica2;

    public CalculadoraDesempenho(float metrica1, float metrica2) {
        this.metrica1 = metrica1;
        this.metrica2 = metrica2;
    }

    public float calcular(Operacao operacao) {
        return operacao.calcular(metrica1, metrica2);
    }
}
