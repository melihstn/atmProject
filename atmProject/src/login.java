import java.util.Scanner;
public class login {
    public boolean login(hesap hesap){

        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.println("kullanıcı adını giriniz : ");
        kullanici_adi = scanner.nextLine();
        System.out.println("parolayı giriniz : ");
        parola = scanner.nextLine();

        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){

            return true;
        }else{
            return false;
        }
    }

}
