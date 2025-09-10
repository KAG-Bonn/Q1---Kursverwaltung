/**
 * Die Klasse ArrayVerwaltung beschreibt den geteilten Aufbau der Verwaltungs-Klassen.
 */
public class ArrayVerwaltung {
  private Kurs[] kurse;

  /**
 * Erstellt ein Objekt der Klasse Verwaltung.
  */

  public ArrayVerwaltung(){
  }
  
/**
 * Fügt einen neuen Kurs zur Verwaltung hinzu.
 * Die konkrete Implementierung entscheidet, wie und wo der Kurs eingefügt wird.
 *
 * @param pKurs Der Kurs, der hinzugefügt werden soll.
 */
public abstract void kursHinzufuegen(Kurs pKurs);

/**
 * Entfernt einen Kurs aus der Verwaltung.
 * Die konkrete Implementierung entscheidet, wie der Kurs identifiziert und entfernt wird.
 *
 * @param pKurs Der Kurs, der entfernt werden soll.
 */
public abstract void kursEntfernen(Kurs pKurs);

/**
 * Gibt die Anzahl der aktuell verwalteten Kurse zurück.
 *
 * @return Die Anzahl der Kurse im Kurs-Array.
 */
public abstract int gibAnzahlKurse();
}
