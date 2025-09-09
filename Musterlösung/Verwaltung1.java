public class Verwaltung1 extends Verwaltung {
    public Verwaltung1() {
        super(new Kurs[10]);
    }
    public void kursHinzufuegen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
        for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] == null) {
                kurse[i] = pKurs;
                return; //oder break;
            }
        }
    };
    public void kursEntfernen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
        for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] == pKurs) {
                kurse[i] = null;
            }
        }
    };
    public int gibAnzahlKurse() {
        Kurs[] kurse = gibKurse();
        int erg = 0;
        for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] != null) {
                erg++;
            }
        }
        return erg;
    };
}
