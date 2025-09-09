/**
 * Konstruktor der Klasse Verwaltung1.
 * Initialisiert die Kursverwaltung mit einem Array von 10 Kursen.
 */
public Verwaltung1() {
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
            return; // oder break;
        }
    }
}

/**
 * Entfernt den angegebenen Kurs aus dem Kurs-Array.
 * Alle Vorkommen des Kurses werden entfernt (gesetzt auf null).
 *
 * @param pKurs Der Kurs, der entfernt werden soll.
 */
public void kursEntfernen(Kurs pKurs) {
    Kurs[] kurse = gibKurse();
    for(int i = 0; i < kurse.length; i++) {
        if(kurse[i] == pKurs) {
            kurse[i] = null;
        }
    }
}

/**
 * Gibt die Anzahl der aktuell gespeicherten (nicht-null) Kurse zurück.
 *
 * @return Die Anzahl der belegten Kursplätze im Array.
 */
public int gibAnzahlKurse() {
    Kurs[] kurse = gibKurse();
    int erg = 0;
    for(int i = 0; i < kurse.length; i++) {
        if(kurse[i] != null) {
            erg++;
        }
    }
    return erg;
}
