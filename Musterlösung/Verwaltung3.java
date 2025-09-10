public class Verwaltung3 {
    /**
     * Konstruktor der Klasse Verwaltung3.
     * Initialisiert die Kursverwaltung mit einem leeren Kurs-Array.
     */
    public Verwaltung3() {
        super(new Kurs[0]);
    }
    
    /**
     * Fügt einen neuen Kurs zum Kurs-Array hinzu.
     * Das Array wird dabei um eine Position vergrößert und alle bisherigen Kurse übernommen.
     *
     * @param pKurs Der Kurs, der hinzugefügt werden soll.
     */
    public void kursHinzufuegen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
        Kurs[] neueKurse = new Kurs[kurse.length + 1];
        for (int i = 0; i < kurse.length; i++) {
            neueKurse[i] = kurse[i];
        }
        neueKurse[kurse.length] = pKurs;
        setzeKurse(neueKurse);
    }
    
    /**
     * Entfernt den angegebenen Kurs aus dem Kurs-Array.
     * Das Array wird dabei um eine Position verkleinert.
     * Falls der Kurs mehrfach vorkommt, wird nur das erste Vorkommen entfernt.
     *
     * @param pKurs Der Kurs, der entfernt werden soll.
     */
    public void kursEntfernen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
        if (kurse.length == 0) {
            return;
        }
    
        Kurs[] neueKurse = new Kurs[kurse.length - 1];
        int aktPos = 0;
        for (int i = 0; i < kurse.length; i++) {
            if (kurse[i] != pKurs) {
                if (aktPos < neueKurse.length) {
                    neueKurse[aktPos] = kurse[i];
                    aktPos++;
                }
            }
        }
    
        // Nur setzen, wenn der Kurs tatsächlich entfernt wurde
        if (aktPos == neueKurse.length) {
            setzeKurse(neueKurse);
        }
    }
    
    /**
     * Gibt die Anzahl der aktuell gespeicherten Kurse zurück.
     *
     * @return Die Länge des Kurs-Arrays.
     */
    public int gibAnzahlKurse() {
        Kurs[] kurse = gibKurse();
        return kurse.length;
    }
}
