public class IlgiAlanlari {

    private String bildigiDiller;
    private String spor;
    private String kitap;
    private String diziler;
    private String filmler;

    public IlgiAlanlari(String bildigiDiller, String spor, String kitap, String diziler, String filmler) {
        this.bildigiDiller = bildigiDiller;
        this.spor = spor;
        this.kitap = kitap;
        this.diziler = diziler;
        this.filmler = filmler;
    }

    public void ilgiAlanlarıBilgileriGoster() {
        System.out.println("İlgi Alanları Gösteriliyor...");

        System.out.println("Bildiği Yazılım Dilleri: "+this.bildigiDiller+"\n"+
                            "Favori Sporu: "+this.spor+"\n"+
                            "Favori Kitabı: "+this.kitap+"\n"+
                            "Favori Dizileri: "+this.diziler+"\n"+
                            "Favori Filmleri: "+this.filmler);
    }

    public IlgiAlanlari() {
        System.out.println("İlgi Alanları Gösterilemiyor...");
    }
    public String getBildigiDiller() {
        return bildigiDiller;
    }

    public void setBildigiDiller(String bildigiDiller) {
        this.bildigiDiller = bildigiDiller;
    }

    public String getSpor() {
        return spor;
    }

    public void setSpor(String spor) {
        this.spor = spor;
    }

    public String getKitap() {
        return kitap;
    }

    public void setKitap(String kitap) {
        this.kitap = kitap;
    }

    public String getDiziler() {
        return diziler;
    }

    public void setDiziler(String diziler) {
        this.diziler = diziler;
    }

    public String getFilmler() {
        return filmler;
    }

    public void setFilmler(String filmler) {
        this.filmler = filmler;
    }
}
