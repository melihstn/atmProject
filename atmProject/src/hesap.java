public class hesap {

    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Güncel bakiyeniz : " + bakiye);

    }
    public void paraCek(int tutar){

        if(tutar > bakiye ){
            System.out.println("Tutar bakiyeden küçük olamaz!");
        }else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye);
        }

    }
}


























