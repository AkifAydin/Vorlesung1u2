import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random(256);
        Random rand4 = new Random(256);
        Random rand5 = new Random(257);
        // auch für Boolean, Long, Float, Double
        System.out.println(("rand1.nextBoolean() " + rand1.nextBoolean()));
        System.out.println("rand3.nextLong() " + rand3.nextLong());
        System.out.println("rand4.nextFloat() " + rand4.nextFloat());
        System.out.println("rand5.nextDouble() " + rand5.nextDouble());
// Intervall der Zufallszahlen: [0-10)
        for (int i = 0; i < 30; i++) {
            System.out.println("Iteration " + (i + 1));
            System.out.println("rand1.nextInt(10) " + rand1.nextInt(10));
            System.out.println("rand2.nextInt(10) " + rand2.nextInt(10));
        }

    }
}
