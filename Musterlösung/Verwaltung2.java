public class Verwaltung2 extends Verwaltung {
    public Verwaltung2() {
        super(new Kurs[10]);
    }
    public void kursHinzufuegen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
        for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] == null) {
                kurse[i] = pKurs;
                return;
            }
        }
    };
    public void kursEntfernen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
        for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] == pKurs) {
                for(int j = i; j < kurse.length-1; j++) {
                    if(kurse[j+1] == null) {
                        break;
                    }
                    else {
                        kurse[j] = kurse[j+1];
                    }
                };
                kurse[kurse.length-1] = null;
                break;
            }
        }
    };
    public int gibAnzahlKurse() {
        Kurs[] kurse = gibKurse();
        int erg = 0;
        for(int i = 0; i < kurse.length && kurse[i] != null; i++) {
            erg++;
        }
        return erg;
    };
}
