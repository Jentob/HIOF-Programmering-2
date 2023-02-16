import java.time.LocalDate;
import java.util.ArrayList;

public class TVSerie {
    private String tittel;
    private String beskrivelse;
    private LocalDate utgivelsesdato;
    private final ArrayList<Episode> episoder = new ArrayList<>();
    private int gjennomsnittligSpilletid;
    private int antallSessonger = 0;

    public TVSerie(String tittel, String beskrivelse, String utgivelsesdato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = LocalDate.parse(utgivelsesdato);
    }

    public String getTittel() {return tittel;}
    public String getBeskrivelse() {return beskrivelse;}
    public LocalDate getUtgivelsedato() {return utgivelsesdato;}
    public ArrayList<Episode> getEpisoder() {return episoder;}
    public int getGjennomsnittligSpilletid() {return gjennomsnittligSpilletid;}
    public int getAntallSessonger() {return antallSessonger;}

    public void setTittel(String tittel) {this.tittel = tittel;}
    public void setBeskrivelse(String beskrivelse) {this.beskrivelse = beskrivelse;}
    
    public void setUtgivelseDato(String utgivelsesdato) {
        this.utgivelsesdato = LocalDate.parse(utgivelsesdato);
    }

    public void leggTilEpisode(Episode episoden) {
        if(episoden.getSesongNr() <= antallSessonger + 1) {
            if(episoden.getSesongNr() > antallSessonger) antallSessonger++;
            episoder.add(episoden);   
        } else {
            System.out.println("----------------------------");
            System.out.println("Feil! Det mangler en sesong.");
            System.out.println("----------------------------");
        }
    }

    public String toString() {
        return tittel + " ble gitt ut i " + utgivelsesdato.getYear() + ". Beskrivelse fra IMDB: " + beskrivelse;  
    }

    public ArrayList<Episode> hentEpisoderISesong(int sesong) {
        ArrayList<Episode> arr = new ArrayList<>();
        for(Episode episode : episoder) {
            if(episode.getSesongNr() == sesong) arr.add(episode);
        }
        return arr;
    }

    public void oppdaterGjennomsnittligSpilletid() {
        int avg = 0;
        for(Episode episode : episoder) {
            avg += episode.getSpilletid();
        }
        avg /= episoder.size();
        gjennomsnittligSpilletid = avg;
    }

    public ArrayList<Rolle> hentRollebesetning() {
        ArrayList<Rolle> arr = new ArrayList<>();
        for (Episode episode : episoder) {
            // arr.addAll(episode.getRoller());

            //bonusoppgave 3.1
            for (Rolle rolle : episode.getRoller()) {
                if (!arr.contains(rolle)) {
                    arr.add(rolle);
                } 
                arr.get(arr.indexOf(rolle)).addEpisode(episode);
            }
        }
        return arr;
    }
}