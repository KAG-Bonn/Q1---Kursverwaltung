/**
 * Die Klasse Hauptprogramm enthält die main-Methode und dient als Einstiegspunkt
 * für die Ausführung des Programms. Sie führt Testläufe mit verschiedenen
 * Kursanzahlen durch, um die Funktionalität der Verwaltungsklassen zu überprüfen.
 */
public class Hauptprogramm {

    /**
     * Privater Konstruktor, um die Instanziierung der Klasse zu verhindern.
     * Diese Klasse wird ausschließlich über die main-Methode verwendet.
     */
    private Hauptprogramm() {
        // Keine Instanziierung vorgesehen
    }

    /**
     * Die main-Methode startet das Programm und führt mehrere Testläufe
     * mit unterschiedlichen Kursanzahlen durch. Dabei wird die VerwaltungTester-Klasse
     * verwendet, um Verwaltung1, Verwaltung2 und Verwaltung3 zu testen.
     *
     * @param args Kommandozeilenargumente (werden nicht verwendet).
     */
    public static void main(String[] args) {
        VerwaltungTester tester = new VerwaltungTester();
        System.out.println("Teste mit 5 Kursen...");
        tester.test(5);
        System.out.println("Teste mit 10 Kursen...");
        tester.test(10);
        System.out.println("Teste mit 15 Kursen...");
        tester.test(15);
        System.out.println("Teste mit 20 Kursen...");
        tester.test(20);
    }
}
