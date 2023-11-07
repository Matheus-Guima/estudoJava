package pacote.projeto.modelo;

public class Titulo {
    private String nomeFilme;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int totalDeAvaliacoes; //'private' Modificardor de acesso
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public double getSomaDasAvaliacoes() {
        return  somaDasAvaliacoes;
    }
    public String getNomeFilme() {
        return nomeFilme;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("O nome do filme é: " + nomeFilme);
        System.out.println("E seu ano de Lançamento é: " + anoDeLancamento);
    }

    public void avalia(double notas) {
        somaDasAvaliacoes += notas;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
