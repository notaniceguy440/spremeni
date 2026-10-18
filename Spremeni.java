public class Spremeni {

    public static String spremeni(String s) {
        int n = s.length();
        int pol = n / 2;

        if (n % 2 == 0) {
            // sodo število znakov: vstavi # med obe polovici
            return s.substring(0, pol) + "#" + s.substring(pol);
        } else {
            // liho število znakov: sredinski znak zamenjaj z #
            return s.substring(0, pol) + "#" + s.substring(pol + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(spremeni("1234")); // 12#34
        System.out.println(spremeni("932"));  // 9#2
    }
}
