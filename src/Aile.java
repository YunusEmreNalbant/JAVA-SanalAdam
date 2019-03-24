public class Aile {

    private String babaAd;
    private String anneAd;


    //Yapıcı metod. Bu metod 2 parametre alır.

    public Aile(String babaAd, String anneAd) {
        this.babaAd = babaAd;
        this.anneAd = anneAd;
    }

    //yapıcı metoda yolladığımız parametreleri ekrana bastıran metod
    public void aileBilgileriGoster() {
        System.out.println("Aile Bilgiler Gösteriliyor...");
        System.out.println("Baba Adı: "+this.babaAd + "\n" +
                           "Anne Adı: " +this.anneAd + " \n");
    }

    // parametre gönderilmediginde cagrilacak yapici metod.
    public Aile() {
        System.out.println("Aile Bilgileri Gösterilemiyor...");
    }

    public String getBabaAd() {
        return babaAd;
    }

    public void setBabaAd(String babaAd) {
        this.babaAd = babaAd;
    }

    public String getAnneAd() {
        return anneAd;
    }

    public void setAnneAd(String anneAd) {
        this.anneAd = anneAd;
    }
}
