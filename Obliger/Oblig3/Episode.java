public class Episode extends Produksjon {

    private int episodeNr;
    private int sesongNr;

    public Episode(String tittel, int episodeNr, int sesongNr, int spilletid, String utgivelsesdato, String beskrivelse, Person regissor) {
        super(tittel, spilletid, utgivelsesdato, beskrivelse, regissor);

        this.episodeNr = episodeNr;
        this.sesongNr = sesongNr;
    }

    public Episode(String tittel, int episodeNr, int sesongNr, String utgivelsesdato, String beskrivelse, Person regissor) {
        super(tittel, utgivelsesdato, beskrivelse, regissor);

        this.episodeNr = episodeNr;
        this.sesongNr = sesongNr;
    }

    public int getEpisodeNr() {return episodeNr;}
    public int getSesongNr() {return sesongNr;}

    public void setEpisodeNr(int episodeNr) {this.episodeNr = episodeNr;}
    public void setSesongNr(int sesongNr) {this.sesongNr = sesongNr;}
 
    @Override
    public String toString() {
        return '"' + super.getTittel() + '"' + " er episode " + episodeNr + " av sesong " + sesongNr + " og er " + super.getSpilletid() / 60 + " minutter lang.";
       }  
}