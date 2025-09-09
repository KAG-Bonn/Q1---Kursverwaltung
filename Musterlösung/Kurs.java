public class Kurs {
    private String beschreibung;

    public Kurs(String pBeschreibung) {
        beschreibung = pBeschreibung;
    }

    public String gibBeschreibug() {
        return beschreibung;
    }
    
    public void setzeBeschreibung(String pBeschreibung) {
        beschreibung = pBeschreibung;
    }
    
    public String toString() {
        return beschreibung;
    }
}
