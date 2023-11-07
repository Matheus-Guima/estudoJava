package pacote.projeto.calculos;

import pacote.projeto.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void somaTempoTotal(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
