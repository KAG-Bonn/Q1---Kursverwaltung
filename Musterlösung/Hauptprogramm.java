public class Hauptprogramm {
    private Hauptprogramm() {
        
    }
    
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
