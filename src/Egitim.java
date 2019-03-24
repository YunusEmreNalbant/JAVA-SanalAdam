public class Egitim {

    private String ilkogretim;
    private String lise;
    private String universite;
    private String okuduguBolum;

    public Egitim(String ilkogretim, String lise, String universite, String okuduguBolum) {
        this.ilkogretim = ilkogretim;
        this.lise = lise;
        this.universite = universite;
        this.okuduguBolum=okuduguBolum;
    }

    public void egitimBilgileriGoster(){
        System.out.println("Egitim Bilgileri Gösteriliyor...");

        System.out.println("İlköğretim: "+this.ilkogretim+ "\n"+
                            "Lise: "+ this.lise+"\n"+
                            "Üniversite: " + this.universite + "\n" +
                            "Okuduğu Bölüm: "+ this.okuduguBolum);
    }


    public Egitim() {
        System.out.println("Egitim Bilgileri Gösterilemiyor...");
    }

    public String getIlkogretim() {
        return ilkogretim;
    }

    public void setIlkogretim(String ilkogretim) {
        this.ilkogretim = ilkogretim;
    }

    public String getLise() {
        return lise;
    }

    public void setLise(String lise) {
        this.lise = lise;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getOkuduguBolum() {
        return okuduguBolum;
    }

    public void setOkuduguBolum(String okuduguBolum) {
        this.okuduguBolum = okuduguBolum;
    }
}
