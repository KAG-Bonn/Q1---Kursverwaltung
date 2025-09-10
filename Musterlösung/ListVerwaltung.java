public class ListVerwaltung {
    private List<Kurs> kurse;
        
    public ListVerwaltung(){
        kurse = new List<Kurs>();
    }

    public List<Kurs> gibKurse() {
        return kurse;
    }

    public void kursHinzufuegen(Kurs pKurs) {
        kurse.append(pKurs);
    }
    public void kursEntfernen(Kurs pKurs) {
        kurse.toFirst();
        while(kurse.hasAccess()) {
            Kurs aktKurs = kurse.getContent();
            if(aktKurs == pKurs) {
                kurse.remove();
                return;
            }
            else {
                kurse.next();
            }
        }
    }

    /**
     * Gibt die Anzahl der aktuell verwalteten Kurse zurück.
     *
     * @return Die Anzahl der Kurse im Kurs-Array.
    */
    public int gibAnzahlKurse(){
        int erg = 0;
        for(kurse.toFirst(); kurse.hasAccess(); kurse.next()) {
            erg++;
        }
        return erg;
    }

    /**
     * Gibt alle Kursbeschreibungen aus.
    */
    public void kurseAusgeben(){
        for(kurse.toFirst(); kurse.hasAccess(); kurse.next()) {
            System.out.println(kurse.getContent());
        }
    }
}
