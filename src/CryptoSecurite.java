public class CryptoSecurite {
    public static String str = "";


    public CryptoSecurite() {

    }

    public static void crypt(String message, int decallage) {
        message = message.replaceAll("[^a-zA-Z0], ' '", "");

        for (int i = 0; i < message.length(); i++) {
            int a = message.charAt(i);
            if (a != 32) {
                a += decallage;
                if (a > 122) {
                    a -= 26;
                }
            }
            str += Character.toString((char) a);
        }


        System.out.println(str);

    }
}
