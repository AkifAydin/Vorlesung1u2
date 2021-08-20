import java.util.Scanner;

public class Pointer {
int i;
    private static void readAndTestTypeWithScanner() { // statisch immer dann wenn keine Attribute verwendet werden von der Methode
        //i = 10; // geht nicht da statische Methoden kein zugriff auf Attribute haben kann
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextLong()) {
                long l = sc.nextLong();
                System.out.println("long " + l);
            } else if (sc.hasNext()) {
                String s = sc.next();
                if ("exit".equals(s)) break;
            }
        }
        sc.close();
        System.out.println("bis bald");
    }

    public static void main(String[] args) {
        readAndTestTypeWithScanner();  // Statische Methoden brauchen keine Object erzeugung um sie Ausführen zu können
    }

}

