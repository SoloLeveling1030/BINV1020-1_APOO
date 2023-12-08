import java.util.ArrayList;

public class Site {
    private String url;
    private ArrayList<ContenuVideo> contenuVideos = new ArrayList<ContenuVideo>();

    public Site(String url) {
        this.url = url;
    }
    public boolean ajouter(ContenuVideo contenuVideo){
        if (contenuVideos.contains(contenuVideo)){
            return false;
        }

            return contenuVideos.add(contenuVideo);
    }
    public boolean supprimer(ContenuVideo contenuVideo){
        if (contenuVideos.contains(contenuVideo)){
            return false;
        }
        return contenuVideos.remove(contenuVideo);
    }

    @Override
    public String
    toString() {
        return "Site" +
                "[url=" + url + "]"+'\'' +
                "Liste de contenus vidéos" + contenuVideos
                ;
    }
}
