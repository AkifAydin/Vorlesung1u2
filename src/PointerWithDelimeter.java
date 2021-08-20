import java.util.Scanner;

public class PointerWithDelimeter {
    private static void reactrash() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }

    public static void main(String[] args) {
        reactrash();
    }
}