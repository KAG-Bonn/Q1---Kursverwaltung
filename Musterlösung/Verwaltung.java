public abstract class Verwaltung {
    private Kurs[] kurse;

    public Verwaltung() {
    }
    public Verwaltung(Kurs[] pKurse) {
        kurse = pKurse;
    }
    
    public Kurs[] gibKurse() {
        return kurse;
    }
    
    public void setzeKurse(Kurs[] pKurse) {
        kurse = pKurse;
    }
    
    public void kurseAusgeben() {
        for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] != null) {
                System.out.println(kurse[i]);
            }
            else {
                System.out.println("null");
            }
        }
    };
    
    public abstract void kursHinzufuegen(Kurs pKurs);
    public abstract void kursEntfernen(Kurs pKurs);
    public abstract int gibAnzahlKurse();
    
}
