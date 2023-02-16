import java.util.ArrayList;

public class Rolle {
    private String rolleFornavn;
    private String rolleEtternavn;
    private Person skuespiller;
    private final ArrayList<Episode> episoder = new ArrayList<>();
    private final ArrayList<Film> filmer = new ArrayList<>();

    public Rolle(String rolleFornavn, String rolleEtternavn, Person skuespiller) {
        this.rolleFornavn = rolleFornavn;
        this.rolleEtternavn = rolleEtternavn;
        this.skuespiller = skuespiller;
    }

    public String getRolleFornavn() {return rolleFornavn;}
    public String getRolleEtternavn() {return rolleEtternavn;}
    public Person getSkuespiller() {return skuespiller;}
    public ArrayList<Episode> getEpisoder() {return episoder;}
    public ArrayList<Film> getFilmer() {return filmer;}


    public void setRolleFornavn(String rollefornavn) {this.rolleFornavn = rollefornavn;}
    public void setRolleEtternavn(String rolleEtternavn) {this.rolleEtternavn = rolleEtternavn;}
    public void setSkuespiller(Person skuespiller) {this.skuespiller = skuespiller;}

    public String getRolleNavn() {
        return rolleFornavn + " " + rolleEtternavn;
    }

    @Override
    public String toString() {
        return "Rolle - " + getRolleNavn() + " - Spilles av " + skuespiller.getFullName();
    }


    public void addEpisode(Episode episode) {episoder.add(episode);}
    public void addFilm(Film film) {filmer.add(film);}

    public int getAntallEpisoder() {return episoder.size();}
    public int getAntallFilmer() {return filmer.size();}


}
