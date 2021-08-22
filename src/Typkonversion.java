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
        s5 = s5 + s6;
        char c8 = 5;
        char c9 = 9;
        c8 = c8 + c9;
        byte b1 = 3;
        byte b2 = 15;
        b1 = b1 / b2;
        char c1 = 'a';
        char c2 = 'b';
        c1 = c1 - c2;
        int i; i = s2 + s1;
        i = c1 - c2;
        i = b1 / b2;
        float f = 14.7f;
        Math.pow(f,f);
        f = i + s1 + b1;
        f = c1 / s2;
        f = Math.pow(f,f);
        f = d / c1;
        double d;
        d = f - c2;
        d = Math.pow(f,f);;
        System.out.println(d1);
    }
}
