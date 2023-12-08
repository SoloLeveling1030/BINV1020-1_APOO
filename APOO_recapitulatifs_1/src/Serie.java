public class Serie extends ContenuVideo {
    private int nombreEpisodes;

    public Serie(String titre, String categorie, int nombreEpisodes) {
        super(titre, categorie);
        this.nombreEpisodes = nombreEpisodes;
    }

    public void setNombreEpisodes(int nombreEpisodes) {
        this.nombreEpisodes = nombreEpisodes;
    }

}
