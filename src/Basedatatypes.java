public class Basedatatypes {
        public static void main(String[] args) {
            char c1, c2, c3;
            c1 = 226; // int Darstellung
            c2 = '\u00E2'; // Unicode Darstellung (Hexadezimal 4 Stellen)
            c3 = 'â'; // Zeichendarstellung

            print("c1 : " + c1);
            print("c2 : " + c2);
            print("c3 : " + c3);
            print("c1 int value : " + (int) c1); // Umwandeln in int
            print("c2 int value : " + (int) c2); // Umwandeln in int
            print("c3 int value : " + (int) c3); // Umwandeln in int

        }

        private static void print(String string) {
            System.out.println(string);
        }
}
