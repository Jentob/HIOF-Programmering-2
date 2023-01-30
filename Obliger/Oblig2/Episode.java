public class Episode {
    private String tittel;
    private int episodeNr;
    private int sesongNr;
    private int spilletid; // Spilletid i sekunder

    public Episode(String tittel, int episodeNr, int sesongNr, int spilletid) {
        this.tittel = tittel;
        this.episodeNr = episodeNr;
        this.sesongNr = sesongNr;
        this.spilletid = spilletid; // I sekunder
    }

    public Episode(String tittel, int episodeNr, int sesongNr) {
        this.tittel = tittel;
        this.episodeNr = episodeNr;
        this.sesongNr = sesongNr;
    }

    public String getTittel() {return tittel;}
    public int getEpisodeNr() {return episodeNr;}
    public int getSesongNr() {return sesongNr;}
    public int getSpilletid() {return spilletid;}

    public void setTittel(String tittel) {this.tittel = tittel;}
    public void setEpisodeNr(int episodeNr) {this.episodeNr = episodeNr;}
    public void setSesongNr(int sesongNr) {this.sesongNr = sesongNr;}
    public void setSpilletid(int spilletid) {this.spilletid = spilletid;}

    @Override
    public String toString() {
        return '"' + tittel + '"' + " er episode " + episodeNr + " av sesong " + sesongNr + " og er " + spilletid / 60 + " minutter lang.";
       }  
}