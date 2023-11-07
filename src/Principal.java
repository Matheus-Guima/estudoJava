import pacote.projeto.calculos.CalculadoraDeTempo;
import pacote.projeto.calculos.FiltroRecomendacao;
import pacote.projeto.modelo.Episodios;
import pacote.projeto.modelo.Filme;
import pacote.projeto.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Episodios episodios = new Episodios();

        meuFilme.setNomeFilme("Teste meu filme");
        meuFilme.setAnoDeLancamento(1930);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9);
        meuFilme.avalia(8);

        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(8);
        minhaSerie.setMinutosPorTemporada(40);
        minhaSerie.setNomeFilme("Supernatural");

        episodios.setNome("Coisas Doidas");
        episodios.setSerie(minhaSerie);
        episodios.setTotalDeVisualizacoes(100);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.somaTempoTotal(meuFilme);
        filtro.filtra(meuFilme);
        filtro.filtra(episodios);
        calculadoraDeTempo.somaTempoTotal(minhaSerie);

        System.out.println("Retorna soma das avaliações: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Retorna total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());
        System.out.println(meuFilme.pegaMedia());

        System.out.println("Duração em minutos da série: " + minhaSerie.getDuracaoEmMinutos());
        System.out.println("Tempo total para gastar é: " + calculadoraDeTempo.getTempoTotal());

    }
}
