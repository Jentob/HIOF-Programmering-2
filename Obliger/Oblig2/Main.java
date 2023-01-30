import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        TVSerie breakingBad = new TVSerie("Breaking Bad", "A chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine with a former student in order to secure his family's future.", 2008, 1, 20);
        breakingBad.leggTilEpisode(new Episode("Pilot", 1, 1, 3480));
        breakingBad.leggTilEpisode(new Episode("Cat's in the Bag...", 2, 1, 2880));
        breakingBad.leggTilEpisode(new Episode("...And the Bag's in the River", 3, 1, 2880));
        System.out.println(breakingBad);
        System.out.println(breakingBad.getEpisoder().get(0).toString());
        System.out.println();

        TVSerie serie = new TVSerie("Tittel", "Beskrivelse", 2000, 1, 1);
        serie.leggTilEpisode(new Episode("Episode", 2, 3, 120));
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 20; j++) {
                serie.leggTilEpisode(new Episode("Episode " + j, j, i, rand.nextInt(3600 - 120) + 120));
            }
        }
        System.out.println(serie);
        System.out.println(serie.getEpisoder().get(20).toString());
        System.out.println();
        ArrayList<Episode> sesong4AvSerie = serie.hentEpisoderISesong(4);
        for(Episode episode : sesong4AvSerie) {
            System.out.println(episode);
        }
        System.out.println();

        serie.oppdaterGjennomsnittligSpilletid();
        System.out.println("Gjennomsnittlig spilletid: " + serie.getGjennomsnittligSpilletid() / 60 + " min");
    }
}
