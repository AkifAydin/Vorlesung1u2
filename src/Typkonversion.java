import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Typkonversion {
    public static void main(String[] args) {
        short s1 = 4;
        short s2 = 6;
        char c1;
        char c2 = 134;
        byte b = 14;
        byte b1 = 13;

        s2 = b;
        int i;

        i = c2;
        i = s2;
        i = b;
        float f;
        f = s2;
        long l = 1678;
        f = l;
        f = c2;
        double d;
        d = c2; // c1 nicht initialisiert
        d = b;
        d = s1;
        d = l;
        d = f;
        d = i;
        System.out.println(c2);
        //c1 = s2;
        //char c1,c2=134;   //134=
        s1 = ++s1;
        s1 %= 4;
        //s1 = s1 % 4;  //java bereitstellung des ergebnisses als int Datentyp
        b1 = --b1;
        b1 -= 5;
       // b1 = b1 - 5;

        int i5 = 56788;
        i5 = i5 - 17;
        long l1 = 5435098;
        l1 = l1++;
        l1 -= 17;
        l1 = l1 - 17;

        double d1 = 1.4;
        d1 = d1++;
        d1 -= 17;
        d1 = d1 -17;
        float f5 = 0.3F;
        f5 -= 1;
        f5 = f5 -2;
        short s5=4;
        short s6=6;
        s5 = (short) (s5 + s6);
        char c8 = 5;
        char c9 = 9;
        byte b2 = 15;
        b1 = (byte) (b1 / b2);
        i = b1 / b2;
        Math.pow(f,f);
        f = i + s1 + b1;
        f = (float) Math.pow(f,f);
        d = f - c2;
        d = Math.pow(f,f);
        int i3 = 3;
        i3 = (int) (i3 +l); //coercion wenn zwei verschiedene Datentypen miteinander addiert werden, wird das größere Datentyp gecastet als ergebnis bereitgestellt.
        System.out.println(d1);
        //ue-2-8
        System.out.println("ue-2-8");
        int i9;
        i9 = Integer.MAX_VALUE;
        System.out.println(i9);  //max = 2147483647
        i9 = i9 * 2;
        System.out.println(i9);  //verdopplung -2   (Das Ergebnis ist -2)
        // ue-2-9
        System.out.println("ue-2-9");
        byte b9;
        b9 = Byte.MAX_VALUE;
        System.out.println(Byte.MAX_VALUE*2);  //Ergebnis wird als Int ausgegenem
        //b9 = b9 * 2;   //coercion Wertebereich wird verlassen und kleiner als Int, daher casting in Int-
        String a,x,c;
        a = "Onur";
        x = " Akif";
        c = a+x;
        System.out.println(c);
        System.out.println("3" + 9);
        System.out.println("3" + "9");
        long l2 = 123455;
        int i6 = 2132;
        i6 = (int) l2;
        long ll = Long.MIN_VALUE;
        ll = Integer.MIN_VALUE;
        System.out.println(ll);
        int ii = Integer.MAX_VALUE;
        ii = (int)ll;
        System.out.println(ii);
        System.out.println("Autoboxing und Autounboxing");
        Integer integer = 4;
        int z = integer;
        System.out.println(z);
        List<Integer> v = new ArrayList<Integer>();
        v.add(3); // autoboxing
        int y = v.get(0); //autounboxing
        System.out.println(y);
        Double d5 = new Double(4) + new Double(17);
        System.out.println(d5);
        d = new Double(4) + new Byte( (byte)17 );
        d = new Double(4) + 17;
        d = 17;
        //Double d = new Integer(17);
        Random rand1 = new Random();
        System.out.println("rand1.nextBoolean() " + rand1.nextBoolean());
    }
}
