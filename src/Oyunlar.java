public class Oyunlar {

    private String oyunlar;

    public Oyunlar(String oyunlar) {
        this.oyunlar = oyunlar;
    }

    public void oyunlarBilgileriGoster() {
        System.out.println("Oyun Bilgileri Gösteriliyor...");

        System.out.println("Sevdiği Oyunlar: "+this.oyunlar+"\n");

    }

    public Oyunlar() {
        System.out.println("Oyun Bilgileri Gösterilemiyor...");
    }

    public String getOyunlar() {
        return oyunlar;
    }

    public void setOyunlar(String oyunlar) {
        this.oyunlar = oyunlar;
    }
}
