package pacote.projeto.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificacao classificacao) {
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Ok avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para ver mais tarde");
        }
    }
}
