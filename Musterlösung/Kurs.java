/**
 * Die Klasse Kurs repräsentiert einen einzelnen Kurs mit einer Beschreibung.
 */
public class Kurs {
    private String beschreibung;

    /**
     * Konstruktor für die Klasse Kurs.
     * Initialisiert den Kurs mit einer gegebenen Beschreibung.
     *
     * @param pBeschreibung Die Beschreibung des Kurses.
     */
    public Kurs(String pBeschreibung) {
        beschreibung = pBeschreibung;
    }

    /**
     * Gibt die Beschreibung des Kurses zurück.
     *
     * @return Die Beschreibung als String.
     */
    public String gibBeschreibug() {
        return beschreibung;
    }

    /**
     * Setzt eine neue Beschreibung für den Kurs.
     *
     * @param pBeschreibung Die neue Beschreibung des Kurses.
     */
    public void setzeBeschreibung(String pBeschreibung) {
        beschreibung = pBeschreibung;
    }

    /**
     * Gibt die Beschreibung des Kurses als String zurück.
     * Diese Methode wird automatisch aufgerufen, wenn ein Kurs-Objekt
     * als String dargestellt werden soll (z. B. in {@code System.out.println}).
     *
     * @return Die Beschreibung des Kurses.
     */
    public String toString() {
        return beschreibung;
    }
}
