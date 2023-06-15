
public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        hesap hesap = new hesap("melih üstün","12345", 2000);


        atm.calis(hesap);
        System.out.println("programdan çıkılıyor...");

    }
}