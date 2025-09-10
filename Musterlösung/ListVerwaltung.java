public class ListVerwaltung {
    private List<Kurs> kurse;
        
    public ListVerwaltung(){
        kurse = new List<Kurs>();
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
    public int gibAnzahlKurse(){
        int erg = 0;
        for(kurse.toFirst(); kurse.hasAccess(); kurse.next()) {
            erg++;
        }
        return erg;
    }
}
