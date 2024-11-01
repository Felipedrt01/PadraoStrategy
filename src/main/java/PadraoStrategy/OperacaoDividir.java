package PadraoStrategy;

public class OperacaoDividir implements Operacao {

    public float calcular(float metrica1, float metrica2) {
        if (metrica2 == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        } else {
            return metrica1 / metrica2;
        }
    }
}
