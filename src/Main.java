import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisisez votre message : ");
        String message = sc.nextLine();
        CryptoSecurite.crypt(message,10);
    }
}
