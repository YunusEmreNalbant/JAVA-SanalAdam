public class Kimlik {

    private String ad;
    private String soyad;
    private int yas;
    private long kimlikno;



    // Yapıcı Metod dolu hali. İçine 4 parametre alır. Bunu elle gireceğiz.
    public Kimlik(String ad, String soyad, int yas, long kimlikno) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.kimlikno = kimlikno;


    }

    public void kimlikBilgileriniGoster() {


        System.out.println("Kimlik Bilgileri Gösteriliyor...");
        System.out.println("Ad: "+ this.ad+ "\n" +
                            "Soyad: " +this.soyad + "\n"+
                            "Yaş: "+this.yas+"\n" +
                            "Kimlik No: " + this.kimlikno+"\n");
    }

    // Yapıcı Metod boş hali. Eğer bilgi gönderilmezse kimliği bulunamadı mesajı döndürecek.
    public Kimlik(){
        System.out.println("Kimliği Bulunamadı!");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public long getKimlikno() {
        return kimlikno;
    }

    public void setKimlikno(long kimlikno) {
        this.kimlikno = kimlikno;
    }
}
