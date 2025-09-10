public class Verwaltung2 {
    /**
     * Konstruktor der Klasse Verwaltung2.
     * Initialisiert die Kursverwaltung mit einem Array von 10 Kursen.
     */
    public Verwaltung2() {
        super(new Kurs[10]);
    }
    
    /**
     * Fügt einen Kurs in das erste freie Feld des Kurs-Arrays ein.
     * Falls kein freier Platz vorhanden ist, wird der Kurs nicht hinzugefügt.
     *
     * @param pKurs Der Kurs, der hinzugefügt werden soll.
     */
    public void kursHinzufuegen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
        for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] == null) {
                kurse[i] = pKurs;
                return;
            }
        }
    }
    
    /**
     * Entfernt den angegebenen Kurs aus dem Kurs-Array.
     * Nach dem Entfernen werden alle nachfolgenden Kurse um eine Position nach vorne verschoben,
     * um die entstandene Lücke zu schließen.
     *
     * @param pKurs Der Kurs, der entfernt werden soll.
     */
    public void kursEntfernen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
        for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] == pKurs) {
                for(int j = i; j < kurse.length - 1; j++) {
                    if(kurse[j + 1] == null) {
                        break;
                    } else {
                        kurse[j] = kurse[j + 1];
                    }
                }
                kurse[kurse.length - 1] = null;
                break;
            }
        }
    }
    
    /**
     * Gibt die Anzahl der aktuell gespeicherten (nicht-null) Kurse zurück.
     * Die Zählung endet beim ersten null-Wert, da die Kurse lückenlos gespeichert werden.
     *
     * @return Die Anzahl der belegten Kursplätze im Array.
     */
    public int gibAnzahlKurse() {
        Kurs[] kurse = gibKurse();
        int erg = 0;
        for(int i = 0; i < kurse.length && kurse[i] != null; i++) {
            erg++;
        }
        return erg;
    }
}
