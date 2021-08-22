import java.util.Scanner;

public class Uebungen {
    //ue-2-1

    public static boolean isByte(long eingabe) {
        return eingabe >= Byte.MIN_VALUE && eingabe <= Byte.MAX_VALUE;
    }

    public static boolean isShort(long eingabe) {
        return eingabe >= Short.MIN_VALUE && eingabe <= Short.MAX_VALUE;
    }

    public static boolean isInt(long eingabe) {
        return eingabe >= Integer.MIN_VALUE && eingabe <= Integer.MAX_VALUE;
    }

    //ue-2-2
    public static boolean numberOverflowPlus(byte b1, byte b2) {
        byte ergebnis = (byte) (b1 + b2);
        return isByte(ergebnis) && isShort(ergebnis) && isInt(ergebnis);
    }

    //ue-2-5
    public static void numberOfZeichenklassen(String eingabe) {
        int ziffer = 0;
        int bu = 0;
        int kbu = 0;
        int gbu = 0;
        int lz = 0;

        for (char c : eingabe.toCharArray()) {
            //System.out.println(c);
            if (Character.isWhitespace(c)) {
                lz++;
            } else if (Character.isDigit(c)) {
                ziffer++;
            } else if (Character.isLowerCase(c)) {
                kbu++;
            } else if (Character.isUpperCase(c)) {
                gbu++;
            }
            if (Character.isLetter(c)) {
                bu++;
            }

        }
        System.out.println("Ziffer:" + ziffer + " Buchstaben:" + bu + " Kleinbuchstaben:" +
                kbu + " Großbuchstaben:" + gbu + " Leerzeichen: " + lz);
    }

    private static void demoShort() {
        System.out.println(("Short Demo"));
        short j,k,i;
// Werte zwischen 1 und 100
        j = 135;
        System.out.println(("j : " + j));
        k = 70;
        System.out.print("k : " + k);
        System.out.print("j + k : " + (i=(short)(j+k))); //(Casting korrekt)
        //System.out.print("j - k : " + (i=j-k));
        //System.out.print("k / j : " + (i=k/j));
        //System.out.print("k * j : " + (i=k*j));
        //System.out.print("k % j : " + (i=k%j));
    }

    public static void main(String[] args) {
        System.out.println("ue-2-1");
        long wert = 127;
        System.out.println(isByte(wert));
        System.out.println(isShort(wert));
        System.out.println(isInt(wert));
        System.out.println("ue-2-2");
        byte i1, i2;
        i1 = 100;
        i2 = 27;
        System.out.println(numberOverflowPlus(i1, i2));
        System.out.println("ue-2-3");
        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            System.out.println("Geben sie Wert 1 ein!");
//            long eingabe1 = Long.parseLong(sc.next());
//            if (isInt(eingabe1)) {if (isShort(eingabe1)) {if (isByte(eingabe1)) {
//                System.out.println("Eingabe.1 ist ein Byte wert");
//            }}else {
//                System.out.println("Eingabe.1 ist ein Short wert");
//            }}else {System.out.println("Eingabe.1 ist ein Int wert");
//            }
//            //long eingabe1 = Long.parseLong(sc.next());
//            System.out.println("Geben sie Wert 2 ein!");
//            long eingabe2 = Long.parseLong(sc.next());
//            System.out.println(eingabe1+eingabe2);
//        }
        //ue-2-5
        System.out.println("ue-2-5");
        String text = sc.nextLine();
        numberOfZeichenklassen(text);
        demoShort();
    }

}
