import java.time.LocalDate;
import java.util.ArrayList;

abstract class Produksjon {

    private String tittel;
    private int spilletid;
    private LocalDate utgivelsesdato;
    private String beskrivelse;
    private Person regissor;
    private final ArrayList<Rolle> roller = new ArrayList<>();

    public Produksjon(String tittel, int spilletid, String utgivelsesdato, String beskrivelse, Person regissor) {
        this.tittel = tittel;
        this.spilletid = spilletid; // sekunder
        this.utgivelsesdato = LocalDate.parse(utgivelsesdato); // "yyyy-mm-dd"
        this.beskrivelse = beskrivelse;
        this.regissor = regissor;
    }

    public Produksjon(String tittel, String utgivelsesdato, String beskrivelse, Person regissor) {
        this.tittel = tittel;
        this.utgivelsesdato = LocalDate.parse(utgivelsesdato);
        this.beskrivelse = beskrivelse;
        this.regissor = regissor;
    }

    public String getTittel() {return tittel;}
    public int getSpilletid() {return spilletid;}
    public LocalDate getUtgivelsesdato() {return utgivelsesdato;}
    public String getBeskrivelse() {return beskrivelse;}
    public Person getRegissor() {return regissor;}
    public ArrayList<Rolle> getRoller() {return roller;}


    public void setTittel(String tittel) {this.tittel = tittel;}
    public void setSpilletid(int spilletid) {this.spilletid = spilletid;}
    public void setUtgivelsesdato(String utgivelsesdato) {this.utgivelsesdato = LocalDate.parse(utgivelsesdato);} // "yyyy-mm-dd"
    public void setBeskrivelse(String beskrivelse) {this.beskrivelse = beskrivelse;}
    public void setRegissor(Person person) {this.regissor = person;}

    public void leggTilEnRolle(Rolle enRolle) {
        roller.add(enRolle);
    }

    public void leggTilMangeRoller(ArrayList<Rolle> flereRoller) {
        roller.addAll(flereRoller);
    }

    @Override
    public String toString() {
        return "Produskjon - " + tittel;
    }
}
