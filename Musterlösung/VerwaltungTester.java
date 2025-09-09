public class VerwaltungTester {
    private Verwaltung[] verwaltungen;
    private Verwaltung v1;
    private Verwaltung v2;
    private Verwaltung v3;
    public VerwaltungTester() {
        reset();
    }
    
    public void reset() {
        verwaltungen = new Verwaltung[3];
        verwaltungen[0] = new Verwaltung1();
        verwaltungen[1] = new Verwaltung2();
        verwaltungen[2] = new Verwaltung3();
    }
    public void test(int pAnzahl) {
        reset();
        int aktV = 1;
        for(Verwaltung v : verwaltungen) {
            Kurs kurs = new Kurs("Kurs 3");
            for(int i = 1; i <= pAnzahl; i++) {
                if(i == 3) {
                    v.kursHinzufuegen(kurs);
                }
                else {
                    if(i == 12) {
                        v.kursEntfernen(kurs);
                    }
                    v.kursHinzufuegen(new Kurs("Kurs " + i));
                }
            }
            System.out.println("Teste Verwaltung " + aktV + "...:");
            v.kurseAusgeben();
            aktV++;
        }
    }

}
