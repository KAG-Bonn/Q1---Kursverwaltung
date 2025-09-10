/**
 * Die Klasse VerwaltungTester dient zum Testen verschiedener Implementierungen
 * der abstrakten Klasse Verwaltung. Sie erstellt mehrere Verwaltungstypen und
 * führt standardisierte Testläufe durch.
 */
public class VerwaltungTester {
    private ArrayVerwaltung[] verwaltungen;
    private ListVerwaltung vl;
    /**
     * Konstruktor der Klasse VerwaltungTester.
     * Initialisiert die Verwaltungstypen durch Aufruf von {@code reset()}.
     */
    public VerwaltungTester() {
        reset();
    }

    /**
     * Setzt die Verwaltungstypen zurück und initialisiert das Array mit
     * Instanzen von Verwaltung1, Verwaltung2 und Verwaltung3.
     */
    public void reset() {
        verwaltungen = new ArrayVerwaltung[3];
        verwaltungen[0] = new Verwaltung1();
        verwaltungen[1] = new Verwaltung2();
        verwaltungen[2] = new Verwaltung3();
        vl = new ListVerwaltung();
    }

    /**
     * Führt einen Testlauf mit allen Verwaltungstypen durch.
     * Es werden {@code pAnzahl} Kurse hinzugefügt, wobei bei Kurs 3 ein
     * spezieller Kursobjekt verwendet wird und bei Kurs 12 dieser wieder entfernt wird.
     * Anschließend werden die gespeicherten Kurse jeder Verwaltung ausgegeben.
     *
     * @param pAnzahl Die Anzahl der Kurse, die pro Verwaltung hinzugefügt werden sollen.
     */
    public void test(int pAnzahl) {
        reset();
        int aktV = 1;
        /*
            Hier nur Arrayverwaltungen
        */
        for (ArrayVerwaltung v : verwaltungen) {
            Kurs kurs = new Kurs("Kurs 3");
            for (int i = 1; i <= pAnzahl; i++) {
                if (i == 3) {
                    v.kursHinzufuegen(kurs);
                } else {
                    if (i == 12) {
                        v.kursEntfernen(kurs);
                    }
                    v.kursHinzufuegen(new Kurs("Kurs " + i));
                }
            }
            System.out.println("Teste Verwaltung " + aktV + "...:");
            v.kurseAusgeben();
            aktV++;
        }

        /*
            Hier nur Listverwaltung
        */
        for(int i = 1; i < pAnzahl; i++) {
            Kurs kurs = new Kurs("Kurs 3");
            if (i == 3) {
                vl.kursHinzufuegen(kurs);
            } else {
                if (i == 12) {
                    vl.kursEntfernen(kurs);
                }
                vl.kursHinzufuegen(new Kurs("Kurs " + i));
            }
        }
        vl.kurseAusgeben();
    }
}
