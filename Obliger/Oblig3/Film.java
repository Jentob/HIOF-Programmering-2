public class Film extends Produksjon {
  

    public Film(String tittel, int spilletid, String utgivelsesdato, String beskrivelse, Person regissor) {
        super(tittel, spilletid, utgivelsesdato, beskrivelse, regissor);

    }

    @Override
    public String toString() {
        return "Film - " + super.getTittel();
    }
}
