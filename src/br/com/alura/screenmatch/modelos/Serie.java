package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int duracaoDoEpisodio;

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracaoDoEpisodio() {
        return duracaoDoEpisodio;
    }

    public void setDuracaoDoEpisodio(int duracaoDoEpisodio) {
        this.duracaoDoEpisodio = duracaoDoEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * duracaoDoEpisodio;
    }


}
