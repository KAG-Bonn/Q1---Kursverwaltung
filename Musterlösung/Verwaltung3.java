public class Verwaltung3 extends Verwaltung {
    public Verwaltung3() {
        super(new Kurs[0]);
    }
    
    public void kursHinzufuegen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
	Kurs[] neueKurse = new Kurs[kurse.length+1];
	for(int i = 0; i < kurse.length; i++) {
		neueKurse[i] = kurse[i];
	}
	neueKurse[kurse.length] = pKurs;
	setzeKurse(neueKurse);
    }
    
    public void kursEntfernen(Kurs pKurs) {
        Kurs[] kurse = gibKurse();
    	if(kurse.length == 0) {
            return;    
        }
        
        Kurs[] neueKurse = new Kurs[kurse.length-1];
    	int aktPos = 0;
    	for(int i = 0; i < kurse.length; i++) {
            if(kurse[i] != pKurs) {
                neueKurse[aktPos] = kurse[i];
        	aktPos++;
            }	
    	}
    }
    

    public int gibAnzahlKurse() {
        Kurs[] kurse = gibKurse();
        return kurse.length;
    };
}
