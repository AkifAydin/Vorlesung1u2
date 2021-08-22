public class Uebungen {

    public static boolean isByte(long eingabe){
        return eingabe >= Byte.MIN_VALUE && eingabe <= Byte.MAX_VALUE;
    }

    public static boolean isShort(long eingabe){
        return eingabe >= Short.MIN_VALUE && eingabe <= Short.MAX_VALUE;
    }

    public static boolean isInt(long eingabe){
        return eingabe >= Integer.MIN_VALUE && eingabe <= Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        System.out.println("ue-2-1");
        long wert = 127;
        System.out.println(isByte(wert));
        System.out.println(isShort(wert));
        System.out.println(isInt(wert));
        System.out.println("ue-2-2");
    }

}
